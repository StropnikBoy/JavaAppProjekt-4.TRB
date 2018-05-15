package javaprojekt;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class adminClasses extends javax.swing.JFrame {
    
    public adminClasses() {
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
        jNewClassLabel = new javax.swing.JLabel();
        jNewClassTextBox = new javax.swing.JTextField();
        jClassComboBox = new javax.swing.JComboBox<>();
        jTitleLabel = new javax.swing.JLabel();
        jOldClassLabel = new javax.swing.JLabel();
        jOldClassTextBox = new javax.swing.JTextField();
        jInfoLabel = new javax.swing.JLabel();
        jDeleteButton = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();
        jAddButton = new javax.swing.JButton();

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

        jNewClassLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNewClassLabel.setText("Add a new class:");

        jNewClassTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jClassComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Add/Update/Delete Classes");

        jOldClassLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jOldClassLabel.setText("Edit an old class or Delete");

        jInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInfoLabel.setText("Edit class:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jNewClassLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jNewClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTitleLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jInfoLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jOldClassLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jOldClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41)
                                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTitleLabel)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNewClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNewClassLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jOldClassLabel)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jOldClassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInfoLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
        String value = jClassComboBox.getSelectedItem().toString();
        String newName = jOldClassTextBox.getText();
        
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        try 
            { 
                Statement stavek = Conn.createStatement();
                String query = "SELECT editcategory('"+ value +"', '"+ newName +"')";
                System.out.println(query);
                Statement statement = Conn.createStatement();
                statement.executeQuery(query);
                
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(dialog, "Successful updatet categories.");
            }
        
        catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }//GEN-LAST:event_jUpdateButtonActionPerformed

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
    }//GEN-LAST:event_formWindowOpened

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        String value = jClassComboBox.getSelectedItem().toString();
        
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        try 
            { 
                Statement stavek = Conn.createStatement();
                String query = "SELECT deletecategory('"+ value +"')";
                System.out.println(query);
                Statement statement = Conn.createStatement();
                statement.executeQuery(query);
                
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(dialog, "Successful deleted from categories.");
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
        if ( jNewClassTextBox.getText().trim().length() == 0)
        {
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Izpolni podatke pravilno.");
        }

        {
            Connection Conn;
            Database povezava = new Database();
            Conn = povezava.getConnection();
            
            String newName = jNewClassTextBox.getText();
            
                    
            try 
            { 
                Statement stavek = Conn.createStatement();
                String query = "SELECT addcategory('"+ newName +"', null)";
                System.out.println(query);
                Statement statement = Conn.createStatement();
                statement.executeQuery(query);
                
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(dialog, "Successful insert into categories.");
            }
        
        catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }  
    }//GEN-LAST:event_jAddButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminClasses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JButton jBackButton;
    private javax.swing.JComboBox<String> jClassComboBox;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JLabel jInfoLabel;
    private javax.swing.JLabel jNewClassLabel;
    private javax.swing.JTextField jNewClassTextBox;
    private javax.swing.JLabel jOldClassLabel;
    private javax.swing.JTextField jOldClassTextBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JButton jUpdateButton;
    // End of variables declaration//GEN-END:variables
}
