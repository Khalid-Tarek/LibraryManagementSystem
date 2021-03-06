package librarymanagementsystem.GUI;

import librarymanagementsystem.*;
import librarymanagementsystem.Users.*;

import javax.swing.JOptionPane;
import java.sql.Date;

/**
 *
 * @author Osama Ahmed Sakr
 */
public class NewBookScreen extends javax.swing.JFrame {

    private final Author currentAuthor;

    /**
     * Creates new form NewBookScreen
     *
     * @param author The author trying to add the new book
     */
    public NewBookScreen(Author author) {
        initComponents();

        this.currentAuthor = author;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        newBookLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        bookNameLabel = new javax.swing.JLabel();
        bookNameTF = new javax.swing.JTextField();
        genreTF = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        fineLabel = new javax.swing.JLabel();
        fineTF = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insertion of Data");
        setResizable(false);

        newBookLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newBookLabel.setText("New Book Entry");

        genreLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genreLabel.setText("Genre");

        bookNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookNameLabel.setText("Book Name");

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        fineLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fineLabel.setText("Fine");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(newBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(genreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addComponent(fineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fineTF)
                            .addComponent(bookNameTF)
                            .addComponent(genreTF))))
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fineTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String bookName = bookNameTF.getText();
        String genre = genreTF.getText();
        String fineStr = fineTF.getText();

        if (bookName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name for your book");
            return;
        }
        if (genre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a genre for your book");
            return;
        }
        if (fineStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a fine for your book");
            return;
        }

        int fine;
        try {
            fine = Integer.parseInt(fineStr);
        } catch (NumberFormatException nex) {
            JOptionPane.showMessageDialog(this, "Your fine is not valid");
            return;
        }

        Date today = new Date(System.currentTimeMillis());
        Book newBook = new Book(0, bookName, genre, currentAuthor.getUSER_ID(), today, fine, 0, true);
        currentAuthor.AddBook(newBook);

        super.dispose();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        super.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JTextField bookNameTF;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel fineLabel;
    private javax.swing.JTextField fineTF;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JTextField genreTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel newBookLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
