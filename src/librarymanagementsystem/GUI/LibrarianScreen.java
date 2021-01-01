package librarymanagementsystem.GUI;

import librarymanagementsystem.Users.*;
import librarymanagementsystem.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osama Ahmed Sakr
 */
public class LibrarianScreen extends javax.swing.JFrame {

    private final Librarian currentLibrarian;
    private List<Book> currentlyVisibleBooks;

    /**
     * Creates new form LibrarianScreen
     *
     * @param librarian The object representation of the librarian currently
     * using the program.
     */
    public LibrarianScreen(Librarian librarian) {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.currentLibrarian = librarian;
        this.setTitle("Librarian: " + currentLibrarian.getNAME());
        displayBooks(DatabaseUtils.getViewableBooks(librarian));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        bookLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        removeBookButton = new javax.swing.JButton();
        removeMemberButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        newAccountButton = new javax.swing.JButton();
        myInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Books");

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Genre", "Written By", "Published On", "Borrowed By", "Fine", "Is Fine Payed?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dataTable);

        bookLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookLabel.setText("Book  Title");

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        removeBookButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeBookButton.setText("Remove Book");
        removeBookButton.setToolTipText("");
        removeBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookButtonActionPerformed(evt);
            }
        });

        removeMemberButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeMemberButton.setText("Remove Member/Author");
        removeMemberButton.setToolTipText("");
        removeMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMemberButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        newAccountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newAccountButton.setText("New Account");
        newAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountButtonActionPerformed(evt);
            }
        });

        myInfoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myInfoButton.setText("My Info");
        myInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(removeMemberButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myInfoButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeBookButton)
                                    .addComponent(newAccountButton))
                                .addGap(0, 8, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bookTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(removeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(newAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myInfoButton)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String bookTitleSearched = bookTF.getText();

        if (bookTitleSearched.isEmpty()) {
            return;
        }

        List<Book> searchBooks = new ArrayList<>();
        for (Book book : currentlyVisibleBooks) {
            if (book.getBOOK_NAME().contains(bookTitleSearched)) {
                searchBooks.add(book);
            }
        }

        displayBooks(searchBooks);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        displayBooks(DatabaseUtils.getViewableBooks(currentLibrarian));
    }//GEN-LAST:event_clearButtonActionPerformed

    private void removeBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookButtonActionPerformed
        int selectedRowIndex = dataTable.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a book");
            return;
        }
        Book selectedBook = currentlyVisibleBooks.get(selectedRowIndex);

        if (selectedBook.isFinePayed()) {
            currentLibrarian.RemoveBook(selectedBook);
            clearButton.doClick();
        } else {
            JOptionPane.showMessageDialog(this, "Can't remove this book, it's fine is not paid");
        }
    }//GEN-LAST:event_removeBookButtonActionPerformed

    private void removeMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMemberButtonActionPerformed
        // TODO add your handling code here:
        RemoveUserScreen removeUser = new RemoveUserScreen(currentLibrarian);
        removeUser.setVisible(true);
        removeUser.setTitle("Remove a User");
        removeUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_removeMemberButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void newAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountButtonActionPerformed
        // TODO add your handling code here:
        RegisterScreen register = new RegisterScreen();
        register.setVisible(true);
        register.setTitle("New Account Registration");
        register.setLocationRelativeTo(null);
    }//GEN-LAST:event_newAccountButtonActionPerformed

    private void myInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInfoButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, currentLibrarian);
    }//GEN-LAST:event_myInfoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookLabel;
    private javax.swing.JTextField bookTF;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton myInfoButton;
    private javax.swing.JButton newAccountButton;
    private javax.swing.JButton removeBookButton;
    private javax.swing.JButton removeMemberButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables

    private void displayBooks(List<Book> books) {

        //clears the current dataTable
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        if(books == null) return;

        currentlyVisibleBooks = books;

        Integer bookID, writtenBy, borrowedBy, fine;
        String bookName, genre;
        Date publishedOn;
        Boolean finePayed;

        for (Book book : currentlyVisibleBooks) {
            bookID = book.getBOOK_ID();
            bookName = book.getBOOK_NAME();
            genre = book.getGENRE();
            writtenBy = book.getWritten_BY();
            publishedOn = book.getPUBLISHED_ON();
            borrowedBy = book.getBorrowedBy();
            fine = book.getFINE();
            finePayed = book.isFinePayed();

            model.addRow(new Object[]{bookID, bookName, genre, writtenBy, publishedOn,
                borrowedBy, fine, finePayed});
        }

    }

}
