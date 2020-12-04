/*
 * Property of Abdallah Kareem; Ahmed Elsayed Mostafa; Khalid Tariq; Osama Ahmed Sakr
 * Do not edit at risk of legal action
 */
package librarymanagementsystem.GUI;

import static librarymanagementsystem.DatabaseUtils.*;
import librarymanagementsystem.Users.*;
import javax.swing.JOptionPane;
        
/**
 *
 * @author OsamaSakr
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        userTF = new javax.swing.JTextField();
        passTF = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton);
        loginButton.setBounds(350, 240, 250, 30);

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton);
        exitButton.setBounds(643, 433, 270, 50);

        infoButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        infoButton.setText("Info");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(infoButton);
        infoButton.setBounds(20, 450, 80, 23);
        jPanel2.add(userTF);
        userTF.setBounds(270, 190, 200, 30);
        userTF.getAccessibleContext().setAccessibleParent(this);

        jPanel2.add(passTF);
        passTF.setBounds(480, 190, 200, 30);

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Username:");
        jPanel2.add(userLabel);
        userLabel.setBounds(270, 160, 130, 30);

        passLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password:");
        jPanel2.add(passLabel);
        passLabel.setBounds(480, 160, 130, 30);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/GUI/Background_Image.jpg"))); // NOI18N
        backgroundLabel.setText("jLabel2");
        jPanel2.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1030, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = userTF.getText();
        String password = passTF.getText();
        
        if(username.isEmpty())
            JOptionPane.showMessageDialog(this, "Please enter a username!");
        
        if(password.isEmpty())
            JOptionPane.showMessageDialog(this, "Please enter a password!");
        
        if(authenticate(username, password)){
            User user  = getUser(username);
            
            if (user instanceof Member) {
                MemberScreen screen = new MemberScreen((Member) user);
                screen.setVisible(true);
            } else if (user instanceof Librarian) {
                LibrarianScreen screen = new LibrarianScreen((Librarian) user);
                screen.setVisible(true);
            } else if (user instanceof Author) {
                AuthorScreen screen = new AuthorScreen((Author) user);
                screen.setVisible(true);
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Wrong username or password!");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Library Management System\n\nMade by:\nAbdallah Kareem               - 18-00223\nAhmed Elsayed Mostafa  -  18-00179\nKhalid Tariq                         -  18-00371\nOsama Ahmed Sakr         -  18-00389");
    }//GEN-LAST:event_infoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
