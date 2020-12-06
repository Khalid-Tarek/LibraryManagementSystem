package librarymanagementsystem.GUI;

import librarymanagementsystem.*;
import librarymanagementsystem.Users.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osama Ahmed Sakr
 */
public class AuthorScreen extends javax.swing.JFrame {

    private final Author currentAuthor;
    private List<Book> currentlyVisibleBooks;

    /**
     * Creates new form LibrarianScreen
     *
     * @param author The object representation of the author currently using the
     * program.
     */
    public AuthorScreen(Author author) {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.currentAuthor = author;
        this.setTitle("Author: " + currentAuthor.getNAME());
        displayBooks(DatabaseUtils.getViewableBooks(author));
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
        closeButton = new javax.swing.JButton();
        newBookButton = new javax.swing.JButton();
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

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        newBookButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newBookButton.setText("New Book");
        newBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(myInfoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newBookButton)
                            .addComponent(removeBookButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(removeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(newBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myInfoButton)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
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
        displayBooks(DatabaseUtils.getViewableBooks(currentAuthor));
    }//GEN-LAST:event_clearButtonActionPerformed

    private void removeBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookButtonActionPerformed
        int selectedRowIndex = dataTable.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a book");
            return;
        }
        Book selectedBook = currentlyVisibleBooks.get(selectedRowIndex);

        if (selectedBook.isFinePayed()) {
            currentAuthor.RemoveBook(selectedBook);
            clearButton.doClick();
        } else {
            JOptionPane.showMessageDialog(this, "Can't remove this book, it's fine is not paid");
        }
    }//GEN-LAST:event_removeBookButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void newBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookButtonActionPerformed
        // TODO add your handling code here:
        NewBookScreen newBook = new NewBookScreen(currentAuthor);
        newBook.setVisible(true);
        newBook.setTitle("New Book Record");
        newBook.setLocationRelativeTo(null);
    }//GEN-LAST:event_newBookButtonActionPerformed

    private void myInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInfoButtonActionPerformed
        JOptionPane.showMessageDialog(this, currentAuthor);
    }//GEN-LAST:event_myInfoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookLabel;
    private javax.swing.JTextField bookTF;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton myInfoButton;
    private javax.swing.JButton newBookButton;
    private javax.swing.JButton removeBookButton;
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
