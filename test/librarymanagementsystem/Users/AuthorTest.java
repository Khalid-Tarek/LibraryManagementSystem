/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem.Users;

import java.util.List;
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
public class AuthorTest {
    
    public AuthorTest() {
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
     * Test of AddBook method, of class Author.
     */
    @Test
    public void testAddBook() {
        System.out.println("AddBook");
        Book book = null;
        Author instance = null;
        boolean expResult = false;
        boolean result = instance.AddBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveBook method, of class Author.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("RemoveBook");
        Book book = null;
        Author instance = null;
        boolean expResult = false;
        boolean result = instance.RemoveBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOwnedBooks method, of class Author.
     */
    @Test
    public void testGetOwnedBooks() {
        System.out.println("getOwnedBooks");
        Author instance = null;
        List<Book> expResult = null;
        List<Book> result = instance.getOwnedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
