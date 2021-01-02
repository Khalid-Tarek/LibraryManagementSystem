/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.util.List;
import librarymanagementsystem.Users.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author Ahmed
 */
public class DatabaseUtilsTest {
    
    public DatabaseUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of authenticate method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username = "Ahmed";
        String password = "00000";
        boolean expResult = false;
        boolean result = DatabaseUtils.authenticate(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of addUser method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testAddUser() {
        System.out.println("addUser");
        User user = null;
        String password = "";
        boolean expResult = false;
        boolean result = DatabaseUtils.addUser(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User user = null;
        DatabaseUtils.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        DatabaseUtils.removeUser(user);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testGetUser() {
        System.out.println("getUser");
        String username = "";
        User expResult = null;
        User result = DatabaseUtils.getUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addBookRecord method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testAddBookRecord() {
        System.out.println("addBookRecord");
        Book book = null;
        DatabaseUtils.addBookRecord(book);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateBookRecord method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testUpdateBookRecord() {
        System.out.println("updateBookRecord");
        Book book = null;
        DatabaseUtils.updateBookRecord(book);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookRecord method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testRemoveBookRecord() {
        System.out.println("removeBookRecord");
        Book book = null;
        DatabaseUtils.removeBookRecord(book);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getViewableBooks method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testGetViewableBooks() {
        System.out.println("getViewableBooks");
        User user = null;
        List<Book> expResult = null;
        List<Book> result = DatabaseUtils.getViewableBooks(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMembersAndAuthors method, of class DatabaseUtils.
     */
    @org.junit.Test
    public void testGetMembersAndAuthors() {
        System.out.println("getMembersAndAuthors");
        List<User> result = DatabaseUtils.getMembersAndAuthors();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
