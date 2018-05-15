package javaprojekt;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class adminItems extends javax.swing.JFrame {

    public adminItems() {
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
        jItemsComboBox = new javax.swing.JComboBox<>();
        jTitleLabel = new javax.swing.JLabel();
        jOldClassLabel = new javax.swing.JLabel();
        jOldClassTextBox = new javax.swing.JTextField();
        jInfoLabel = new javax.swing.JLabel();
        jDeleteButton = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();
        jAddButton = new javax.swing.JButton();
        jBrandsComboBox = new javax.swing.JComboBox<>();
        jCurrentBrandComboBox = new javax.swing.JLabel();
        jNewBrandsTextBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jUpdateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jUpdateButton.setText("Update");
        jUpdateButton.setActionCommand("Back");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });

        jNewBrand.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNewBrand.setText("Add a new Item");

        jItemsComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Add/Update/Delete items");

        jOldClassLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jOldClassLabel.setText("Edit an old item or Delete");

        jOldClassTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInfoLabel.setText("Edit Item:");

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

        jBrandsComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCurrentBrandComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCurrentBrandComboBox.setText("Select a brand:");

        jNewBrandsTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCurrentBrandComboBox)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jNewBrand)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBrandsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNewBrandsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jInfoLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jOldClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jItemsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOldClassLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBrandsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCurrentBrandComboBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNewBrandsTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNewBrand))
                        .addGap(56, 56, 56)
                        .addComponent(jOldClassLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jItemsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jOldClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInfoLabel))
                        .addGap(36, 36, 36)
                        .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String value = jItemsComboBox.getSelectedItem().toString();

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

        String value = jItemsComboBox.getSelectedItem().toString();

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
        String value = jBrandsComboBox.getSelectedItem().toString();

        try
        {
            Statement stavek = Conn.createStatement();
            String query = "SELECT INSERT INTO pictures (ad_id, name) VALUES (";
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JButton jBackButton;
    private javax.swing.JComboBox<String> jBrandsComboBox;
    private javax.swing.JLabel jCurrentBrandComboBox;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JLabel jInfoLabel;
    private javax.swing.JComboBox<String> jItemsComboBox;
    private javax.swing.JLabel jNewBrand;
    private javax.swing.JTextField jNewBrandsTextBox;
    private javax.swing.JLabel jOldClassLabel;
    private javax.swing.JTextField jOldClassTextBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JButton jUpdateButton;
    // End of variables declaration//GEN-END:variables
}
