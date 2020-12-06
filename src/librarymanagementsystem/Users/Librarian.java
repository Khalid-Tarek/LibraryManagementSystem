package librarymanagementsystem.Users;

import librarymanagementsystem.DatabaseUtils;
import librarymanagementsystem.Book;

/**
 *
 * @author Abdallah Kareem
 */
public class Librarian extends User {

    public Librarian(String user, int ID, String name) {
        super(user, ID, name);
    }

    public boolean removeUser(User user) {
        if (user == null) {
            return false;
        } else {
            DatabaseUtils.removeUser(user);
            return true;
        }
    }

    public boolean RemoveBook(Book book) {
        if (book == null) {
            return false;
        } else {
            DatabaseUtils.removeBookRecord(book);
            return true;
        }
    }

}
