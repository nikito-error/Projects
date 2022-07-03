/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolupr2;

import java.awt.Button;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
        String myUrl = "jdbc:mysql://127.0.0.1:3306/univercitydb?autoReconnect=true&useSSL=false";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, "root", "asdasdasd123");
        // our SQL SELECT query.
        // if you only need a few columns, specify them by name instead of using "*"
        // create the java statement
        return conn.createStatement();
    }
     public void AddGroups(String sql) {
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
    }  public void SelectTableStudents(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String fn_students=String.valueOf(rs.getInt("fn_students"));
          String name=rs.getString("name");
          String last_name=rs.getString("last_name");
          String group=rs.getString("Gname");
          String grades=String.valueOf(rs.getInt("grades"));
          String tbdata[]={fn_students,name,last_name,group,grades};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}
    
}
    public void SelectTableTeachers(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String idteachers=String.valueOf(rs.getInt("idteachers"));
          String name=rs.getString("name");
          String last_name=rs.getString("last_name");
          String group=rs.getString("Gname");
          String tbdata[]={idteachers,name,last_name,group};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}  
}
     public void SelectTableGroups(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String id=String.valueOf(rs.getInt("idgroups"));
          String name=rs.getString("Gname");
          String specialty=rs.getString("specialty");
          String tbdata[]={id,name,specialty};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}
    
}
      public void SelectTableSubjects(JTable table,String sql){
        try{ 
            
      Statement st=connection();
      ResultSet rs=st.executeQuery(sql);
      while(rs.next()){
          String id=String.valueOf(rs.getInt("id_subjects"));
          String name=rs.getString("Sname");
          String grade=rs.getString("Sgrade");
          String teacher=rs.getString("Tname");
          String tbdata[]={id,name,grade,teacher};
          DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
          tblModel.addRow(tbdata);
      }
     }catch (Exception e){
    e.printStackTrace();
}
    
}
     public void DeleteGroups(String sql){
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
      public void UpdateGroups(String sql){
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
             String query = "SELECT * FROM univercitydb.groups";
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("Gname");   
                names.addItem(rs.getString("Gname"));
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }

    }
      public void combo3(JComboBox names)
    {
          try { 
              Statement st=connection();
             String query = "SELECT * FROM univercitydb.teachers";
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("name")+" "+rs.getString("last_name");   
                names.addItem(name);
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
                String name = rs.getString("idgroups");   
               return name;
                    
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }
          return " ";

}
        public String SelectedItem1(String sql){
       
          try { 
              Statement st=connection();
             String query = sql;
             ResultSet rs = st.executeQuery(query);

             while (rs.next())
             {      
                String name = rs.getString("idteachers");   
               return name;
                    
             }//end while
             } catch (Exception e) {
                  e.printStackTrace();
             }
          return " ";

}
}
    
