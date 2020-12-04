package librarymanagementsystem.GUI;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import librarymanagementsystem.Book;
import librarymanagementsystem.DatabaseUtils;
import librarymanagementsystem.Users.*;

/**
 *
 * @author Osama Ahmed Sakr
 */
public class MemberScreen extends javax.swing.JFrame {

    private final Member currentMember;
    private List<Book> currentlyVisibleBooks;   

    /**
     * Creates new form LibrarianScreen
     * @param member The object representation of the member currently using the program.
     */
    public MemberScreen( Member member ) {
        initComponents();
        
        this.currentMember = member;
        this.setTitle("Member: " + currentMember.getNAME());
        creditLabel.setText("My Credit: " + currentMember.getCredit());
        finesLabel.setText("My Fines: " + currentMember.getFine());
        displayBooks(currentMember.getBorrowedBooks());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        bookLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        addCreditButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        payFineButton = new javax.swing.JButton();
        myInfoButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        creditLabel = new javax.swing.JLabel();
        finesLabel = new javax.swing.JLabel();
        switchTButton = new javax.swing.JToggleButton();
        borrowBook = new javax.swing.JButton();

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

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        addCreditButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addCreditButton.setText("Add Credit");
        addCreditButton.setToolTipText("");
        addCreditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCreditButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        payFineButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payFineButton.setText("Pay Fine");
        payFineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payFineButtonActionPerformed(evt);
            }
        });

        myInfoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myInfoButton.setText("My Info");
        myInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInfoButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("My Books");

        creditLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        creditLabel.setText("My Credit: 0");

        finesLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finesLabel.setText("My Fines: 0");

        switchTButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        switchTButton.setText("Show Library Books");
        switchTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchTButtonActionPerformed(evt);
            }
        });

        borrowBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        borrowBook.setText("Borrow Book");
        borrowBook.setEnabled(false);
        borrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bookTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(switchTButton)
                                    .addGap(45, 45, 45)
                                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)))
                            .addComponent(myInfoButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCreditButton)
                            .addComponent(creditLabel)
                            .addComponent(finesLabel)
                            .addComponent(payFineButton)
                            .addComponent(borrowBook))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(switchTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(creditLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finesLabel)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(addCreditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(payFineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(borrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myInfoButton)))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String bookTitleSearched = bookTF.getText();
        
        if(bookTitleSearched.isEmpty()) return;
        
        List<Book> searchBooks = new ArrayList<>();
        for(Book book : currentlyVisibleBooks){
            if(book.getBOOK_NAME().contains(bookTitleSearched)) 
                searchBooks.add(book);
        }
        
        displayBooks(searchBooks);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        //If you're viewing the library books, clears to them, otherwise clears to my books
        displayBooks(switchTButton.isSelected()?
                DatabaseUtils.getViewableBooks(currentMember)
                :currentMember.getBorrowedBooks());
        creditLabel.setText("My Credit: " + currentMember.getCredit());
        finesLabel.setText("My Fines: " + currentMember.getFine());
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addCreditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCreditButtonActionPerformed
        
        String input = JOptionPane.showInputDialog(this, "Please enter an amount to add");
        
        try{
            int addedAmount = Integer.parseInt(input);
            currentMember.addCredit(addedAmount);
            refreshButton.doClick();
        } catch (NumberFormatException nex){
            JOptionPane.showMessageDialog(this, "Your entered amount is invalid");
        }
    }//GEN-LAST:event_addCreditButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void payFineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payFineButtonActionPerformed
        int selectedRowIndex = dataTable.getSelectedRow();
        
        if(selectedRowIndex == -1){
            JOptionPane.showMessageDialog(this, "Please select a book");
            return;
        }
        Book selectedBook = currentlyVisibleBooks.get(selectedRowIndex);
        
        if(selectedBook.isFinePayed()){
            JOptionPane.showMessageDialog(this, "Book's fine is already paid");
        } else if(!currentMember.payFine(selectedBook)){
            JOptionPane.showMessageDialog(this, "You don't have enough credit");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Fine payed Successfully!");
        }
                
        int returnBook = JOptionPane.showConfirmDialog(this, "Would you like to return this book?");
        if(returnBook == JOptionPane.YES_OPTION){
            currentMember.returnBook(selectedBook);
        }
        
        refreshButton.doClick();
    }//GEN-LAST:event_payFineButtonActionPerformed

    private void myInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInfoButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, currentMember);
    }//GEN-LAST:event_myInfoButtonActionPerformed

    private void switchTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchTButtonActionPerformed
        if(switchTButton.isSelected()){
            switchTButton.setText("Show My Books");
            titleLabel.setText("Library Books");
            borrowBook.setEnabled(true);
            payFineButton.setEnabled(false);
            displayBooks(DatabaseUtils.getViewableBooks(currentMember));
        } else {
            switchTButton.setText("Show Library Books");
            titleLabel.setText("My Books");
            borrowBook.setEnabled(false);
            payFineButton.setEnabled(true);
            displayBooks(currentMember.getBorrowedBooks());
        }
    }//GEN-LAST:event_switchTButtonActionPerformed

    private void borrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBookActionPerformed
        int selectedRowIndex = dataTable.getSelectedRow();
        
        if(selectedRowIndex == -1){
            JOptionPane.showMessageDialog(this, "Please select a book");
            return;
        }
        
        currentMember.borrowBook(currentlyVisibleBooks.get(selectedRowIndex));
        refreshButton.doClick();
    }//GEN-LAST:event_borrowBookActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCreditButton;
    private javax.swing.JLabel bookLabel;
    private javax.swing.JTextField bookTF;
    private javax.swing.JButton borrowBook;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel finesLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton myInfoButton;
    private javax.swing.JButton payFineButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JToggleButton switchTButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void displayBooks(List<Book> books) {
        
        //clears the current dataTable
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        int rows = model.getRowCount();
        if(rows > 0){
            for (int i = 0; i < rows; i++){
                model.removeRow(0);
            }  
        }
        
        currentlyVisibleBooks = books;
                
        Integer bookID, writtenBy, borrowedBy, fine;
        String bookName, genre;
        Date publishedOn;
        Boolean finePayed;
        
        for(Book book: currentlyVisibleBooks){
            bookID = book.getBOOK_ID();
            bookName = book.getBOOK_NAME();
            genre = book.getGENRE();
            writtenBy = book.getWritten_BY();
            publishedOn = book.getPUBLISHED_ON();
            borrowedBy = book.getBorrowedBy();
            fine = book.getFINE();
            finePayed = book.isFinePayed();
            
            model.addRow(new Object[] {bookID, bookName, genre, writtenBy, publishedOn, 
                    borrowedBy, fine, finePayed});
        }
        
    }
}
