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
public class MemberTest {
    
    public MemberTest() {
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
     * Test of addCredit method, of class Member.
     */
    @Test
    public void testAddCredit() {
        System.out.println("addCredit");
        int credit = 0;
        Member instance = null;
        instance.addCredit(credit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrowBook method, of class Member.
     */
    @Test
    public void testBorrowBook() {
        System.out.println("borrowBook");
        Book book = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.borrowBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasBook method, of class Member.
     */
    @Test
    public void testHasBook() {
        System.out.println("hasBook");
        Book book = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.hasBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payFine method, of class Member.
     */
    @Test
    public void testPayFine() {
        System.out.println("payFine");
        Book book = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.payFine(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class Member.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        Book book = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.returnBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPHONE_NUMBERS method, of class Member.
     */
    @Test
    public void testGetPHONE_NUMBERS() {
        System.out.println("getPHONE_NUMBERS");
        Member instance = null;
        List<String> expResult = null;
        List<String> result = instance.getPHONE_NUMBERS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBorrowedBooks method, of class Member.
     */
    @Test
    public void testGetBorrowedBooks() {
        System.out.println("getBorrowedBooks");
        Member instance = null;
        List<Book> expResult = null;
        List<Book> result = instance.getBorrowedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCredit method, of class Member.
     */
    @Test
    public void testGetCredit() {
        System.out.println("getCredit");
        Member instance = null;
        int expResult = 0;
        int result = instance.getCredit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFine method, of class Member.
     */
    @Test
    public void testGetFine() {
        System.out.println("getFine");
        Member instance = null;
        int expResult = 0;
        int result = instance.getFine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
