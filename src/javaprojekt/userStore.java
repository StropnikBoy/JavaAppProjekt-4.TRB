package javaprojekt;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;

public class userStore extends javax.swing.JFrame {

    String value;
    
    public userStore(String name) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = (int) tk.getScreenSize().getWidth();
                int ySize = (int) tk.getScreenSize().getHeight();
        this.setSize(xSize, ySize);
        groupButton();
        
        jWelcomeLabel.setText("Welcome " + name);
        value = name;
    }
    
    private void groupButton()
    {
        ButtonGroup bg1 = new ButtonGroup();
        
        bg1.add(jMaleRadioButton);
        bg1.add(jFemaleRadioButton);
    }
        
    String radioText = "";
    String Type = "";
    String Brand = "";
    String Name = "";
    String Picture = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jWelcomeLabel = new javax.swing.JLabel();
        jGenderLabel = new javax.swing.JLabel();
        jTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jSizesLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSizesLabel.setText("Sizes:");
        jPanel1.add(jSizesLabel);
        jSizesLabel.setBounds(30, 300, 61, 29);

        jNameComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jNameComboBoxItemStateChanged(evt);
            }
        });
        jPanel1.add(jNameComboBox);
        jNameComboBox.setBounds(120, 230, 197, 50);

        jBrandComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBrandComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jBrandComboBoxItemStateChanged(evt);
            }
        });
        jPanel1.add(jBrandComboBox);
        jBrandComboBox.setBounds(120, 170, 197, 50);

        jFemaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFemaleRadioButton.setText("Female");
        jFemaleRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFemaleRadioButtonMouseClicked(evt);
            }
        });
        jPanel1.add(jFemaleRadioButton);
        jFemaleRadioButton.setBounds(230, 370, 83, 31);

        jMaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMaleRadioButton.setText("Male");
        jMaleRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMaleRadioButtonMouseClicked(evt);
            }
        });
        jPanel1.add(jMaleRadioButton);
        jMaleRadioButton.setBounds(130, 370, 65, 31);

        jNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNameLabel.setText("Name:");
        jPanel1.add(jNameLabel);
        jNameLabel.setBounds(30, 240, 70, 29);

        jCheckoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckoutButton.setText("Checkout");
        jCheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckoutButton);
        jCheckoutButton.setBounds(260, 440, 200, 50);

        jCancelButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCancelButton.setText("Go Back");
        jCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jCancelButton);
        jCancelButton.setBounds(40, 440, 200, 50);

        jBrandLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBrandLabel.setText("Brand:");
        jPanel1.add(jBrandLabel);
        jBrandLabel.setBounds(30, 180, 70, 29);

        jSizesComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSizesComboBox);
        jSizesComboBox.setBounds(120, 290, 197, 50);

        jTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTypeLabel.setText("Type:");
        jPanel1.add(jTypeLabel);
        jTypeLabel.setBounds(30, 120, 60, 29);

        jTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTypeComboBoxItemStateChanged(evt);
            }
        });
        jPanel1.add(jTypeComboBox);
        jTypeComboBox.setBounds(120, 110, 197, 50);

        jWelcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jWelcomeLabel.setText("Welcome:");
        jPanel1.add(jWelcomeLabel);
        jWelcomeLabel.setBounds(30, 60, 290, 29);

        jGenderLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jGenderLabel.setText("Sizes:");
        jPanel1.add(jGenderLabel);
        jGenderLabel.setBounds(30, 370, 61, 29);

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Buy Items");
        jPanel1.add(jTitleLabel);
        jTitleLabel.setBounds(30, 10, 140, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFemaleRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFemaleRadioButtonMouseClicked
        radioText = "Female";
    }//GEN-LAST:event_jFemaleRadioButtonMouseClicked

    private void jMaleRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMaleRadioButtonMouseClicked
        radioText = "Male";
    }//GEN-LAST:event_jMaleRadioButtonMouseClicked

    private void jCheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckoutButtonActionPerformed
        this.setVisible(false);
        Checkout Checking = new Checkout(value);
        Checking.setVisible(true);
    }//GEN-LAST:event_jCheckoutButtonActionPerformed

    private void jCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonActionPerformed
        this.setVisible(false);
        userHomePage Home = new userHomePage(value);
        Home.setVisible(true);
    }//GEN-LAST:event_jCancelButtonActionPerformed

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
                jTypeComboBox.addItem(pat);
            }
            Conn.close();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_formWindowOpened

    private void jTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTypeComboBoxItemStateChanged
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        Type = jTypeComboBox.getSelectedItem().toString(); 
        jBrandComboBox.removeAllItems();

        try 
        {
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads WHERE category_id = (SELECT id FROM categories WHERE name = '" + Type + "')");
        
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

    private void jBrandComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jBrandComboBoxItemStateChanged
        Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
                
        if (jBrandComboBox.getItemCount() == 0)
        {      
            try 
            {
                Statement stmt = Conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM pictures WHERE ad_id = (SELECT id FROM ads WHERE name = '" + Brand + "')");

                while (rs.next()) {
                    String pat = rs.getString("name");
                    jNameComboBox.addItem(pat);
                }
                Conn.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else
        {
            Brand = jBrandComboBox.getSelectedItem().toString(); 
            jNameComboBox.removeAllItems();
            
            try 
            {
                Statement stmt = Conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM pictures WHERE ad_id = (SELECT id FROM ads WHERE name = '" + Brand + "')");
        
                while (rs.next()) {
                    String pat = rs.getString("name");
                    jNameComboBox.addItem(pat);
                }
                Conn.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBrandComboBoxItemStateChanged

    private void jNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jNameComboBoxItemStateChanged
        /*Connection Conn;
        Database povezava = new Database();
        Conn = povezava.getConnection();
        
        if (jNameComboBox.getItemCount() == 0)
        { 
            try 
            {
                Statement stmt = Conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM pictures name ='" + Picture + "'");
                String pat = rs.getString("url");
                Conn.close();
                
                URL url = new URL(pat);
                Image image = ImageIO.read(url);
                jPictureBox.setIcon(new ImageIcon(image));
            }
            catch (IOException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex)
            {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else
        {
            Picture = jNameComboBox.getSelectedItem().toString();
            jSizesComboBox.removeAllItems();
            
            try 
            {
                Statement stmt = Conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM pictures name ='" + Picture + "'");                
                String pat = rs.getString("url");
                Conn.close();
                
                URL url = new URL(pat);
                Image image = ImageIO.read(url);
                jPictureBox.setIcon(new ImageIcon(image));
            }
            catch (IOException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex)
            {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        jSizesComboBox.removeAllItems();
        jSizesComboBox.addItem("S");
        jSizesComboBox.addItem("M");
        jSizesComboBox.addItem("L");
        jSizesComboBox.addItem("XL");
    }//GEN-LAST:event_jNameComboBoxItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userStore("UserStore").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBrandComboBox;
    private javax.swing.JLabel jBrandLabel;
    private javax.swing.JButton jCancelButton;
    private javax.swing.JButton jCheckoutButton;
    private javax.swing.JRadioButton jFemaleRadioButton;
    private javax.swing.JLabel jGenderLabel;
    private javax.swing.JRadioButton jMaleRadioButton;
    private javax.swing.JComboBox<String> jNameComboBox;
    private javax.swing.JLabel jNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jSizesComboBox;
    private javax.swing.JLabel jSizesLabel;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JComboBox<String> jTypeComboBox;
    private javax.swing.JLabel jTypeLabel;
    private javax.swing.JLabel jWelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
