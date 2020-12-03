package librarymanagementsystem;
import java.util.List;

/**
 * 
 * @author Abdallah Kareem
 */
public class Author extends User {

    private List <Book> ownedBooks;

    public Author(String USERNAME, int USER_ID, String NAME, List <Book> ownedBooks) {
        super(USERNAME, USER_ID, NAME);
        this.ownedBooks = ownedBooks;
    }

    public boolean AddBook(Book book) {
        if (book == null)
            return false;
        else {
            ownedBooks.add(book);
            //DatabaseUtils.addBookRecord(book);
            return true;
        }
    }

    public boolean RemoveBook(Book book) {
        if (book == null)
            return false;
        else {
            ownedBooks.remove(book);
            //DatabaseUtils.removeBookRecord(book);
            return true;
        }
    }

    public List <Book> getOwnedBooks() {
        return ownedBooks;
    }

}