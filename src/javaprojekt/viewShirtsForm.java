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
        jLabel1 = new javax.swing.JLabel();
        jEmailLabel1 = new javax.swing.JLabel();
        scrollbar1 = new java.awt.Scrollbar();
        jSizesComboBox = new javax.swing.JComboBox<>();
        jBrandComboBox = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jEmailLabel = new javax.swing.JLabel();
        jSubmitButton = new javax.swing.JButton();
        jSubmitButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\theph\\Desktop\\Items\\Shirts\\adidas_T-Shirt.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 30, 330, 320);

        jEmailLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailLabel1.setText("Sizes:");
        jPanel1.add(jEmailLabel1);
        jEmailLabel1.setBounds(20, 100, 61, 29);
        jPanel1.add(scrollbar1);
        scrollbar1.setBounds(510, 370, 100, 33);

        jSizesComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSizesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSizesComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jSizesComboBox);
        jSizesComboBox.setBounds(120, 30, 197, 50);

        jBrandComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBrandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrandComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jBrandComboBox);
        jBrandComboBox.setBounds(120, 90, 197, 50);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(40, 170, 83, 31);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(130, 170, 65, 31);

        jEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailLabel.setText("Brand:");
        jPanel1.add(jEmailLabel);
        jEmailLabel.setBounds(20, 40, 70, 29);

        jSubmitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSubmitButton.setText("Checkout");
        jSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jSubmitButton);
        jSubmitButton.setBounds(460, 430, 200, 50);

        jSubmitButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSubmitButton1.setText("Go Back");
        jSubmitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jSubmitButton1);
        jSubmitButton1.setBounds(30, 430, 200, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSizesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSizesComboBoxActionPerformed
        //Aa
    }//GEN-LAST:event_jSizesComboBoxActionPerformed

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed
        this.setVisible(false);
        UserStore Home = new UserStore();
        Home.setVisible(true);
               
    }//GEN-LAST:event_jSubmitButtonActionPerformed

    private void jSubmitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSubmitButton1ActionPerformed

    private void jBrandComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrandComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBrandComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jBrandComboBox.addItem("Maverick");
        jBrandComboBox.addItem("Adidas");
        
        jSizesComboBox.addItem("S");
        jSizesComboBox.addItem("M");
        jSizesComboBox.addItem("L");
        jSizesComboBox.addItem("XL");
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jEmailLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JComboBox<String> jSizesComboBox;
    private javax.swing.JButton jSubmitButton;
    private javax.swing.JButton jSubmitButton1;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables
}
