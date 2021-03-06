package Automobile;

import Automobile.DataClassModel;
import Automobile.DatabaseClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.sql.SQLException;

public class AddBrandController  {
    DatabaseClass p=new DatabaseClass();
    DataClassModel f=new DataClassModel();
    @FXML
    private Label lb_register;

    @FXML
    private TextField brand_name;

    @FXML
    private TableView<DatabaseClass> brandTable;

    @FXML
    private TableColumn<DatabaseClass, Integer> ID;

    @FXML
    private TableColumn<DatabaseClass, String> Name;
    @FXML
    private TextField search;
    @FXML
    private Label lb_register1;
    @FXML
    void AddB(ActionEvent event) {
        try {
            String name = brand_name.getText();
            String query="Select marka from marka where marka='"+name+"'";
           if(brand_name.getText().isEmpty()){
               Alert a = new Alert(Alert.AlertType.ERROR);
               a.setContentText("Name Cannot be empty");
               a.show();
           }else if (p.selectAll(name,query,"marka")) {

           }else if(brand_name.getText().length()>20){
               Alert a = new Alert(Alert.AlertType.ERROR);
               a.setContentText("Name Cannot be more than 20 chars");
               a.show();
           }
            else{
               p.AddBrand(name);
              p.displayBrand(ID,Name,brandTable);
           }


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void startUpdate() throws SQLException, ClassNotFoundException {
        brandTable.setOnMouseClicked((MouseEvent e) -> {
            if (e.getClickCount() > 1) {
                try {
                    onEdit();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
       p.displayBrand(ID, Name, brandTable);
    }
    public void onEdit() throws SQLException, ClassNotFoundException {
        // check the table's selected item and get selected item
        String name = brand_name.getText();
        String query="Select marka from marka where marka='"+name+"'";
        if(brand_name.getText().isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Name Cannot be empty");
            a.show();
        }else if (p.selectAll(name,query,"marka")) {

        }else {
            if (brandTable.getSelectionModel().getSelectedItem() != null) {
                DatabaseClass data = brandTable.getSelectionModel().getSelectedItem();
                 name = brand_name.getText();
                int id = data.getId();
                p.UpdateBrand(id, name);
                p.displayBrand(ID, Name, brandTable);
            }
        }
    }

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {
       startUpdate();
        search.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                String name = search.getText();
                p.SelectBrand(name,ID, Name, brandTable);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if(search.getText().isEmpty()){
                try {
                    startUpdate();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}

