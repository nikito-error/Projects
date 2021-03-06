/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.schoolupr2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Subjects extends javax.swing.JFrame {
String Name;
String grades;
String teacher1;
ArrayList<Subjects> list = new ArrayList<Subjects>();

    public Subjects(String Name, String grades, String teacher1) {
        this.Name = Name;
        this.grades = grades;
        this.teacher1 = teacher1;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getTeacher1() {
        return teacher1;
    }

    public void setTeacher1(String teacher1) {
        this.teacher1 = teacher1;
    }

   


    /**
     * Creates new form Subjects
     */
     String sql1="select s.id_subjects,s.Sname,s.Sgrade,CONCAT(g.name,' ',g.last_name) as Tname  from univercitydb.subjects s INNER JOIN univercitydb.teachers g on s.id_teacher=g.idteachers";
    public Subjects() {
        initComponents();
         Databasea dao = new Databasea();
        dao.SelectTableSubjects(table1,sql1);
        dao.combo3(teacher);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JLabel();
        teacher = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        grade1 = new javax.swing.JTextField();
        name3 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Gback = new javax.swing.JButton();
        Insert4 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        search2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namea.setForeground(new java.awt.Color(240, 240, 240));
        namea.setText("name");
        getContentPane().add(namea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 60, 20));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "grades", "teacher_name"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 450, 440));
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 166, 37));

        name2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name2.setForeground(new java.awt.Color(240, 240, 240));
        name2.setText("grades");
        getContentPane().add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 79, -1));
        getContentPane().add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 166, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("????????????????");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 230, 70));
        getContentPane().add(grade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 166, 36));

        name3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name3.setForeground(new java.awt.Color(240, 240, 240));
        name3.setText("teacher");
        getContentPane().add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 58, -1));

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        Gback.setText("Back");
        Gback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbackActionPerformed(evt);
            }
        });
        getContentPane().add(Gback, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        Insert4.setText("Insert");
        Insert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert4ActionPerformed(evt);
            }
        });
        getContentPane().add(Insert4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\SchoolUpr2_Project_System_imags\\book-education-board-book-cover.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 660));

        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        getContentPane().add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         Databasea dao=new Databasea();
        String name11=name1.getText();
        if(name11.matches(".*\\d.*")==false){
        String selected =teacher.getSelectedItem().toString();
        String sql5="select idteachers from univercitydb.teachers where CONCAT(name,' ',last_name)='"+selected+"'";
        String id=dao.SelectedItem1(sql5);
        int id1=Integer.parseInt(id);
        int grade=Integer.parseInt(grade1.getText());
         if(grade1.getText().length()==1 && grade>=0 && grade<=6){
        int row=table1.getSelectedRow();
        String cell=table1.getModel().getValueAt(row, 0).toString();
        String sql="Update univercitydb.subjects set Sname='" + name11 + "',Sgrade='" + grade + "',id_teacher='" + id1 + "'where id_subjects="+cell;
        dao.UpdateGroups(sql);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        dao.SelectTableSubjects(table1,sql1);
         }else{
             JOptionPane.showMessageDialog(null,"Grade is incorrect!Please fix it","Warning",
        JOptionPane.WARNING_MESSAGE);
         }
        }else{
             JOptionPane.showMessageDialog(null,"Name cannot have a numbers","Warning",
        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void GbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbackActionPerformed
        // TODO add your handling code here:
        MainForm open=new MainForm();
        open.show();
        this.hide();
    }//GEN-LAST:event_GbackActionPerformed

    private void Insert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert4ActionPerformed
        // TODO add your handling code here:
        Databasea dao=new Databasea();
        String name11=name1.getText();
        if(name11.matches(".*\\d.*")==false){
        String selected =teacher.getSelectedItem().toString();
        String sql5="select idteachers from univercitydb.teachers where CONCAT(name,' ',last_name)='"+selected+"'";
        String id=dao.SelectedItem1(sql5);
        int id1=Integer.parseInt(id);
        int grade=Integer.parseInt(grade1.getText());
        if(grade1.getText().length()==1 && grade>=0 && grade<=6){
        String sql="INSERT INTO univercitydb.subjects" + "(Sname,Sgrade,id_teacher)"+ "VALUES('" + name11+ "','" + grade+ "','" + id1+ "')";
        dao.AddGroups(sql);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        dao.SelectTableSubjects(table1,sql1);
         }else{
             JOptionPane.showMessageDialog(null,"Grade is incorrect!Please fix it","Warning",
        JOptionPane.WARNING_MESSAGE);
         }
        }else{
             JOptionPane.showMessageDialog(null,"Name cannot have a numbers","Warning",
        JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_Insert4ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int row=table1.getSelectedRow();
        String cell=table1.getModel().getValueAt(row, 0).toString();
        Databasea dao=new Databasea();
        String sql="Delete from univercitydb.subjects where id_subjects="+cell;
        dao.DeleteGroups(sql);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        dao.SelectTableSubjects(table1,sql1);
    }//GEN-LAST:event_deleteActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
String textField1 = (String) model.getValueAt(table1.getSelectedRow(),1);
String textField2 = (String) model.getValueAt(table1.getSelectedRow(),2);
String textField3 = (String) model.getValueAt(table1.getSelectedRow(),3);
name1.setText(textField1);
grade1.setText(textField2);
teacher.setSelectedItem(textField3);
    }//GEN-LAST:event_table1MouseClicked

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
      
    }//GEN-LAST:event_search2ActionPerformed

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
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gback;
    private javax.swing.JButton Insert4;
    private javax.swing.JButton Update;
    private javax.swing.JButton delete;
    private javax.swing.JTextField grade1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel namea;
    private javax.swing.JTextField search2;
    private javax.swing.JTable table1;
    private javax.swing.JComboBox<String> teacher;
    // End of variables declaration//GEN-END:variables
}
