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
    
    private DatabaseUtils(){}
    
    public static boolean authenticate(String username, String password){
        boolean loginResult = false;

        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        try {
            stmt = con.createStatement();
            String query = "SELECT * FROM accounts where username='" + username + "' "
                            + "and password='" + password + "'";
            result = stmt.executeQuery(query);

            loginResult = result.next();
        } catch (SQLException ex) {
            System.out.println("Error while authenticating: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }

        return loginResult;
    }

    public static void addUser(User user, String password){
        if(user == null) return;
        
        int userID = 0;
        String username = user.getUSERNAME();
        String name = user.getNAME();
        
        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            stmt = con.createStatement();
            
            String query = "INSERT INTO accounts VALUES ('" + username + "', '"
                    + password + "')";
            
            if(stmt.executeUpdate(query) != 1) {
                System.out.println("Account wasn't added successfully");
                return;
            }
            
            if(user instanceof Member){
                result = stmt.executeQuery("SELECT MAX(member_ID) member_ID FROM members");
                if(result.next()) userID = result.getInt("member_ID") + 1;
                
                Member member = (Member) user;
                List<String> phoneNumbers = member.getPHONE_NUMBERS();
                int credit = member.getCredit();
                int fine = member.getFine();
                
                query = "INSERT INTO members VALUES ("
                        + userID + ", '" + username + "', '" 
                        + name + "', " + credit + ", " + fine + ")";
                
                if(stmt.executeUpdate(query) != 1) {
                    System.out.println("Member wasn't added successfully");
                    return;
                }
                
                for(String number : phoneNumbers){
                    query = "INSERT INTO phones VALUES ('" + username + "', " + number + ")";
                    if(stmt.executeUpdate(query) != 1) {
                        System.out.println("Error happened while adding numbers");
                        return;
                    }
                }
                
            } else if (user instanceof Author) {
                result = stmt.executeQuery("SELECT MAX(author_ID) author_ID FROM authors");
                if(result.next()) userID = result.getInt("author_ID") + 1;
                
                query = "INSERT INTO authors VALUES (" + userID + ", '" 
                        + username + "', '" + name + "')";
                
                if(stmt.executeUpdate(query) != 1){
                    System.out.println("Author wasn't added successfully");
                    return;
                }
                
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
    }
    
    public static void updateUser(User user) {
        
    }
    
    public static void removeUser(User user){
        
    }
    
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
                List<Book> borrowedBooks = getUserBooks(memberID, 'm');
                
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
            query = "SELECT * FROM authors WHERE username'" + username + "'";
            result = stmt.executeQuery(query);
            if(result.next()){
                int authorID = result.getInt("author_ID");
                String authorName = result.getString("author_name");
                List<Book> ownedBooks = getUserBooks(authorID, 'a');
                
                return new Author(username, authorID, authorName, ownedBooks);
            }
        } catch (SQLException ex) {
            System.out.println("Error while getting user: " + ex);
        } finally {
            if (con != null) try {con.close();} catch (SQLException ex){}
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        
        //Otherwise return null if no users were found with the passed username
        return null;
    }
    
    public static void addBookRecord(Book book){
        
    }
    
    public static void updateBookRecord(Book book){
        
    }
    
    public static void removeBookRecord(Book book){
        
    }
    
    public static List<Book> getViewableBooks(User user){
        
        if(user instanceof Member){
            
        } else if(user instanceof Librarian){
            
        } else if(user instanceof Author){
            
        }
        
        return new ArrayList<>();
    }
    
    /**
     * This method was taken from to satisfy the purposes of this utility class
     * http://blog.salamtura.com/post/database-connection-utility-class-in-java/
     */
    private static void initConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Can't load Driver: ClassNotFoundException");
        } 
        System.out.println(DB_URL);
        try {
            con = DriverManager.getConnection(DB_URL);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    private static List<String> getPhoneNumbers(int memberID){
        
        return new ArrayList<>();
    }
    
    private static List<Book> getUserBooks(int userID, char userType){
        
        List<Book> userBooks = new ArrayList<>();
        
        initConnection();
        Statement stmt = null;
        ResultSet result = null;
        
        try {
            String query = "";
            if (userType == 'm') {
                query = "SELECT * FROM books WHERE borrowed_by='" + userID + "'";
            } else if (userType == 'a') {
                query = "SELECT * FROM books WHERE written_by='" + userID + "'";
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
                fine = result.getInt("fine");
                borrowedBy = result.getInt("borrowed_y");
                finePayed = result.getBoolean("fine_payed");
                
                userBooks.add(new Book(bookID, bookName, bookGenre, writtenBy, 
                        publishedOn, fine, borrowedBy, finePayed));
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error will getting user books: "+ ex);
        } finally {
            if (stmt != null) try {stmt.close();} catch (SQLException ex){}
            if (result != null) try {result.close();} catch (SQLException ex){}
        }
        
        return userBooks;
    }
}
