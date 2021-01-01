package librarymanagementsystem;

import librarymanagementsystem.Users.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Khalid Tarek
 */
public class DatabaseUtils {
    private static final String DB_NAME = "LibraryDatabase";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "12345";
    private static final String DB_URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;"
                                        + "databaseName=" + DB_NAME + ";"
                                        + "user=" + USERNAME + ";"
                                        + "password=" + PASSWORD + ";";
    
    private static Connection con;
    
    /**
     * A private constructor for this class to block instantiation this class.
     */
    private DatabaseUtils(){}
    
    /**
     * Method that checks if the passed username and password correspond to a 
     * record in the accounts table.
     * @param username username of the user trying to log in.
     * @param password password of the user trying to log in.
     * @return true if there is a record with the given credentials in the accounts table, or false not.
     */
    public static boolean authenticate(String username, String password){
        boolean loginResult = false;

        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        try {
            stmt = con.createStatement();
            String query = "SELECT * FROM accounts WHERE username='" + username + "' "
                            + "AND password='" + password + "'";
            result = stmt.executeQuery(query);

            loginResult = result.next();
        } catch (SQLException ex) {
            System.out.println("Error in authenticate: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }

        return loginResult;
    }

    /**
     * Adds the passed user object as a new record in the appropriate table
     * Also creates an accounts record for the user to log in.
     * @param user      User object of type Member or Author.
     * @param password  A string password to create an accounts table.
     * @return          Returns true if the user was added, false if an error happened
     */
    public static boolean addUser(User user, String password){
        if(user == null || user instanceof Librarian) return false;
        
        //Safety integer just in case an error happens while getting the max userID.
        int userID = 0;
        String username = user.getUSERNAME();
        String name = user.getNAME();
        
        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            stmt = con.createStatement();
            
            //Create an account record for this user
            String query = "INSERT INTO accounts VALUES ('" + username + "', '"
                    + password + "')";
            
            if(stmt.executeUpdate(query) != 1) {
                System.out.println("Account wasn't added successfully");
                return false;
            }
            
            if(user instanceof Member){
                result = stmt.executeQuery("SELECT MAX(member_ID) member_ID FROM members");
                if(result.next()) 
                    userID = result.getInt("member_ID") + 1;
                else
                    userID = 100001;
                
                Member member = (Member) user;
                int credit = member.getCredit();
                int fine = member.getFine();
                
                query = "INSERT INTO members VALUES ("
                        + userID + ", '" + username + "', '" 
                        + name + "', " + credit + ", " + fine + ")";
                
                if(stmt.executeUpdate(query) != 1) {
                    System.out.println("Member wasn't added successfully");
                    return false;
                }
                
                //Add the user's phone numbers in the phones table
                List<String> phoneNumbers = member.getPHONE_NUMBERS();
                if(phoneNumbers != null){
                    
                    for (String number : phoneNumbers) {
                        query = "INSERT INTO phones VALUES ('" + username + "', " + number + ")";
                        if (stmt.executeUpdate(query) != 1) {
                            System.out.println("Error happened while adding numbers");
                            return false;
                        }
                    }
                }
                
            } else if (user instanceof Author) {
                result = stmt.executeQuery("SELECT MAX(author_ID) author_ID FROM authors");
                if(result.next()) 
                    userID = result.getInt("author_ID") + 1;
                else
                    userID = 300001;
                
                query = "INSERT INTO authors VALUES (" + userID + ", '" 
                        + username + "', '" + name + "')";
                
                if(stmt.executeUpdate(query) != 1){
                    System.out.println("Author wasn't added successfully");
                    return false;
                }
                
            }

        } catch (SQLException ex) {
            System.out.println("Error in addUser: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        
        return true;
    }
    
    /**
     * Updates the passed user in the appropraite table. Currently the only
     * functionality for this method is updating credit and fine attributes in 
     * the table.
     * @param user Member you want to update in the database.
     */
    public static void updateUser(User user) {
        
        if(user instanceof Member){
            Member member = (Member) user;
            int memberID = member.getUSER_ID();
            int credit = member.getCredit();
            int fine = member.getFine();
            
            initConnection();
            Statement stmt = null;
            try {
                stmt = con.createStatement();
                
                String query = "UPDATE members SET credit=" + credit 
                        + ", fine=" + fine + " WHERE member_ID=" + memberID;
                
                if(stmt.executeUpdate(query) != 1) System.out.println("Update didn't work");
                
            } catch (SQLException ex) {
                System.out.println("Error in updateUser: " + ex);
            } finally {
                if (con != null) try {con.close();} catch (SQLException ex){}
                if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            }
        }
        
    }
    
    /**
     * Removes the passed user from the system after making sure no books are 
     * related to this user.
     * @param user Member or Author that is to be deleted from the database.
     */
    public static boolean removeUser(User user){
        if (user == null || user instanceof Librarian) return false;
        boolean result = false;
        initConnection();
        Statement stmt = null;
        
        try {
            stmt = con.createStatement();
            String query = "";
            
            if (user instanceof Member) {
                //if the member still borrowed books, return early without doing anything
                if(!((Member) user).getBorrowedBooks().isEmpty()){
                    System.out.println("Can't remove member, they still have borrowed books");
                    return false;
                }
                query = "DELETE FROM accounts WHERE username='" + user.getUSERNAME() + "'";
                
            } else if (user instanceof Author) {
                //if the author still owns books, return early without doing anything
                if(!((Author) user).getOwnedBooks().isEmpty()){
                    System.out.println("Can't remove author, they still have owned books");
                    return false;
                }
                query = "DELETE FROM accounts WHERE username='" + user.getUSERNAME() + "'";
                
            }
            
            if(stmt.executeUpdate(query) != 1) System.out.println("Removing user didn't work!");
            else result = true;
        } catch (SQLException ex) {
            System.out.println("Error in removeUser: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
        }
        
        return result;
    }
    
    /**
     * A method used to return a user object that corresponds with the passed username
     * Checks all the tables (members, librarians and authors) and creates an object
     * according to where the username was found.
     * @param username A string username only one account has
     * @return         A user object
     */
    public static User getUser(String username){
        
        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        try {
            stmt = con.createStatement();
            
            //Check if there's a member record with the passed username
            String query = "SELECT * FROM members WHERE username='" + username + "'";
            result = stmt.executeQuery(query);
            if(result.next()){
                int memberID = result.getInt("member_ID");
                String memberName = result.getString("member_name");
                List<String> phoneNumbers = getPhoneNumbers(memberID);
                int credit = result.getInt("credit");
                int fine = result.getInt("fine");
                List<Book> borrowedBooks = getUserBooks(memberID);
                
                return new Member(username, memberID, memberName, phoneNumbers, 
                        borrowedBooks, credit, fine);
            }
            
            //Check if there's a librarian record with the passed username
            query = "SELECT * FROM librarians WHERE username='" + username + "'";
            result = stmt.executeQuery(query);
            if(result.next()){
                int librarianID = result.getInt("librarian_ID");
                String librarianName = result.getString("librarian_name");
                
                return new Librarian(username, librarianID, librarianName);
            }
            
            //Check if there's an author record with the passed username
            query = "SELECT * FROM authors WHERE username='" + username + "'";
            result = stmt.executeQuery(query);
            if(result.next()){
                int authorID = result.getInt("author_ID");
                String authorName = result.getString("author_name");
                List<Book> ownedBooks = getUserBooks(authorID);
                
                return new Author(username, authorID, authorName, ownedBooks);
            }
        } catch (SQLException ex) {
            System.out.println("Error in getUser: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        
        //Otherwise return null if no users were found with the passed username
        return null;
    }
    
    /**
     * Adds the passed book as a record to the books table
     * @param book The new book to be added
     */
    public static void addBookRecord(Book book){
        if(book == null)
            return;
        int bookID = 0;
        String bookName = book.getBOOK_NAME();
        String genre = book.getGENRE();
        int bookFine = book.getFINE();
        int writtenBy = book.getWritten_BY();
        Date publishedOn = book.getPUBLISHED_ON();
        
        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            stmt = con.createStatement();
            String query = "SELECT MAX(book_ID) as book_ID FROM books";
            result = stmt.executeQuery(query);
            
            if(result.next()) 
                bookID = result.getInt("book_ID") + 1;
            else
                bookID = 1;
            
            query = "INSERT INTO books VALUES (" + bookID + ", '"+ bookName 
                    + "', '" + genre + "', " + bookFine + ", " + writtenBy
                    + ", NULL, '" + publishedOn + "', 1)";
            
            if(stmt.executeUpdate(query) != 1) System.out.println("The book wasn't added");
            
        } catch (SQLException ex) {
            System.out.println("Error in addBook: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
    }
    
    /**
     * Updates the passed book in the database. Currently it only updates the 
     * borrowed_by and fine_payed attributes.
     * @param book 
     */
    public static void updateBookRecord(Book book){
        if(book == null) return;
        
        String borrowedBy = (book.getBorrowedBy() == 0)? "NULL" : book.getBorrowedBy() + "" ;
        int finePayed = book.isFinePayed()? 1 : 0 ;
        
        initConnection();
        Statement stmt = null;
        
        try {
            stmt = con.createStatement();
            String query = "UPDATE books SET borrowed_by=" + borrowedBy + ", fine_payed=" 
                    + finePayed + " WHERE book_ID=" + book.getBOOK_ID();
            
            if(stmt.executeUpdate(query) != 1) System.out.println("Book wasn't updated");
            
        } catch (SQLException ex) {
            System.out.println("Error in updateBook: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
        }
    }
    
    /**
     * Removes the passed book from the database. If the book's fine is not paid, do nothing
     * @param book Book to be removed from the database.
     */
    public static void removeBookRecord(Book book){
        if(book == null || !book.isFinePayed()) {
            System.out.println("Can't remove book, please pay it's fine first");
            return;
        }
        
        initConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            String query = "DELETE FROM books WHERE book_ID=" + book.getBOOK_ID();
            
            if(stmt.executeUpdate(query) != 1) System.out.println("The book wasn't removed");
            
        } catch (SQLException ex) {
            System.out.println("Error in removeBookRecord: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
        }
        
        book = null;
    }
    
    /**
     * Returns a list of books that the user should see on their screen
     * Member:      A list of books the user can borrow
     * Librarian:   A list of all books
     * Author:      A list of their owned books
     * 
     * @param user  A user of any type
     * @return      A list of books
     */
    public static List<Book> getViewableBooks(User user){
        
        List<Book> viewableBooks = new ArrayList<>();
        
        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            String query = "";
            if(user instanceof Member){
                int memberID = user.getUSER_ID();
                query = "SELECT * FROM books WHERE borrowed_by IS NULL";
            } else if (user instanceof Author)
                query = "SELECT * FROM books WHERE written_by=" + user.getUSER_ID();
             else if(user instanceof Librarian)
                query = "SELECT * FROM books";
            
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            
            int bookID, writtenBy, fine, borrowedBy;
            String bookName, bookGenre;
            boolean finePayed;
            Date publishedOn;
            
            while(result.next()){
                bookID = result.getInt("book_ID");
                bookName = result.getString("book_name");
                bookGenre = result.getString("genre");
                writtenBy = result.getInt("written_by");
                publishedOn = result.getDate("published_on");
                fine = result.getInt("book_fine");
                borrowedBy = result.getInt("borrowed_by");
                finePayed = result.getBoolean("fine_payed");
                
                viewableBooks.add(new Book(bookID, bookName, bookGenre, writtenBy, 
                        publishedOn, fine, borrowedBy, finePayed));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error in getViewableBooks: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        if(viewableBooks.isEmpty())
            return null;
        return viewableBooks;
    }
    
    /**
     * A method used by a librarian to get all the members and authors in the database
     * @return A list of users registered in the database
     */
    public static List<User> getMembersAndAuthors() {
        List<User> users = new ArrayList<>();
        
        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            stmt = con.createStatement();
            
            result = stmt.executeQuery("SELECT username FROM members");
            while(result.next()){
                users.add(getUser(result.getString("username")));
            }
            
            result = stmt.executeQuery("SELECT username FROM authors");
            while(result.next()){
                users.add(getUser(result.getString("username")));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error in getMembersAndAuthors: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex ){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        
        return users;
    }
    
    /**
     * This method was inspired from the following blog post 
     * to satisfy the purposes of this utility class
     * http://blog.salamtura.com/post/database-connection-utility-class-in-java/
     */
    private static void initConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Can't load Driver: ClassNotFoundException");
        } 
        try {
            con = DriverManager.getConnection(DB_URL);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    /**
     * A helper method used to retrieve a member's phone numbers
     * @param memberID  The member's unique ID
     * @return          A list of (strings) phone numbers
     */
    private static List<String> getPhoneNumbers(int memberID){
        List<String> numbers = new ArrayList<>();
        
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            String query = "SELECT * FROM phones WHERE member_ID=" + memberID;
            
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            
            while(result.next())
                numbers.add(result.getString("number"));
            
        } catch (SQLException ex) {
            System.out.println("Error in getPhoneNumbers: " + ex);
        } finally {
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        
        return numbers;
    }
    
    /**
     * A helper method used to retrieve a user's books
     * @param userID    The user's unique ID (type differentiate by the first digit) 
     * @return          A list of books the user borrowed/owns
     */
    private static List<Book> getUserBooks(int userID){
        
        List<Book> userBooks = new ArrayList<>();
        
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            String query = "";
            if ((userID / 100000) == 1) {
                query = "SELECT * FROM books WHERE borrowed_by=" + userID;
            } else if ((userID / 100000) == 3) {
                query = "SELECT * FROM books WHERE written_by=" + userID;
            }
            
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            
            int bookID, writtenBy, fine, borrowedBy;
            String bookName, bookGenre;
            boolean finePayed;
            Date publishedOn;
            
            while(result.next()){
                bookID = result.getInt("book_ID");
                bookName = result.getString("book_name");
                bookGenre = result.getString("genre");
                writtenBy = result.getInt("written_by");
                publishedOn = result.getDate("published_on");
                fine = result.getInt("book_fine");
                borrowedBy = result.getInt("borrowed_by");
                finePayed = result.getBoolean("fine_payed");
                
                userBooks.add(new Book(bookID, bookName, bookGenre, writtenBy, 
                        publishedOn, fine, borrowedBy, finePayed));
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error in getUserBooks: " + ex);
        } finally {
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        
        return userBooks;
    }
}
