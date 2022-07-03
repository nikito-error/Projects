/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.carssystem;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class Clients extends javax.swing.JFrame {
String egn1;
String name;
String phone1;
String address1;
ArrayList<Clients> list=new ArrayList<Clients>();

    public String getEgn1() {
        return egn1;
    }

    public void setEgn1(String egn1) {
        this.egn1 = egn1;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates new form Groups
     */
    public Clients() {
        initComponents();
         Databasea dao = new Databasea();
           String sql1="select * from carssystem.clients";
        dao.SelectTableClients(table,sql1);
    }

    private Clients(String name1) {
        this.name=name1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gback = new javax.swing.JButton();
        Gname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        egn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Gback.setText("Back");
        Gback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GbackActionPerformed(evt);
            }
        });
        getContentPane().add(Gback, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));
        getContentPane().add(Gname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 166, 35));

        jLabel3.setText("Име и фамилия:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 94, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Клиенти");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 180, 50));

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        getContentPane().add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "egn", "name", "phone", "address"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 480, 280));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));
        getContentPane().add(egn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 166, 35));

        jLabel4.setText("Егн:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 94, 35));
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 166, 35));

        jLabel5.setText("Телефон:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 94, 35));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 166, 35));

        jLabel6.setText("Адрес");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 94, 35));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 166, 35));

        jLabel2.setText("Търсене");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 56, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\SchoolUpr2_Project_System_imags\\thumb-1920-311249.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**/
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        if(egn.getText()==null || egn.getText().isEmpty() || Gname.getText()==null || Gname.getText().isEmpty() || phone.getText()==null || phone.getText().isEmpty() || address.getText()==null || address.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Empty fields are not allowed!");
        }else{
         String egn1=egn.getText();
         if(egn1.length()>=0 && egn1.length()<=10)
         {
         String name1=Gname.getText();
         String phone1=phone.getText();
         String address1=address.getText();
          String sql1="select * from carssystem.clients";
                String sql="INSERT INTO carssystem.clients" + "(egn,name,phone,address)"+ "VALUES('" + egn1 + "','" + name1 + "','" + phone1 + "','" + address1 + "')";
        Databasea dao=new Databasea();
        dao.Insert(sql);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        dao.SelectTableClients(table,sql1);
         } else{
            JOptionPane.showMessageDialog(null, "Egn length cannot be under zero and bigger than 10!");
        }
        }
  
    
    }//GEN-LAST:event_InsertActionPerformed

    private void GbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GbackActionPerformed
        // TODO add your handling code here:
        MainForm open=new MainForm();
        open.show();
        this.hide();
    }//GEN-LAST:event_GbackActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String sql1="select * from carssystem.clients";
          int row=table.getSelectedRow();
          String cell=table.getModel().getValueAt(row, 0).toString();
        Databasea dao=new Databasea();
        String sql="Delete from carssystem.clients where egn="+cell;
        dao.Delete(sql);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        dao.SelectTableClients(table,sql1);
    }//GEN-LAST:event_deleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        if(egn.getText()==null || egn.getText().isEmpty() || Gname.getText()==null || Gname.getText().isEmpty() || phone.getText()==null || phone.getText().isEmpty() || address.getText()==null || address.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Empty fields are not allowed!");
        }else{
         String sql1="select * from carssystem.clients";
         String egn1=egn.getText();
         if(egn1.length()>=0 && egn1.length()<=10){
         String name1=Gname.getText();
         String phone1=phone.getText();
         String address1=address.getText();
        Databasea dao=new Databasea();
         int row=table.getSelectedRow();
         String cell=table.getModel().getValueAt(row, 0).toString();
        String sql="Update carssystem.clients set egn='" + egn1 + "',name='" + name1 + "',phone='" + phone1 + "',address='" +address1 + "' where egn="+cell;
        dao.Update(sql);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        dao.SelectTableClients(table,sql1);
         } else{
            JOptionPane.showMessageDialog(null, "Egn length cannot be under zero and bigger than 10!");
        }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> rowSorter =new TableRowSorter<>(model);
        table.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(search.getText().trim()));
    }//GEN-LAST:event_searchActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel) table.getModel();
String textField = (String) model.getValueAt(table.getSelectedRow(),0);  
String textField1 = (String) model.getValueAt(table.getSelectedRow(),1);
String textField6 = (String) model.getValueAt(table.getSelectedRow(),2);
String textField2 = (String) model.getValueAt(table.getSelectedRow(),3);  
egn.setText(textField);
Gname.setText(textField1);
phone.setText(textField6);
address.setText(textField2);
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gback;
    private javax.swing.JTextField Gname;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Update;
    private javax.swing.JTextField address;
    private javax.swing.JButton delete;
    private javax.swing.JTextField egn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField search;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
