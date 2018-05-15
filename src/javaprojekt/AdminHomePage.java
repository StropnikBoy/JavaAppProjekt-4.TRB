package javaprojekt;
import java.awt.Toolkit;
import javaprojekt.homePage;
import javaprojekt.adminClasses;

public class AdminHomePage extends javax.swing.JFrame {

    public AdminHomePage() {
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

        jPanel1 = new javax.swing.JPanel();
        jTitleLabel = new javax.swing.JTextField();
        jWelcomeLabel = new javax.swing.JLabel();
        jAddItemsButton = new javax.swing.JButton();
        jEditItemsButton = new javax.swing.JButton();
        jLogoutButton = new javax.swing.JButton();
        jClassesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jTitleLabel.setText("Admin Page");

        jWelcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jWelcomeLabel.setText("Welcome");

        jAddItemsButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jAddItemsButton.setText("Brands");
        jAddItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddItemsButtonActionPerformed(evt);
            }
        });

        jEditItemsButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEditItemsButton.setText("Items");
        jEditItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditItemsButtonActionPerformed(evt);
            }
        });

        jLogoutButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogoutButton.setText("Logout");
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });

        jClassesButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jClassesButton.setText("Classes");
        jClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClassesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jWelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jAddItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jEditItemsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jClassesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jWelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAddItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEditItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditItemsButtonActionPerformed
        this.setVisible(false);
        adminClasses NewItems = new adminClasses();
        NewItems.setVisible(true);
    }//GEN-LAST:event_jEditItemsButtonActionPerformed

    private void jAddItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddItemsButtonActionPerformed
        this.setVisible(false);
        adminBrands Brands = new adminBrands();
        Brands.setVisible(true);
    }//GEN-LAST:event_jAddItemsButtonActionPerformed

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        this.setVisible(false);
        homePage Home = new homePage();
        Home.setVisible(true);
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    private void jClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClassesButtonActionPerformed
        this.setVisible(false);
        adminClasses Class = new adminClasses();
        Class.setVisible(true);
    }//GEN-LAST:event_jClassesButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddItemsButton;
    private javax.swing.JButton jClassesButton;
    private javax.swing.JButton jEditItemsButton;
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTitleLabel;
    private javax.swing.JLabel jWelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
