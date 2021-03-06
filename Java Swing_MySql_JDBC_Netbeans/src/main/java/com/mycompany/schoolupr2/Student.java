/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.schoolupr2;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class Student extends javax.swing.JFrame {
    String name1;
    String fn1;
    String group1;

    private Student(String name1, String group1, String fn1) {
        this.name1=name1;
        this.group1=group1;
        this.fn1=fn1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setFn1(String fn1) {
        this.fn1 = fn1;
    }

    public void setGroup1(String group1) {
        this.group1 = group1;
    }

    public String getName1() {
        return name1;
    }

    public String getFn1() {
        return fn1;
    }

    public String getGroup1() {
        return group1;
    }
    ArrayList<Student> list = new ArrayList<Student>();

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public ArrayList<Student> getList() {
        return list;
    }
    /**
     * Creates new form Univercity
     */
    public Student() {
        initComponents();
         Databasea dao = new Databasea();
           String sql1="select s.fn_students,s.name,s.last_name,g.Gname,s.grades from univercitydb.students s INNER JOIN univercitydb.groups g on s.group=g.idgroups";
        dao.SelectTableStudents(table1,sql1);
        dao.combo(groups);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Gback = new javax.swing.JButton();
        fn = new javax.swing.JTextField();
        fn_students = new javax.swing.JLabel();
        last_name = new javax.swing.JTextField();
        namea = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        name2 = new javax.swing.JLabel();
        groups = new javax.swing.JComboBox<>();
        name3 = new javax.swing.JLabel();
        grades = new javax.swing.JTextField();
        name4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("??????????????");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 159, 42));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        Gback.setText("Back");
        Gback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbackActionPerformed(evt);
            }
        });
        getContentPane().add(Gback, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, -1, -1));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 166, 35));

        fn_students.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fn_students.setForeground(new java.awt.Color(240, 240, 240));
        fn_students.setText("fn_students");
        getContentPane().add(fn_students, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));
        getContentPane().add(last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 166, 36));

        namea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namea.setForeground(new java.awt.Color(240, 240, 240));
        namea.setText("name");
        getContentPane().add(namea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        getContentPane().add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 166, 37));

        name2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name2.setForeground(new java.awt.Color(240, 240, 240));
        name2.setText("last_name");
        getContentPane().add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 84, -1));

        groups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsActionPerformed(evt);
            }
        });
        getContentPane().add(groups, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 166, 34));

        name3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name3.setForeground(new java.awt.Color(240, 240, 240));
        name3.setText("groups");
        getContentPane().add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 58, -1));
        getContentPane().add(grades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 166, 36));

        name4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name4.setForeground(new java.awt.Color(240, 240, 240));
        name4.setText("grades");
        getContentPane().add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 58, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "fn_students", "name", "last_name", "group", "grades"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 190, 440, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\SchoolUpr2_Project_System_imags\\book-education-board-book-cover.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        String textField1 = (String) model.getValueAt(table1.getSelectedRow(),0);
        String textField2 = (String) model.getValueAt(table1.getSelectedRow(),1);
        String textField3 = (String) model.getValueAt(table1.getSelectedRow(),2);
        String textField4 = (String) model.getValueAt(table1.getSelectedRow(),3);
        String textField5 = (String) model.getValueAt(table1.getSelectedRow(),4);
        fn.setText(textField1);
        name.setText(textField2);
        last_name.setText(textField3);
        groups.setSelectedItem(textField4);
        grades.setText(textField5);
    }//GEN-LAST:event_table1MouseClicked

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void GbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbackActionPerformed
        // TODO add your handling code here:
        MainForm open=new MainForm();
        open.show();
        this.hide();
    }//GEN-LAST:event_GbackActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String sql1="select s.fn_students,s.name,s.last_name,g.Gname,s.grades from univercitydb.students s INNER JOIN univercitydb.groups g on s.group=g.idgroups";
        Databasea dao=new Databasea();
         String s= name.getText();
         String s1=last_name.getText();
        if(fn.getText().length()<=10){
            if(s.matches(".*\\d.*")==false && s1.matches(".*\\d.*")==false){
        int fnstudents=Integer.parseInt(fn.getText());
        String name1=name.getText();
        String last_name1=last_name.getText();
        String selected =groups.getSelectedItem().toString();
        String sql5="select idgroups from univercitydb.groups where Gname='"+selected+"'";
        dao.SelectedItem(sql5);
        String id=dao.SelectedItem(sql5);
        int id1=Integer.parseInt(id);
            int grade=Integer.parseInt(grades.getText());
        if(grades.getText().length()==1 && grade>=0 && grade<=6){
        int row=table1.getSelectedRow();
        String cell=table1.getModel().getValueAt(row, 0).toString();

        String sql="Update univercitydb.students set fn_students ='" + fnstudents + "',name='" + name1 + "',last_name='" + last_name1 +  "',`group`='" + id1 + "',grades='" + grade + "'where fn_students="+cell;
        dao.UpdateGroups(sql);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        dao.SelectTableStudents(table1,sql1);
        }else{
             JOptionPane.showMessageDialog(null,"Grade is incorrect!Please fix it","Warning",
        JOptionPane.WARNING_MESSAGE);
         }
        }else{
             JOptionPane.showMessageDialog(null,"Name and LastName cannot have a numbers","Warning",
        JOptionPane.WARNING_MESSAGE);
         }
        }else{
             JOptionPane.showMessageDialog(null,"Facultet Number cannot be more than 10 symbols","Warning",
        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String sql1="select s.fn_students,s.name,s.last_name,g.Gname,s.grades from univercitydb.students s INNER JOIN univercitydb.groups g on s.group=g.idgroups";
        int row=table1.getSelectedRow();
        String cell=table1.getModel().getValueAt(row, 0).toString();
        Databasea dao=new Databasea();
        String sql="Delete from univercitydb.students where fn_students="+cell;
        dao.DeleteGroups(sql);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        dao.SelectTableStudents(table1,sql1);
    }//GEN-LAST:event_deleteActionPerformed

    private void groupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupsActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        String sql1="select s.fn_students,s.name,s.last_name,g.Gname,s.grades from univercitydb.students s INNER JOIN univercitydb.groups g on s.group=g.idgroups";
        Databasea dao=new Databasea();
        String s= name.getText(); //read the string
        String s1=last_name.getText();
         if(fn.getText().length()<=10){
         if(s.matches(".*\\d.*")==false && s1.matches(".*\\d.*")==false){
        int fnstudents=Integer.parseInt(fn.getText());
        String name1=name.getText();
        String last_name1=last_name.getText();
        String selected =groups.getSelectedItem().toString();
        String sql5="select idgroups from univercitydb.groups where Gname='"+selected+"'";
        dao.SelectedItem(sql5);
        String id=dao.SelectedItem(sql5);
        int id1=Integer.parseInt(id);
        int grade=Integer.parseInt(grades.getText());
        if(grades.getText().length()==1 && grade>=0 && grade<=6){
        String sql="INSERT INTO univercitydb.students" + "(fn_students,name,last_name,`group`,grades)"+ "VALUES('" +fnstudents + "','" + name1+ "','" + last_name1+ "','" + id1+ "','" + grade+ "')";
        dao.AddGroups(sql);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        dao.SelectTableStudents(table1,sql1);
        }
        else{
             JOptionPane.showMessageDialog(null,"Grade is incorrect!Please fix it","Warning",
        JOptionPane.WARNING_MESSAGE);
         }
         }else{
             JOptionPane.showMessageDialog(null,"Name and LastName cannot have a numbers","Warning",
        JOptionPane.WARNING_MESSAGE);
         }
         }
        else{
             JOptionPane.showMessageDialog(null,"Facultet Number cannot be more than 10 symbols","Warning",
        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_InsertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gback;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Update;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel fn_students;
    private javax.swing.JTextField grades;
    private javax.swing.JComboBox<String> groups;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel namea;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
