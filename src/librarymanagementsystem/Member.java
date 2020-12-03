package librarymanagementsystem;

import java.util.List;

/**
 * 
 * @author Abdallah Kareem
 */
public class Member extends User {

    final private List <String> PHONE_NUMBERS;
    private List <Book> borrowedBooks;
    private int credit;
    private int fine;


    public Member(String USERNAME, int USER_ID, String NAME, List <String> PHONE_NUMBERS, 
            List <Book> borrowedBooks, int credit, int fine) {
        super(USERNAME, USER_ID, NAME);
        this.PHONE_NUMBERS = PHONE_NUMBERS;
        this.borrowedBooks = borrowedBooks;
        this.credit = credit;
        this.fine = fine;
    }

    public void addCredit(int credit) {
        this.credit += credit;
    }

    public boolean borrowBook(Book book) {
        if (book == null)
            return false;
        else {
            borrowedBooks.add(book);
            book.setBorrowedBy(getUSER_ID());
            fine += book.getFINE();
            return true;
        }
    }

    public boolean hasBook(Book book) {
        if (book == null)
            return false;
        else if (borrowedBooks.contains(book))
            return true;
        else return false;
    }

    public boolean payFine(Book book) {
        if (book == null)
            return false;
        else if (borrowedBooks.contains(book)) {
            if (credit >= book.getFINE()) {
                credit -= book.getFINE();
                fine -= book.getFINE();
                book.setFinePayed(true);
                return true;
            } else return false;
        } else return false;
    }

    public boolean returnBook(Book book) {
        if (book == null)
            return false;
        else if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setBorrowedBy(0);
            return true;
        } else return false;
    }


    public List <String> getPHONE_NUMBERS() {
        return PHONE_NUMBERS;
    }


    public List <Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public int getCredit() {
        return credit;
    }


    public int getFine() {
        return fine;
    }

}