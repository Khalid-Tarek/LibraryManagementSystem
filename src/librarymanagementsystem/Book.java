package librarymanagementsystem;

import java.util.Date;

/**
 * 
 * @author Abdallah Kareem
 */
public class Book {
    final private int BOOK_ID;
    final private String BOOK_NAME;
    final private String GENRE;
    final private int Written_BY;
    final private Date PUBLISHED_ON;
    final private int FINE;
    private int borrowedBy;
    private boolean finePayed;

    public Book(int BOOK_ID, String BOOK_NAME, String GENRE, int Written_BY, 
            Date PUBLISHED_ON, int FINE, int borrowedBy, boolean finePayed) {
        this.BOOK_ID = BOOK_ID;
        this.BOOK_NAME = BOOK_NAME;
        this.GENRE = GENRE;
        this.Written_BY = Written_BY;
        this.PUBLISHED_ON = PUBLISHED_ON;
        this.FINE = FINE;
        this.borrowedBy = borrowedBy;
        this.finePayed = finePayed;
    }


    public int getBOOK_ID() {
        return BOOK_ID;
    }

    public String getBOOK_NAME() {
        return BOOK_NAME;
    }

    public String getGENRE() {
        return GENRE;
    }

    public int getWritten_BY() {
        return Written_BY;
    }

    public Date getPUBLISHED_ON() {
        return PUBLISHED_ON;
    }

    public int getFINE() {
        return FINE;
    }

    public int getBorrowedBy() {
        return borrowedBy;
    }

    public boolean isFinePayed() {
        return finePayed;
    }


    public void setBorrowedBy(int memberID) {
        this.borrowedBy = memberID;
    }

    public void setFinePayed(boolean finePayed) {
        this.finePayed = finePayed;
    }

}