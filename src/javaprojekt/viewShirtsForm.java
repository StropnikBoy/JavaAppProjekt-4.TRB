package javaprojekt;
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

public class viewShirtsForm extends javax.swing.JFrame {

    public viewShirtsForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPictureBox = new javax.swing.JLabel();
        jSizesLabel = new javax.swing.JLabel();
        jNameComboBox = new javax.swing.JComboBox<>();
        jBrandComboBox = new javax.swing.JComboBox<>();
        jFemaleRadioButton = new javax.swing.JRadioButton();
        jMaleRadioButton = new javax.swing.JRadioButton();
        jNameLabel = new javax.swing.JLabel();
        jCheckoutButton = new javax.swing.JButton();
        jCancelButton = new javax.swing.JButton();
        jBrandLabel = new javax.swing.JLabel();
        jSizesComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jPictureBox.setIcon(new javax.swing.ImageIcon("C:\\Users\\theph\\Desktop\\Items\\Shirts\\adidas_T-Shirt.jpg")); // NOI18N
        jPanel1.add(jPictureBox);
        jPictureBox.setBounds(390, 20, 410, 320);

        jSizesLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSizesLabel.setText("Sizes:");
        jPanel1.add(jSizesLabel);
        jSizesLabel.setBounds(20, 190, 61, 29);

        jNameComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jNameComboBox);
        jNameComboBox.setBounds(120, 100, 197, 50);

        jBrandComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBrandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrandComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jBrandComboBox);
        jBrandComboBox.setBounds(120, 20, 197, 50);

        jFemaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFemaleRadioButton.setText("Female");
        jPanel1.add(jFemaleRadioButton);
        jFemaleRadioButton.setBounds(110, 290, 83, 31);

        jMaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMaleRadioButton.setText("Male");
        jPanel1.add(jMaleRadioButton);
        jMaleRadioButton.setBounds(240, 290, 65, 31);

        jNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel.setText("Name:");
        jPanel1.add(jNameLabel);
        jNameLabel.setBounds(20, 110, 70, 29);

        jCheckoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckoutButton.setText("Checkout");
        jCheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckoutButton);
        jCheckoutButton.setBounds(490, 450, 200, 50);

        jCancelButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCancelButton.setText("Go Back");
        jCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jCancelButton);
        jCancelButton.setBounds(20, 460, 200, 50);

        jBrandLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBrandLabel.setText("Brand:");
        jPanel1.add(jBrandLabel);
        jBrandLabel.setBounds(20, 30, 70, 29);

        jSizesComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSizesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSizesComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jSizesComboBox);
        jSizesComboBox.setBounds(120, 190, 197, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameComboBoxActionPerformed
        //Aa
    }//GEN-LAST:event_jNameComboBoxActionPerformed

    private void jCheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckoutButtonActionPerformed
        this.setVisible(false);
        UserStore Home = new UserStore();
        Home.setVisible(true);
               
    }//GEN-LAST:event_jCheckoutButtonActionPerformed

    private void jCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelButtonActionPerformed

    private void jBrandComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrandComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBrandComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jBrandComboBox.addItem("Maverick");
        jBrandComboBox.addItem("Adidas");
        
        jNameComboBox.addItem("S");
        jNameComboBox.addItem("M");
        jNameComboBox.addItem("L");
        jNameComboBox.addItem("XL");
    }//GEN-LAST:event_formWindowOpened

    private void jSizesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSizesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSizesComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(viewShirtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewShirtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewShirtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewShirtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewShirtsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBrandComboBox;
    private javax.swing.JLabel jBrandLabel;
    private javax.swing.JButton jCancelButton;
    private javax.swing.JButton jCheckoutButton;
    private javax.swing.JRadioButton jFemaleRadioButton;
    private javax.swing.JRadioButton jMaleRadioButton;
    private javax.swing.JComboBox<String> jNameComboBox;
    private javax.swing.JLabel jNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPictureBox;
    private javax.swing.JComboBox<String> jSizesComboBox;
    private javax.swing.JLabel jSizesLabel;
    // End of variables declaration//GEN-END:variables
}
