/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carssystem;

import java.awt.Button;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Databasea {
    Statement connection() throws SQLException, ClassNotFoundException {
        String myDriver = "com.mysql.cj.jdbc.Driver";
        String myUrl = "jdbc:mysql://127.0.0.1:3306/carssystem?autoReconnect=true&useSSL=false";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, "root", "asdasdasd123");
        // our SQL SELECT query.
        // if you only need a few columns, specify them by name instead of using "*"
        // create the java statement
        return conn.createStatement();
    }
     public void Insert(String sql) {
        try {

            // create our mysql database connection
            Statement st = connection();
            // execute the query, and get a java resultset

            int rs = st.executeUpdate(sql);
            // iterate through the java resultset
            if (rs != 0) {

              JOptionPane.showMessageDialog(null, "Insert successful into database", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }  public void SelectTableAvailable(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String reg_number=rs.getString("reg_number");
          String numberRam=rs.getString("numberRam");
          String name=rs.getString("name");
          String year=String.valueOf(rs.getInt("year"));
          String price=String.valueOf(rs.getDouble("price"));
           String color=rs.getString("color");
            String hara=rs.getString("haracterisitcs");
             String available=String.valueOf(rs.getInt("available"));
             String available1;
             if(available.equals("1")){
                 available1="Yes";
             }else{
                 available1="No";
             }
          String tbdata[]={reg_number,numberRam,name,year,price,color,hara,available1};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}
    
}
    public void SelectTableClients(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String egn=rs.getString("egn");
          String name=rs.getString("name");
          String phone=rs.getString("phone");
          String address=rs.getString("address");
          String tbdata[]={egn,name,phone,address};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}  
        
    }
     public void SelectTableCars(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String id=String.valueOf(rs.getInt("id_sellCars"));
          String date=rs.getString("dateOfSell");
          String egn=rs.getString("egn");
          String reg=rs.getString("reg_number");
          String tbdata[]={id,date,egn,reg};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}  
        
}
     public void SelectTableQuery2(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String date=rs.getString("dateOfSell");
          String egn=rs.getString("egn");
          String reg=rs.getString("reg_number");
          String name=rs.getString("name");
          String phone=rs.getString("phone");
          String address=rs.getString("address");
          String tbdata[]={date,egn,reg,name,phone,address};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}  
        
}
     public void SelectTableQuery5(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String date=rs.getString("name");
          String egn=rs.getString("address");
          String reg=rs.getString("phone");
          String name=rs.getString("m.name");
          String tbdata[]={date,egn,reg,name};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}  
        
}
     public void SelectTableMarki(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String id=String.valueOf(rs.getInt("id_marka"));
          String name=rs.getString("name");
          String tbdata[]={id,name};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}
    
}
     public void Delete(String sql){
         try {
            // create our mysql database connection
            Statement st = connection();
            // execute the query, and get a java resultset

            int rs = st.executeUpdate(sql);
            // iterate through the java resultset
            if (rs != 0) {

              JOptionPane.showMessageDialog(null, "Delete successful into database", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
         
     }
      public void Update(String sql){
         try {
            // create our mysql database connection
            Statement st = connection();
            // execute the query, and get a java resultset

            int rs = st.executeUpdate(sql);
            // iterate through the java resultset
            if (rs != 0) {

              JOptionPane.showMessageDialog(null, "Update successful into database", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
         
     }
     public void combo(JComboBox names)
    {
          try { 
              Statement st=connection();
             String query = "SELECT * FROM carssystem.marka";
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("name");   
                names.addItem(rs.getString("name"));
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }

    }
     public void combo1(JComboBox names)
    {
          try { 
              Statement st=connection();
             String query = "SELECT * FROM carssystem.clients";
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("egn");   
                names.addItem(rs.getString("egn"));
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }

    }
     public void combo2(JComboBox names)
    {
          try { 
              Statement st=connection();
             String query = "SELECT * FROM carssystem.availablecars";
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("reg_number");   
                names.addItem(rs.getString("reg_number"));
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }

    }
     public void combo3(JComboBox names)
    {
          try { 
              Statement st=connection();
             String query = "SELECT * FROM carssystem.availablecars where available=1";
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("reg_number");   
                names.addItem(rs.getString("reg_number"));
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }

    }
       public String SelectedItem(String sql){
       
          try { 
              Statement st=connection();
             String query = sql;
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("id_marka");   
               return name;
                    
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }
          return " ";

}
       public boolean textFieldChange(Double p)
       {
           if(p>0){
               return true;
           }else{
           
            JOptionPane.showMessageDialog(null, "Price Cannot be under zero!Please add another price!");
        return false;
           }
       }
}
    
