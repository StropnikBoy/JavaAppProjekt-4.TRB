package javaprojekt;
import javaprojekt.AdminForms.AdminHomePage;
import javaprojekt.UserForms.UserStore;
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

        jTitleLabel = new javax.swing.JLabel();
        jRegisterPanel = new javax.swing.JPanel();
        jEmailTextBox = new javax.swing.JTextField();
        jPasswordTextBox = new javax.swing.JPasswordField();
        jEmailLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jLoginButton = new javax.swing.JButton();
        jRegisterButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 870));
        setResizable(false);

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Login into your account");

        jEmailTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailTextBox.setText("Vnesi email...");
        jEmailTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmailTextBoxMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jRegisterPanelLayout = new javax.swing.GroupLayout(jRegisterPanel);
        jRegisterPanel.setLayout(jRegisterPanelLayout);
        jRegisterPanelLayout.setHorizontalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jRegisterPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailLabel)
                                    .addComponent(jPasswordLabel))
                                .addGap(30, 30, 30)
                                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRegisterPanelLayout.setVerticalGroup(
            jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailLabel)
                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordLabel)
                    .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTitleLabel)
                        .addGap(607, 607, 607))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(470, 470, 470))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEmailTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmailTextBoxMouseClicked
        jEmailTextBox.setText(null);
    }//GEN-LAST:event_jEmailTextBoxMouseClicked

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        
        String email = jEmailTextBox.getText();
        String password = jPasswordTextBox.getText();
        
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
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        
        Connection Conn;
        Statement stavek;
        ResultSet rezultati;
        String sql = "SELECT login('"+email+"', '"+password+"');";
        
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        try {
            stavek = Conn.createStatement();
            rezultati = stavek.executeQuery(sql);
            
            while (rezultati.next()) {
            int rezultat = rezultati.getInt("login");
            Global.rank = rezultat;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String users = "SELECT * FROM getusers();";
        try {
            stavek = Conn.createStatement();
            rezultati = stavek.executeQuery(users);
            
            while (rezultati.next()) {
            String name = rezultati.getString("uname");
            String surname = rezultati.getString("surname");
            Global.name = name;
            Global.surname = surname;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        switch(Global.rank){
            case 0:
                this.setVisible(false);
                UserStore novo = new UserStore();
                novo.setVisible(true);
                break;
                
            case 1:
                this.setVisible(false);
                AdminHomePage admi = new AdminHomePage();
                admi.setVisible(true);
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Napačno geslo ali uporabniško ime!");
                break;
        }
        
        try{
        Conn.close();
        }catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
