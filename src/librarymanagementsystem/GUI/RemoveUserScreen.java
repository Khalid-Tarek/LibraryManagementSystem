package librarymanagementsystem.GUI;

import java.util.List;
import librarymanagementsystem.*;
import librarymanagementsystem.Users.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osama Ahmed Sakr
 */
public class RemoveUserScreen extends javax.swing.JFrame {

    private final Librarian currentLibrarian;
    private List<User> currentlyVisibleUsers;

    public RemoveUserScreen(Librarian librarian) {
        initComponents();

        this.currentLibrarian = librarian;
        displayUsers(DatabaseUtils.getMembersAndAuthors());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        removeIDButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        removeIDLabel = new javax.swing.JLabel();
        removeIDTF = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update and Delete");

        removeIDButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeIDButton.setText("Remove Using ID");
        removeIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeIDButtonActionPerformed(evt);
            }
        });

        removeUserButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("Remove Members or Authors");

        removeIDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeIDLabel.setText("Enter UserID of the user you want to remove");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "Username", "Name", "Type", "Fines"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(removeIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeIDTF))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        int selectedRowIndex = userTable.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user");
            return;
        }
        User selectedUser = currentlyVisibleUsers.get(selectedRowIndex);

        removeUser(selectedUser);
    }//GEN-LAST:event_removeUserButtonActionPerformed

    private void removeIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeIDButtonActionPerformed
        int enteredID;
        try {
            enteredID = Integer.parseInt(removeIDTF.getText());
        } catch (NumberFormatException nex) {
            JOptionPane.showMessageDialog(this, "Your entered ID is invalid");
            return;
        }
        
        removeUser(enteredID);
    }//GEN-LAST:event_removeIDButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        super.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeIDButton;
    private javax.swing.JLabel removeIDLabel;
    private javax.swing.JTextField removeIDTF;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

    private void displayUsers(List<User> users) {

        //clears the current dataTable
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }

        currentlyVisibleUsers = users;

        Integer userID;
        String username, name, type = "", fine = "";

        for (User user : users) {
            userID = user.getUSER_ID();
            username = user.getUSERNAME();
            name = user.getNAME();

            if (user instanceof Member) {
                fine = ((Member) user).getFine() + "";
                type = "Member";
            } else if (user instanceof Author) {
                fine = " ";
                type = "Author";
            }

            model.addRow(new Object[]{userID, username, name, type, fine});
        }

    }

    private void removeUser(User user) {

        if (user instanceof Member) {
            Member memberUser = (Member) user;

            //Check if the member has no more fines to pay
            if (memberUser.getFine() == 0) {

                //Return all books the user borrowed (Since they have no more fines to pay)
                for (Book book : memberUser.getBorrowedBooks()) {
                    memberUser.returnBook(book);
                }

            } else {
                JOptionPane.showMessageDialog(this, "This member has not "
                        + "paid all his fines. Can't remove him");
                return;
            }
        } else if (user instanceof Author) {
            Author authorUser = (Author) user;

            //Check that all the author's books have their fines paid
            boolean finesPaid = true;
            for (Book book : authorUser.getOwnedBooks()) {
                if (!book.isFinePayed()) {
                    finesPaid = false;
                    break;
                }
            }

            //If all fines are paid, remove all books and then the author.
            if (finesPaid) {
                for (Book book : authorUser.getOwnedBooks()) {
                    currentLibrarian.RemoveBook(book);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Can't remove author, some of "
                        + "their books have pending fines");
                return;
            }

        } else {
            JOptionPane.showMessageDialog(this, "You chose a Librarian? How?! "
                    + "That's Illegal! Shoot him or something!");
            return;
        }

        currentLibrarian.removeUser(user);
        displayUsers(DatabaseUtils.getMembersAndAuthors());
    }

    private void removeUser(int userID) {
        if ((userID / 100000) == 2) {
            JOptionPane.showMessageDialog(this, "The userID you entered could "
                    + "belong to a librarian. You can't remove other librarians");
            return;
        }
        for (User user : currentlyVisibleUsers) {
            if (user.getUSER_ID() == userID) {
                removeUser(user);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Couldn't find a user with this id");
    }

}
