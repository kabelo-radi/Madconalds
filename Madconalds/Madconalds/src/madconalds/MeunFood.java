package madconalds;

import java.awt.HeadlessException;
import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MeunFood extends javax.swing.JFrame {
    //Creates new form MeunFood
    public MeunFood() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salad1 = new javax.swing.JRadioButton();
        salad2 = new javax.swing.JRadioButton();
        salad3 = new javax.swing.JRadioButton();
        FM1 = new javax.swing.JRadioButton();
        FM2 = new javax.swing.JRadioButton();
        FM3 = new javax.swing.JRadioButton();
        SM1 = new javax.swing.JRadioButton();
        SM2 = new javax.swing.JRadioButton();
        SM3 = new javax.swing.JRadioButton();
        SD1 = new javax.swing.JRadioButton();
        SD2 = new javax.swing.JRadioButton();
        SD3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        btnShow = new javax.swing.JButton();
        btnRC = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Xirod", 0, 24)); // NOI18N
        jLabel1.setText("madconalds menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        salad1.setText("Red Salad");
        salad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salad1ActionPerformed(evt);
            }
        });

        salad2.setText("Toss Salad");

        salad3.setText("Green Salad");

        FM1.setText("Fruity Lops");

        FM2.setText("Yellow Mellow");

        FM3.setText("Grapes te Rum");

        SM1.setText("Chicken");

        SM2.setText("Beef");

        SM3.setText("Lamp");

        SD1.setText("Flavored Cola");

        SD2.setText("Juice");

        SD3.setText("CockTails");

        jLabel2.setFont(new java.awt.Font("Xirod", 0, 12)); // NOI18N
        jLabel2.setText("sALADS R88");

        jLabel3.setFont(new java.awt.Font("Xirod", 0, 12)); // NOI18N
        jLabel3.setText("SOFTDRINKS R 25");

        jLabel4.setFont(new java.awt.Font("Xirod", 0, 12)); // NOI18N
        jLabel4.setText("SCHWARMA R75");

        jLabel5.setFont(new java.awt.Font("Xirod", 0, 12)); // NOI18N
        jLabel5.setText("FRUITY MIX r100");

        Table1.setFont(new java.awt.Font("Xirod", 0, 10)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEMS", "PRICE", "QTY"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        btnShow.setBackground(new java.awt.Color(255, 153, 153));
        btnShow.setFont(new java.awt.Font("Xirod", 0, 10)); // NOI18N
        btnShow.setText("SHOW ITEMS");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnRC.setBackground(new java.awt.Color(255, 153, 153));
        btnRC.setFont(new java.awt.Font("Xirod", 0, 10)); // NOI18N
        btnRC.setText("RESET CART");
        btnRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCActionPerformed(evt);
            }
        });

        btnCart.setBackground(new java.awt.Color(153, 153, 255));
        btnCart.setFont(new java.awt.Font("Xirod", 0, 12)); // NOI18N
        btnCart.setText("got to Cart");
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 153, 153));
        btnAdd.setFont(new java.awt.Font("Xirod", 0, 12)); // NOI18N
        btnAdd.setText("add items");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salad1)
                                    .addComponent(salad2)
                                    .addComponent(salad3))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FM3)
                                    .addComponent(FM2)
                                    .addComponent(FM1)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SM1)
                            .addComponent(jLabel4)
                            .addComponent(SM2)
                            .addComponent(SM3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(SD1)
                            .addComponent(SD3)
                            .addComponent(SD2))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnShow))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salad1)
                    .addComponent(FM1)
                    .addComponent(SM1)
                    .addComponent(SD1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salad2)
                    .addComponent(FM2)
                    .addComponent(SM2)
                    .addComponent(SD2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salad3)
                    .addComponent(FM3)
                    .addComponent(SM3)
                    .addComponent(SD3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salad1ActionPerformed

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        //it needs to open the other interface
        this.dispose();
        new Cart().setVisible(true);
    }//GEN-LAST:event_btnCartActionPerformed

    private void btnRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCActionPerformed
        //clears all the radio buttons
        salad1.setSelected(false);
        salad2.setSelected(false);
        salad3.setSelected(false);
        FM1.setSelected(false);
        FM2.setSelected(false);
        FM3.setSelected(false);
        SM1.setSelected(false);
        SM2.setSelected(false);
        SM3.setSelected(false);
        SD1.setSelected(false);
        SD2.setSelected(false);
	SD3.setSelected(false);
        // clear the text file
        try {
                File file= new File("MeunOrder.txt");
                PrintWriter wr = new PrintWriter(file); 
        if (file.exists()){
            wr.print("");
            wr.close();
            }
        }catch(FileNotFoundException e){
            }
        this.dispose();
    }//GEN-LAST:event_btnRCActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed

        try {
             File file = new File("MeunOrder.txt");
            if (!file.exists()){
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "You Must Press Add Items Before Show Items ");
                }
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel)Table1.getModel();
            
            Object[] tableLines = br.lines().toArray();
            
            
            for (Object tableLine : tableLines) {
                String[] dataRow = tableLine.toString().split(",");
                model.addRow(dataRow);
            }
            
            }
        catch (HeadlessException | IOException | NumberFormatException ex){
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
          try {
            File file = new File("MeunOrder.txt");
              //Salad
              try (PrintWriter pw = new PrintWriter(file)) {
                  //Salad
                  if (salad1.isSelected()){
                      pw.append("\n "+ "Red Salad, 88, 1");
                  }
                  if (salad2.isSelected()){
                      pw.append("\n "+ "Toss Salad, 88, 1");
                  }
                  if (salad3.isSelected()){
                      pw.append("\n "+ "Green Salad, 88, 1");
                  }
                  //fruity mix
                  if (FM1.isSelected()){
                      pw.append("\n "+ "Fruity Lops, 100, 1");
                  }
                  if (FM2.isSelected()){
                      pw.append("\n "+ "Yellow Mellow, 100, 1");
                  }
                  if (FM3.isSelected()){
                      pw.append("\n "+ "Grape te Rum, 100, 1");
                  }
                  //Schwarma
                  if (SM1.isSelected()){
                      pw.append("\n "+ "CHicken, 75, 1");
                  }
                  if (SM2.isSelected()){
                      pw.append("\n "+ "Beef, 75, 1");
                  }
                  if (SM3.isSelected()){
                      pw.append("\n "+ "Lamp, 75, 1");
                  }
                  //SoftDrinks
                  if (SD1.isSelected()){
                      pw.append("\n "+ "Cola, 25, 1");
                  }
                  if (SD2.isSelected()){
                      pw.append("\n "+ "Juice, 25, 1");
                  }
                  if (SD3.isSelected()){
                      pw.append("\n "+ "CockTails, 25, 1");
                  }
              }
            System.out.println("done");
        }
         catch (IOException e){
            }
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(MeunFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeunFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeunFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeunFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MeunFood().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FM1;
    private javax.swing.JRadioButton FM2;
    private javax.swing.JRadioButton FM3;
    private javax.swing.JRadioButton SD1;
    private javax.swing.JRadioButton SD2;
    private javax.swing.JRadioButton SD3;
    private javax.swing.JRadioButton SM1;
    private javax.swing.JRadioButton SM2;
    private javax.swing.JRadioButton SM3;
    private javax.swing.JTable Table1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnRC;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton salad1;
    private javax.swing.JRadioButton salad2;
    private javax.swing.JRadioButton salad3;
    // End of variables declaration//GEN-END:variables
}
