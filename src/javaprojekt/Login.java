package javaprojekt;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login extends javax.swing.JFrame {
Connection Conn = null;  

    public Login() {
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
        jEmailTextBox = new javax.swing.JTextField();
        jPasswordTextBox = new javax.swing.JPasswordField();
        jEmailLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jLoginButton = new javax.swing.JButton();
        jRegisterButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 870));
        setResizable(false);

        jEmailTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailTextBox.setText("Vnesi email...");

        jPasswordTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordTextBox.setToolTipText("Vnesi geslo...");

        jEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailLabel.setText("Email:");

        jPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordLabel.setText("Password:");

        jLoginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLoginButton.setText("Log in");
        jLoginButton.setToolTipText("");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jRegisterButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRegisterButton.setText("Register");
        jRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterButtonActionPerformed(evt);
            }
        });

        jCloseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCloseButton.setText("Close");
        jCloseButton.setToolTipText("");
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Login into your account");

        javax.swing.GroupLayout jRegisterPanelLayout = new javax.swing.GroupLayout(jRegisterPanel);
        jRegisterPanel.setLayout(jRegisterPanelLayout);
        jRegisterPanelLayout.setHorizontalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTitleLabel)
                            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                .addComponent(jPasswordLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jEmailLabel)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jRegisterPanelLayout.setVerticalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordLabel))
                .addGap(30, 30, 30)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setBounds(0, 0, 963, 482);
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        if ( jEmailTextBox.getText().trim().length() == 0
            || jPasswordTextBox.getText().trim().length() == 0)
        {
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Izpolni podatke pravilno.");
        }
        
        {
            Connection Conn;
            Database povezava = new Database();
            Conn = povezava.getConnection();

            String email = jEmailTextBox.getText();
            String password = jPasswordTextBox.getText();

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

            Statement stavek;
            ResultSet rezultati;
            String sql = "SELECT login('"+ email +"', '"+ generatedPassword +"');";

            try 
            {
                stavek = Conn.createStatement();
                rezultati = stavek.executeQuery(sql);

                while (rezultati.next()) {
                int rezultat = rezultati.getInt("login");
                Global.rank = rezultat;
                }
            }

            catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

            String users = "SELECT * FROM getusers();";
            
            try 
            {
                stavek = Conn.createStatement();
                rezultati = stavek.executeQuery(users);

                while (rezultati.next()) {
                String name = rezultati.getString("uname");
                String surname = rezultati.getString("surname");
                Global.name = name;
                Global.surname = surname;
                }
            }
            
            catch (SQLException ex) 
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);

            switch(Global.rank){
                case 0:
                    JOptionPane.showMessageDialog(dialog, "Uspešno ste se prijavli kot user!");
                    this.setVisible(false);
                    userHomePage novo = new userHomePage(jEmailTextBox.getText());
                    novo.setVisible(true);
                    break;

                case 1:
                    JOptionPane.showMessageDialog(dialog, "Uspešno ste se prijavli kot admin!");
                    this.setVisible(false);
                    AdminHomePage admin = new AdminHomePage();
                    admin.setVisible(true);
                    break;

                default:
                    JOptionPane.showMessageDialog(dialog, "Napačno geslo ali uporabniško ime!");
                    break;
            }

            try
            {
                Conn.close();
            }
            
            catch(SQLException ex)
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLoginButtonActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterButtonActionPerformed
        this.setVisible(false);
        Register Registracija = new Register();
        Registracija.setVisible(true);
    }//GEN-LAST:event_jRegisterButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JTextField jEmailTextBox;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JPasswordField jPasswordTextBox;
    private javax.swing.JButton jRegisterButton;
    private javax.swing.JPanel jRegisterPanel;
    private javax.swing.JLabel jTitleLabel;
    // End of variables declaration//GEN-END:variables
}
