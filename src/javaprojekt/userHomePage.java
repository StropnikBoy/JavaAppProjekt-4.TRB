package javaprojekt;
import java.awt.Toolkit;
import java.sql.Connection;

public class userHomePage extends javax.swing.JFrame {

    String value;
    
    public userHomePage(String name) {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
                int xSize = (int) tk.getScreenSize().getWidth();
                int ySize = (int) tk.getScreenSize().getHeight();
        this.setSize(xSize, ySize);
        
        jWelcomeLabel.setText("Welcome " + name);
        value = name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLogoutButton = new javax.swing.JButton();
        jTitleLabel = new javax.swing.JTextField();
        jUserEditButton = new javax.swing.JButton();
        jShopButton = new javax.swing.JButton();
        jWelcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLogoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogoutButton.setText("Logout");
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });

        jTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jTitleLabel.setText("Online Store");

        jUserEditButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jUserEditButton.setText("Edit Info");
        jUserEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserEditButtonActionPerformed(evt);
            }
        });

        jShopButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jShopButton.setText("Shop");
        jShopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShopButtonActionPerformed(evt);
            }
        });

        jWelcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jWelcomeLabel.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTitleLabel)
                    .addComponent(jWelcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUserEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jShopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jWelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jShopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUserEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        this.setVisible(false);
        homePage Home = new homePage();
        Home.setVisible(true);
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    private void jUserEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserEditButtonActionPerformed
        this.setVisible(false);
        EditUserInfo Edit = new EditUserInfo(value);
        Edit.setVisible(true);
    }//GEN-LAST:event_jUserEditButtonActionPerformed

    private void jShopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShopButtonActionPerformed
        this.setVisible(false);
        userStore Store = new userStore(value);
        Store.setVisible(true);
    }//GEN-LAST:event_jShopButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userHomePage("HomePage").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jShopButton;
    private javax.swing.JTextField jTitleLabel;
    private javax.swing.JButton jUserEditButton;
    private javax.swing.JLabel jWelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
