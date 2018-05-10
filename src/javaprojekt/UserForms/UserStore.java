package javaprojekt.UserForms;
import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.lang.Object;
import javaprojekt.HomePage;


public class UserStore extends javax.swing.JFrame {

    public UserStore() {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jInfoLabel = new javax.swing.JLabel();
        jCloseButton = new javax.swing.JButton();
        jLogoutButton = new javax.swing.JButton();
        jType3ComboBox = new javax.swing.JComboBox<>();
        jType1ComboBox = new javax.swing.JComboBox<>();
        jType2ComboBox = new javax.swing.JComboBox<>();
        jCheckoutButton = new javax.swing.JButton();
        jNameLabel1 = new javax.swing.JLabel();
        jNameLabel2 = new javax.swing.JLabel();
        jNameLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jTextField1.setText("Online Store");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jInfoLabel.setText("Welcome to our clothing shop where we sell 4 different types of clothing.");

        jCloseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCloseButton.setText("Close");
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });

        jLogoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogoutButton.setText("Logout");
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });

        jType3ComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jType3ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jType3ComboBoxActionPerformed(evt);
            }
        });

        jType1ComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jType1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jType1ComboBoxActionPerformed(evt);
            }
        });

        jType2ComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jType2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jType2ComboBoxActionPerformed(evt);
            }
        });

        jCheckoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckoutButton.setText("Checkout");
        jCheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckoutButtonActionPerformed(evt);
            }
        });

        jNameLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel1.setText("1st type");

        jNameLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel2.setText("3rd type");

        jNameLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel3.setText("2nd type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNameLabel3)
                                    .addComponent(jNameLabel2)
                                    .addComponent(jNameLabel1))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jType3ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jType1ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jType2ComboBox, 0, 295, Short.MAX_VALUE)))
                            .addComponent(jInfoLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jCheckoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jInfoLabel)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jType3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNameLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jType1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNameLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jType2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNameLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jCheckoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jType1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jType1ComboBoxActionPerformed
        //Aa
    }//GEN-LAST:event_jType1ComboBoxActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jCheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckoutButtonActionPerformed

        
        this.setVisible(false);
        Checkout Checkingout = new Checkout();
        Checkingout.setVisible(true);
    }//GEN-LAST:event_jCheckoutButtonActionPerformed

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        this.setVisible(false);
        HomePage Home = new HomePage();
        Home.setVisible(true);
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jType2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jType2ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jType2ComboBoxActionPerformed

    private void jType3ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jType3ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jType3ComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(UserStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCheckoutButton;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jInfoLabel;
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JLabel jNameLabel1;
    private javax.swing.JLabel jNameLabel2;
    private javax.swing.JLabel jNameLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jType1ComboBox;
    private javax.swing.JComboBox<String> jType2ComboBox;
    private javax.swing.JComboBox<String> jType3ComboBox;
    // End of variables declaration//GEN-END:variables
}
