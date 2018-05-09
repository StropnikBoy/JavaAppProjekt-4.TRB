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

public class Register extends javax.swing.JFrame {
Connection Conn = null;     
    
    public Register() {
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

        jTitleLabel = new javax.swing.JLabel();
        jRegisterPanel = new javax.swing.JPanel();
        jNameTextBox = new javax.swing.JTextField();
        jEmailTextBox = new javax.swing.JTextField();
        jPasswordTextBox = new javax.swing.JPasswordField();
        jConfirmationTextBox = new javax.swing.JPasswordField();
        jNameLabel = new javax.swing.JLabel();
        jEmailLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jConfirmLabel = new javax.swing.JLabel();
        jSubmitButton = new javax.swing.JButton();
        jClearButton = new javax.swing.JButton();
        jTelTextBox = new javax.swing.JTextField();
        jKrajComboBox = new javax.swing.JComboBox<>();
        jKrajLabel = new javax.swing.JLabel();
        jTelLabel = new javax.swing.JLabel();
        jDateLabel = new javax.swing.JLabel();
        jDanTextBox = new javax.swing.JTextField();
        jMonthTextBox = new javax.swing.JTextField();
        jYearTextBox = new javax.swing.JTextField();
        jSurnameTextBox = new javax.swing.JTextField();
        jSurnameLabel = new javax.swing.JLabel();
        jCloseButton = new javax.swing.JButton();
        jLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 870));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTitleLabel.setText("Create an account");

        jNameTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNameTextBox.setText("Vnesi ime..");
        jNameTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNameTextBoxMouseClicked(evt);
            }
        });

        jEmailTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jEmailTextBox.setText("Vnesi email...");
        jEmailTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmailTextBoxMouseClicked(evt);
            }
        });

        jPasswordTextBox.setToolTipText("Vnesi geslo...");

        jConfirmationTextBox.setToolTipText("Vnesi ponovno...");

        jNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel.setText("Name:");

        jEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailLabel.setText("Email:");

        jPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordLabel.setText("Password:");

        jConfirmLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jConfirmLabel.setText("Confirmation:");

        jSubmitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSubmitButton.setText("Submit");
        jSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonActionPerformed(evt);
            }
        });

        jClearButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jClearButton.setText("Clear");

        jTelTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTelTextBox.setText("Vnesi telefonsko...");
        jTelTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTelTextBoxMouseClicked(evt);
            }
        });

        jKrajComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKrajComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKrajComboBoxActionPerformed(evt);
            }
        });

        jKrajLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jKrajLabel.setText("Kraj bivanja:");

        jTelLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTelLabel.setText("Telefonska številka:");

        jDateLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jDateLabel.setText("Datum rojstva:");

        jDanTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDanTextBox.setText("Dan");
        jDanTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDanTextBoxMouseClicked(evt);
            }
        });

        jMonthTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMonthTextBox.setText("Mesec");
        jMonthTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMonthTextBoxMouseClicked(evt);
            }
        });

        jYearTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jYearTextBox.setText("Leto");
        jYearTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jYearTextBoxMouseClicked(evt);
            }
        });

        jSurnameTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSurnameTextBox.setText("Vnesi priimek..");
        jSurnameTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSurnameTextBoxMouseClicked(evt);
            }
        });

        jSurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSurnameLabel.setText("Surname:");

        jCloseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCloseButton.setText("Close");
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });

        jLoginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLoginButton.setText("Login");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jRegisterPanelLayout = new javax.swing.GroupLayout(jRegisterPanel);
        jRegisterPanel.setLayout(jRegisterPanelLayout);
        jRegisterPanelLayout.setHorizontalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSurnameLabel)
                                    .addComponent(jNameLabel)
                                    .addComponent(jEmailLabel))
                                .addGap(141, 141, 141)
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSurnameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jKrajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTelLabel)
                                    .addComponent(jDateLabel)
                                    .addComponent(jPasswordLabel)
                                    .addComponent(jConfirmLabel))
                                .addGap(34, 34, 34)
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jConfirmationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jKrajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTelTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                            .addComponent(jDanTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jMonthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jYearTextBox))
                                        .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jRegisterPanelLayout.setVerticalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNameLabel)
                    .addComponent(jNameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSurnameLabel)
                    .addComponent(jSurnameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKrajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKrajLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTelLabel))
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDanTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMonthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jYearTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jConfirmationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jConfirmLabel)))
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPasswordLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(592, 592, 592)
                        .addComponent(jTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jSurnameTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSurnameTextBoxMouseClicked
        jSurnameTextBox.setText(null);
    }//GEN-LAST:event_jSurnameTextBoxMouseClicked

    private void jYearTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jYearTextBoxMouseClicked
        jYearTextBox.setText(null);
    }//GEN-LAST:event_jYearTextBoxMouseClicked

    private void jMonthTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMonthTextBoxMouseClicked
        jMonthTextBox.setText(null);
    }//GEN-LAST:event_jMonthTextBoxMouseClicked

    private void jDanTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDanTextBoxMouseClicked
        jDanTextBox.setText(null);
    }//GEN-LAST:event_jDanTextBoxMouseClicked

    private void jKrajComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKrajComboBoxActionPerformed
      //Aa
    }//GEN-LAST:event_jKrajComboBoxActionPerformed

    private void jTelTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTelTextBoxMouseClicked
        jTelTextBox.setText(null);
    }//GEN-LAST:event_jTelTextBoxMouseClicked

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed
        if ( jNameTextBox.getText().trim().length() == 0
            || jSurnameTextBox.getText().trim().length() == 0
            || jEmailTextBox.getText().trim().length() == 0
            || jTelTextBox.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Izpolni podatke pravilno.");
        }

        {
            Connection Conn;
            Database povezava = new Database();
            Conn = povezava.getConnection();

            Object varName = (Object)jKrajComboBox.getSelectedItem();
            String varPost = varName.Convert.ToString;
            

            String x = "HAah";   System.out.println(x.substring(0,4));
            String value = jKrajComboBox.getSelectedItem().toString();

            String name = jNameTextBox.getText();
            String surname = jSurnameTextBox.getText();
            String email = jEmailTextBox.getText();
            String tel = jTelTextBox.getText();
            String kraj_id = "SELECT id FROM residences WHERE post_number = ""
            String date = jYearTextBox.getText() + "-" + jMonthTextBox.getText() + "-" + jDayTextBox.getText();
            String password = jPasswordTextBox.getText();
            String confirmation = jConfirmationTextBox.getText();
            Integer rank = 0;

            String passwordToHash = password;
            String generatedPassword = null;
            
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(passwordToHash.getBytes());
                byte[] bytes = md.digest();

                StringBuilder sb = new StringBuilder();
                for(int i=0; i< bytes.length ;i++)
                {
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                //Get complete hashed password in hex format
                generatedPassword = sb.toString();
            }
        
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        
        System.out.println(generatedPassword);
        
        Statement stavek;
        ResultSet rezultati;
        String sql = "SELECT usersview ('" + name + "', '" + surname + "', '" + email + "', '" + kraj_id + "', '" + tel + "', '" + date + "', '" + password + "', '" + confirmation + "', '" + rank + "')";
        
        try 
        {
            stavek = Conn.createStatement();
            rezultati = stavek.executeQuery(sql);
            
            while (rezultati.next()) {
            int rezultat = rezultati.getInt(1);
            
            if(rezultat == 1)
            {
                JOptionPane.showMessageDialog(null, "Uspešna registracija!");
                String sql = "SELECT register ('" + name + "', '" + surname + "', '" + email + "', '" + kraj_id + "', '" + tel + "', '" + date + "', '" + password + "', '" + confirmation + "', '" + rank + "')";
                this.setVisible(false);
                Login Prijava = new Login();
                Prijava.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Email je ze v uporabi.");         
            }
                Conn.close();
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    }//GEN-LAST:event_jSubmitButtonActionPerformed

    private void jEmailTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmailTextBoxMouseClicked
        jEmailTextBox.setText(null);
    }//GEN-LAST:event_jEmailTextBoxMouseClicked

    private void jNameTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNameTextBoxMouseClicked
        jNameTextBox.setText(null);
    }//GEN-LAST:event_jNameTextBoxMouseClicked

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        this.setVisible(false);
        Login Prijava = new Login();
        Prijava.setVisible(true);
    }//GEN-LAST:event_jLoginButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        try 
        {
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM residences"); //FIX
        
            while (rs.next()) {
                String pat = rs.getString("name");
                String pat2 = rs.getString("post_number");
                jKrajComboBox.addItem(pat2 + " " + pat);
            }
            Conn.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jClearButton;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jConfirmLabel;
    private javax.swing.JPasswordField jConfirmationTextBox;
    private javax.swing.JTextField jDanTextBox;
    private javax.swing.JLabel jDateLabel;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JTextField jEmailTextBox;
    private javax.swing.JComboBox<String> jKrajComboBox;
    private javax.swing.JLabel jKrajLabel;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JTextField jMonthTextBox;
    private javax.swing.JLabel jNameLabel;
    private javax.swing.JTextField jNameTextBox;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JPasswordField jPasswordTextBox;
    private javax.swing.JPanel jRegisterPanel;
    private javax.swing.JButton jSubmitButton;
    private javax.swing.JLabel jSurnameLabel;
    private javax.swing.JTextField jSurnameTextBox;
    private javax.swing.JLabel jTelLabel;
    private javax.swing.JTextField jTelTextBox;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JTextField jYearTextBox;
    // End of variables declaration//GEN-END:variables
}
