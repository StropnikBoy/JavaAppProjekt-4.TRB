package javaprojekt;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class adminBrands extends javax.swing.JFrame {

    public adminBrands() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = (int) tk.getScreenSize().getWidth();
                int ySize = (int) tk.getScreenSize().getHeight();
        this.setSize(xSize, ySize);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jUpdateButton = new javax.swing.JButton();
        jNewBrand = new javax.swing.JLabel();
        jNewCostTextBox = new javax.swing.JTextField();
        jBrandComboBox = new javax.swing.JComboBox<>();
        jTitleLabel = new javax.swing.JLabel();
        jOldClassLabel = new javax.swing.JLabel();
        jOldClassTextBox = new javax.swing.JTextField();
        jInfoLabel = new javax.swing.JLabel();
        jDeleteButton = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();
        jAddButton = new javax.swing.JButton();
        jClassComboBox = new javax.swing.JComboBox<>();
        jCurrentBrandComboBox = new javax.swing.JLabel();
        jNewBrandsTextBox = new javax.swing.JTextField();
        jNewBrand1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jUpdateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jUpdateButton.setText("Update");
        jUpdateButton.setActionCommand("Back");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });

        jNewBrand.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNewBrand.setText("Add a new brand:");

        jNewCostTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBrandComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Add/Update/Delete brands");

        jOldClassLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jOldClassLabel.setText("Edit an old class or Delete");

        jOldClassTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInfoLabel.setText("Edit brand:");

        jDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jDeleteButton.setText("Delete");
        jDeleteButton.setActionCommand("Back");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });

        jBackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBackButton.setText("Go Back");
        jBackButton.setActionCommand("Back");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        jAddButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jAddButton.setText("Add");
        jAddButton.setActionCommand("Back");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        jClassComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCurrentBrandComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCurrentBrandComboBox.setText("Select a class:");

        jNewBrandsTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jNewBrand1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNewBrand1.setText("Add cost:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jCurrentBrandComboBox)
                                .addGap(39, 39, 39))
                            .addComponent(jNewBrand1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNewBrand, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNewBrandsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNewCostTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jOldClassLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jBrandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jInfoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jOldClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCurrentBrandComboBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNewBrandsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNewBrand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNewCostTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNewBrand1))
                .addGap(62, 62, 62)
                .addComponent(jOldClassLabel)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBrandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOldClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInfoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
            
        String newName = jOldClassTextBox.getText();
        String value = jBrandComboBox.getSelectedItem().toString();
            
                    
        try 
        { 
            Statement stavek = Conn.createStatement();
            String query = "SELECT editad('"+ value +"', '"+ newName +"')";
            System.out.println(query);
            Statement statement = Conn.createStatement();
            statement.executeQuery(query);
                
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Successful updated ads.");
                
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jUpdateButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();

        String value = jBrandComboBox.getSelectedItem().toString();
            
                    
        try 
        { 
            Statement stavek = Conn.createStatement();
            String query = "SELECT deletead('"+ value +"')";
            System.out.println(query);
            Statement statement = Conn.createStatement();
            statement.executeQuery(query);
                
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Successful deleted from brands.");
                
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        this.setVisible(false);
        AdminHomePage Admin = new AdminHomePage();
        Admin.setVisible(true);
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
            Connection Conn;
            Database povezava = new Database();
            Conn = povezava.getConnection();
            
            String newName = jNewBrandsTextBox.getText();
            String newCost = jNewCostTextBox.getText();
            String value = jClassComboBox.getSelectedItem().toString();
            
                    
            try 
            { 
                Statement stavek = Conn.createStatement();
                String query = "SELECT addad('"+ newName +"', (SELECT id FROM categories WHERE name = '"+ value +"'), "+ newCost +")";
                System.out.println(query);
                Statement statement = Conn.createStatement();
                statement.executeQuery(query);
                
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(dialog, "Successful added into ads.");
                
            }
        
        catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }//GEN-LAST:event_jAddButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        try 
        {
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM categories");
        
            while (rs.next()) {
                String pat = rs.getString("name");
                jClassComboBox.addItem(pat);
            }
            Conn.close();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        Conn = povezava.getConnection();
        
        try 
        {
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
        
            while (rs.next()) {
                String pat = rs.getString("name");
                jBrandComboBox.addItem(pat);
            }
            Conn.close();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminBrands().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JButton jBackButton;
    private javax.swing.JComboBox<String> jBrandComboBox;
    private javax.swing.JComboBox<String> jClassComboBox;
    private javax.swing.JLabel jCurrentBrandComboBox;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JLabel jInfoLabel;
    private javax.swing.JLabel jNewBrand;
    private javax.swing.JLabel jNewBrand1;
    private javax.swing.JTextField jNewBrandsTextBox;
    private javax.swing.JTextField jNewCostTextBox;
    private javax.swing.JLabel jOldClassLabel;
    private javax.swing.JTextField jOldClassTextBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JButton jUpdateButton;
    // End of variables declaration//GEN-END:variables
}
