/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem.Users;

import librarymanagementsystem.Book;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ahmed
 */
public class LibrarianTest {
    
    public LibrarianTest() {
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
     * Test of removeUser method, of class Librarian.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        Librarian instance = null;
        boolean expResult = false;
        boolean result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveBook method, of class Librarian.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("RemoveBook");
        Book book = null;
        Librarian instance = null;
        boolean expResult = false;
        boolean result = instance.RemoveBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
