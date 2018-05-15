package javaprojekt;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Checkout extends javax.swing.JFrame {

    String value;
    
    public Checkout(String name) {
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
        jAdressTextBox = new javax.swing.JTextField();
        jTitleLabel = new javax.swing.JLabel();
        jTownTextBox = new javax.swing.JTextField();
        jCountryTextBox = new javax.swing.JTextField();
        jPostTextBox = new javax.swing.JTextField();
        jCardNumberTextBox = new javax.swing.JTextField();
        jMonthTextBox = new javax.swing.JTextField();
        jYearTextBox = new javax.swing.JTextField();
        jCCV2TextBox = new javax.swing.JTextField();
        jGoBackButton = new javax.swing.JButton();
        jBuyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAdressTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jAdressTextBox.setText("Adress...");

        jTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jTitleLabel.setText("Billing Adress");

        jTownTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTownTextBox.setText("Town/City...");

        jCountryTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCountryTextBox.setText("Country/State...");

        jPostTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPostTextBox.setText("Postcode/Zip...");

        jCardNumberTextBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCardNumberTextBox.setText("Card Number");

        jMonthTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMonthTextBox.setText("mm");

        jYearTextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jYearTextBox.setText("yyyy");

        jCCV2TextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCCV2TextBox.setText("CVV2 Number");

        jGoBackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jGoBackButton.setText("Go Back");
        jGoBackButton.setActionCommand("Back");
        jGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGoBackButtonActionPerformed(evt);
            }
        });

        jBuyButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBuyButton.setText("Buy");
        jBuyButton.setActionCommand("Back");
        jBuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPostTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCountryTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(jTownTextBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAdressTextBox, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jMonthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jYearTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCardNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCCV2TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jGoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jBuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitleLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jAdressTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTownTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCountryTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPostTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jCardNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMonthTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jYearTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCCV2TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGoBackButtonActionPerformed
        this.setVisible(false);
        userStore Store = new userStore(value);
        Store.setVisible(true);
    }//GEN-LAST:event_jGoBackButtonActionPerformed

    private void jBuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuyButtonActionPerformed
        if ( jAdressTextBox.getText().trim().length() == 0
            || jTownTextBox.getText().trim().length() == 0
            || jCountryTextBox.getText().trim().length() == 0
            || jPostTextBox.getText().trim().length() == 0
            || jCardNumberTextBox.getText().trim().length() == 0
            || jMonthTextBox.getText().trim().length() == 0
            || jYearTextBox.getText().trim().length() == 0
            || jCCV2TextBox.getText().trim().length() == 0)
        {
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Izpolni podatke pravilno.");
        }
        {
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "Uspešno ste nakupli!");
            
            this.setVisible(false);
            userHomePage Home = new userHomePage(value);
            Home.setVisible(true);
        }
    }//GEN-LAST:event_jBuyButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout("Checking out").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAdressTextBox;
    private javax.swing.JButton jBuyButton;
    private javax.swing.JTextField jCCV2TextBox;
    private javax.swing.JTextField jCardNumberTextBox;
    private javax.swing.JTextField jCountryTextBox;
    private javax.swing.JButton jGoBackButton;
    private javax.swing.JTextField jMonthTextBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPostTextBox;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JTextField jTownTextBox;
    private javax.swing.JTextField jYearTextBox;
    // End of variables declaration//GEN-END:variables
}
