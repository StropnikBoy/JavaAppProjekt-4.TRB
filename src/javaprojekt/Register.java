package javaprojekt;
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
import javax.swing.JDialog;

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
        jTelTextBox = new javax.swing.JTextField();
        jKrajComboBox = new javax.swing.JComboBox<>();
        jKrajLabel = new javax.swing.JLabel();
        jTelLabel = new javax.swing.JLabel();
        jDateLabel = new javax.swing.JLabel();
        jDayTextBox = new javax.swing.JTextField();
        jMonthTextBox = new javax.swing.JTextField();
        jYearTextBox = new javax.swing.JTextField();
        jSurnameTextBox = new javax.swing.JTextField();
        jSurnameLabel = new javax.swing.JLabel();
        jCloseButton = new javax.swing.JButton();
        jLoginButton = new javax.swing.JButton();
        jTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jRegisterPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jNameTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNameTextBox.setText("Vnesi ime..");

        jEmailTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jEmailTextBox.setText("Vnesi email...");

        jPasswordTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordTextBox.setToolTipText("Vnesi geslo...");

        jConfirmationTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        jTelTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTelTextBox.setText("Vnesi telefonsko...");

        jKrajComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jKrajLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jKrajLabel.setText("Kraj bivanja:");

        jTelLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTelLabel.setText("Telefonska številka:");

        jDateLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jDateLabel.setText("Datum rojstva:");

        jDayTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDayTextBox.setText("Dan");

        jMonthTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMonthTextBox.setText("Mesec");

        jYearTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jYearTextBox.setText("Leto");

        jSurnameTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSurnameTextBox.setText("Vnesi priimek..");

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

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Create an account");

        javax.swing.GroupLayout jRegisterPanelLayout = new javax.swing.GroupLayout(jRegisterPanel);
        jRegisterPanel.setLayout(jRegisterPanelLayout);
        jRegisterPanelLayout.setHorizontalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jConfirmLabel)
                                    .addComponent(jSurnameLabel)
                                    .addComponent(jNameLabel)
                                    .addComponent(jTelLabel)
                                    .addComponent(jDateLabel)
                                    .addComponent(jKrajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jEmailLabel)
                                    .addComponent(jPasswordLabel))
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSurnameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jEmailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jKrajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTelTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                                    .addComponent(jDayTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jMonthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jYearTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jConfirmationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRegisterPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTitleLabel)))
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRegisterPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        jRegisterPanelLayout.setVerticalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitleLabel)
                .addGap(32, 32, 32)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameLabel)
                    .addComponent(jNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSurnameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSurnameLabel))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDayTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMonthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jYearTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordLabel)
                    .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConfirmationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConfirmLabel))
                .addGap(39, 39, 39)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        setBounds(0, 0, 885, 818);
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed
        if ( jNameTextBox.getText().trim().length() == 0
            || jSurnameTextBox.getText().trim().length() == 0
            || jEmailTextBox.getText().trim().length() == 0
            || jTelTextBox.getText().trim().length() == 0
            || jPasswordTextBox.getText().trim().length() == 0
            || jConfirmationTextBox.getText().trim().length() == 0)
        {
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Izpolni podatke pravilno.");
        }

        {
            Connection Conn;
            Database povezava = new Database();
            Conn = povezava.getConnection();
            
            String value = jKrajComboBox.getSelectedItem().toString();
            String x = value.substring(0,4);

            String name = jNameTextBox.getText();
            String surname = jSurnameTextBox.getText();
            String email = jEmailTextBox.getText();
            String tel = jTelTextBox.getText();
            String kraj_id = "SELECT id FROM residences WHERE post_number = " + Integer.parseInt(x);
            String date = jYearTextBox.getText() + "-" + jMonthTextBox.getText() + "-" + jDayTextBox.getText();
            String password = jPasswordTextBox.getText();
            String confirmation = jConfirmationTextBox.getText();
            Integer rank = 0;

            String passwordToHash = password;
            String generatedPassword = null;
                        
            try 
            {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(passwordToHash.getBytes());
                byte[] bytes = md.digest();

                StringBuilder sb = new StringBuilder();
                for(int i=0; i< bytes.length ;i++)
                {
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                generatedPassword = sb.toString();
            }
        
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
            
            String confirmationToHash = confirmation;
            String generatedConfirm = null;
            
            try 
            {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(confirmationToHash.getBytes());
                byte[] bytes = md.digest();

                StringBuilder sb = new StringBuilder();
                for(int i=0; i< bytes.length ;i++)
                {
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                //Get complete hashed password in hex format
                generatedConfirm = sb.toString();
            }
        
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
        
        System.out.println(generatedPassword);
        System.out.println(generatedConfirm);
        
        ResultSet rezultati;
        String sql = "SELECT usersview ('" + name + "', '" + surname + "', '" + email + "', '" + kraj_id + "', '" + tel + "', '" + date + "', '" + password + "', '" + confirmation + "', '" + rank + "')";
        ResultSet rezultat;
        
        try 
        {
            Statement stavek = Conn.createStatement();
            String query = "SELECT register ('" + name + "', '" + surname + "', '" + email + "', (" + kraj_id + "), '" + tel + "', '" + date + "', '" + generatedPassword + "', '" + generatedConfirm + "', " + rank + ")";
            System.out.println(query);
            Statement statement = Conn.createStatement();
            rezultat = statement.executeQuery(query);
            
            while(rezultat.next()){
                int er = rezultat.getInt("register");
                System.out.println(er);
            }
            
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Uspešno ste se registrirali");
            this.setVisible(false);
            Login Prijava = new Login();
            Prijava.setVisible(true);
                
            Conn.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    }//GEN-LAST:event_jSubmitButtonActionPerformed

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
            ResultSet rs = stmt.executeQuery("SELECT * FROM residences");
        
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jConfirmLabel;
    private javax.swing.JPasswordField jConfirmationTextBox;
    private javax.swing.JLabel jDateLabel;
    private javax.swing.JTextField jDayTextBox;
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
