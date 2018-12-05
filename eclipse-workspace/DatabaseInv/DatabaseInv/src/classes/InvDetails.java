/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexb
 */
public class InvDetails extends javax.swing.JFrame {
SelectOption options;
    /**
     * Creates new form InvDetails
     */
    public InvDetails() {
        initComponents();
    }

    InvDetails(SelectOption aThis) {
         initComponents();
         this.setLocationRelativeTo(null);
         this.options=aThis;
         
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addItem = new javax.swing.JButton();
        itemName = new javax.swing.JTextField();
        Manfname = new javax.swing.JTextField();
        Supp = new javax.swing.JTextField();
        deleteItem = new javax.swing.JButton();
        price = new javax.swing.JFormattedTextField();
        par = new javax.swing.JFormattedTextField();
        quantity = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Item name");

        jLabel2.setText("Manf Name");

        jLabel3.setText("Supplier");

        jLabel4.setText("Quantity");

        jLabel5.setText("Par");
        jLabel5.setToolTipText("The amount you normaly keep in stock");

        jLabel6.setText("Price");

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        confirm.setText("confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item name", "Manf Name", "Supplier", "Quanity", "Par", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        addItem.setText("Add item");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        deleteItem.setText("jButton1");
        deleteItem.setToolTipText("Deletes the selected item");
        deleteItem.setActionCommand("Delete item");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });

        price.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        par.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        quantity.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteItem)
                .addGap(31, 31, 31)
                .addComponent(confirm)
                .addGap(38, 38, 38)
                .addComponent(cancel)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(price)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(Manfname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(itemName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Supp)
                    .addComponent(par)
                    .addComponent(quantity))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Manfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(confirm)
                    .addComponent(addItem)
                    .addComponent(deleteItem))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void windowClosing(WindowEvent e){
      System.out.println("jdialog window closed event received");
     options.setVisible(true);
       this.dispose();
}
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       options.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
          System.out.println(jTable1.getValueAt(1,1));
    }//GEN-LAST:event_confirmActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      model.addRow(new Object[]{itemName.getText(),Manfname.getText(),Supp.getText(),
      quantity.getText(),par.getText(),price.getText()});
      System.out.println(model.getRowCount());
    
    }//GEN-LAST:event_addItemActionPerformed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItemActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Manfname;
    private javax.swing.JTextField Supp;
    private javax.swing.JButton addItem;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JButton deleteItem;
    private javax.swing.JTextField itemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField par;
    private javax.swing.JFormattedTextField price;
    private javax.swing.JFormattedTextField quantity;
    // End of variables declaration//GEN-END:variables
}