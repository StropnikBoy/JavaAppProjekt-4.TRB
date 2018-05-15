package javaprojekt;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EditUserInfo extends javax.swing.JFrame {

    String value;
    
    public EditUserInfo(String name) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = (int) tk.getScreenSize().getWidth();
                int ySize = (int) tk.getScreenSize().getHeight();
        this.setSize(xSize, ySize);
        value = name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSurnameLabel = new javax.swing.JLabel();
        jNameLabel = new javax.swing.JLabel();
        jEmailLabel = new javax.swing.JLabel();
        jEmailTextBox = new javax.swing.JTextField();
        jNameTextBox = new javax.swing.JTextField();
        jSurnameTextBox = new javax.swing.JTextField();
        jTitleLabel = new javax.swing.JLabel();
        jEmailLabel1 = new javax.swing.JLabel();
        jKrajComboBox = new javax.swing.JComboBox<>();
        jEmailLabel2 = new javax.swing.JLabel();
        jTelTextBox = new javax.swing.JTextField();
        jDateLabel = new javax.swing.JLabel();
        jDateTextBox = new javax.swing.JTextField();
        jDateLabel1 = new javax.swing.JLabel();
        jPasswordTextBox = new javax.swing.JTextField();
        jSubmitButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSurnameLabel.setText("New surname:");

        jNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel.setText("New name:");

        jEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailLabel.setText("New email:");

        jEmailTextBox.setEditable(false);
        jEmailTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jNameTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jSurnameTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Edit your data");

        jEmailLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailLabel1.setText("New residence:");

        jKrajComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jEmailLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEmailLabel2.setText("New tel:");

        jTelTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDateLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jDateLabel.setText("New bd:");

        jDateTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDateLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jDateLabel1.setText("New password:");

        jPasswordTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jSubmitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSubmitButton.setText("Submit");
        jSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonActionPerformed(evt);
            }
        });

        jCloseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCloseButton.setText("Go Back");
        jCloseButton.setToolTipText("");
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTitleLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jEmailLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jKrajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailLabel)
                                    .addComponent(jSurnameLabel)
                                    .addComponent(jNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(jNameTextBox)
                                    .addComponent(jSurnameTextBox)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailLabel2)
                                    .addComponent(jDateLabel)
                                    .addComponent(jDateLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTelTextBox)
                                    .addComponent(jDateTextBox)
                                    .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSurnameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSurnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKrajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        int id = 0;
        
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

        
        try 
        {
            Conn = povezava.getConnection();
            
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE email = '" + value +"'");
        
            while (rs.next()) {
                String pat = rs.getString("name");
                jNameTextBox.setText(pat);
                pat = rs.getString("Surname");
                jSurnameTextBox.setText(pat);
                pat = rs.getString("Email");
                jEmailTextBox.setText(pat); 
                pat = rs.getString("Tel");  
                jTelTextBox.setText(pat);
                pat = rs.getString("Birthday");
                jDateTextBox.setText(pat);                  
            }
            
            Conn.close();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_formWindowOpened

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed
        if ( jNameTextBox.getText().trim().length() == 0
            || jSurnameTextBox.getText().trim().length() == 0
            || jEmailTextBox.getText().trim().length() == 0
            || jTelTextBox.getText().trim().length() == 0
            || jPasswordTextBox.getText().trim().length() == 0
            || jDateTextBox.getText().trim().length() == 0)
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
            String date = jDateTextBox.getText();
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
        
        System.out.println(generatedPassword);
        
        ResultSet rezultati;
        String sql = "SELECT id FROM residences WHERE post_number = " + x + "";
        ResultSet rezultat;
        
        try 
        {
            Statement stavek = Conn.createStatement();
            String query = "UPDATE users SET name = '" + name + "', surname = '" + surname + "', kraj_id = " + sql + " ";
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

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        this.setVisible(false);
        userHomePage Home = new userHomePage(value);
        Home.setVisible(true);
    }//GEN-LAST:event_jCloseButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUserInfo("EditUsers").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jDateLabel;
    private javax.swing.JLabel jDateLabel1;
    private javax.swing.JTextField jDateTextBox;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jEmailLabel1;
    private javax.swing.JLabel jEmailLabel2;
    private javax.swing.JTextField jEmailTextBox;
    private javax.swing.JComboBox<String> jKrajComboBox;
    private javax.swing.JLabel jNameLabel;
    private javax.swing.JTextField jNameTextBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPasswordTextBox;
    private javax.swing.JButton jSubmitButton;
    private javax.swing.JLabel jSurnameLabel;
    private javax.swing.JTextField jSurnameTextBox;
    private javax.swing.JTextField jTelTextBox;
    private javax.swing.JLabel jTitleLabel;
    // End of variables declaration//GEN-END:variables
}
