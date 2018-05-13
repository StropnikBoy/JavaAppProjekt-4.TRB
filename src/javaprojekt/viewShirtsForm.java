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
        jTypeLabel = new javax.swing.JLabel();
        jTypeComboBox = new javax.swing.JComboBox<>();

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
        jSizesLabel.setBounds(30, 260, 61, 29);

        jNameComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jNameComboBox);
        jNameComboBox.setBounds(120, 190, 197, 50);

        jBrandComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBrandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrandComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jBrandComboBox);
        jBrandComboBox.setBounds(120, 130, 197, 50);

        jFemaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFemaleRadioButton.setText("Female");
        jPanel1.add(jFemaleRadioButton);
        jFemaleRadioButton.setBounds(120, 340, 83, 31);

        jMaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMaleRadioButton.setText("Male");
        jPanel1.add(jMaleRadioButton);
        jMaleRadioButton.setBounds(240, 340, 65, 31);

        jNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel.setText("Name:");
        jPanel1.add(jNameLabel);
        jNameLabel.setBounds(30, 200, 70, 29);

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
        jBrandLabel.setBounds(30, 140, 70, 29);

        jSizesComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSizesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSizesComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jSizesComboBox);
        jSizesComboBox.setBounds(120, 250, 197, 50);

        jTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTypeLabel.setText("Type:");
        jPanel1.add(jTypeLabel);
        jTypeLabel.setBounds(30, 80, 60, 29);

        jTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTypeComboBoxItemStateChanged(evt);
            }
        });
        jTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTypeComboBoxActionPerformed(evt);
            }
        });
        jTypeComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTypeComboBoxPropertyChange(evt);
            }
        });
        jPanel1.add(jTypeComboBox);
        jTypeComboBox.setBounds(120, 70, 197, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        Integer tempCategory = null;
        
        try 
        {
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM categories");
        
            while (rs.next()) {
                String pat = rs.getString("name");
                jTypeComboBox.addItem(pat);
                tempCategory = Integer.parseInt(pat);
            }
            Conn.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
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
          
        jSizesComboBox.addItem("S");
        jSizesComboBox.addItem("M");
        jSizesComboBox.addItem("L");
        jSizesComboBox.addItem("XL");
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jSizesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSizesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSizesComboBoxActionPerformed

    private void jTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTypeComboBoxActionPerformed
        jNameComboBox.addItem("Niggers");
    }//GEN-LAST:event_jTypeComboBoxActionPerformed

    private void jTypeComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTypeComboBoxPropertyChange
 
    }//GEN-LAST:event_jTypeComboBoxPropertyChange

    private void jTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTypeComboBoxItemStateChanged
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        String value = jTypeComboBox.getSelectedItem().toString();
        String sql = "SELECT id FROM categories WHERE name = '" + value + "'";
        Integer id = Integer.parseInt(sql);

        
        try 
        {
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads WHERE category_id = " + id +"");
        
            while (rs.next()) {
                String pat = rs.getString("name");
                jBrandComboBox.addItem(pat);
            }
            Conn.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTypeComboBoxItemStateChanged

    public static void main(String args[]) {

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
    private javax.swing.JComboBox<String> jTypeComboBox;
    private javax.swing.JLabel jTypeLabel;
    // End of variables declaration//GEN-END:variables
}
