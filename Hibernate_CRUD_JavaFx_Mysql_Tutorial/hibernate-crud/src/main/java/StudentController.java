import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.module.Student;
import javafx.event.ActionEvent;
import net.javaguides.hibernate.module.Student;
import net.javaguides.hibernate.util.Hibernate;

public class StudentController {

    @FXML
    private Button insert;

    @FXML
    private Button update;

    @FXML
    private Button delete;

    @FXML
    private TextField name;

    @FXML
    private TextField lastname;

    @FXML
    private TextField email;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> c1;

    @FXML
    private TableColumn<?, ?> c2;

    @FXML
    private TableColumn<?, ?> c3;

    @FXML
    private TableColumn<?, ?> c4;

    @FXML
    void Delete(ActionEvent event) {

    }

    @FXML
    void Insert(ActionEvent event) {
    	 StudentDao studentdao= new StudentDao();
    	Student student=new Student(name.getText(),lastname.getText(),email.getText());
   	 studentdao.saveStudent(student);
    }

    @FXML
    void Update(ActionEvent event) {

    }

}
