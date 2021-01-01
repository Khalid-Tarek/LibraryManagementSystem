/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.sql.Date;
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
public class BookTest {
    
    public BookTest() {
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
     * Test of getBOOK_ID method, of class Book.
     */
    @Test
    public void testGetBOOK_ID() {
        System.out.println("getBOOK_ID");
        Book instance = null;
        int expResult = 0;
        int result = instance.getBOOK_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBOOK_NAME method, of class Book.
     */
    @Test
    public void testGetBOOK_NAME() {
        System.out.println("getBOOK_NAME");
        Book instance = null;
        String expResult = "";
        String result = instance.getBOOK_NAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGENRE method, of class Book.
     */
    @Test
    public void testGetGENRE() {
        System.out.println("getGENRE");
        Book instance = null;
        String expResult = "";
        String result = instance.getGENRE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWritten_BY method, of class Book.
     */
    @Test
    public void testGetWritten_BY() {
        System.out.println("getWritten_BY");
        Book instance = null;
        int expResult = 0;
        int result = instance.getWritten_BY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPUBLISHED_ON method, of class Book.
     */
    @Test
    public void testGetPUBLISHED_ON() {
        System.out.println("getPUBLISHED_ON");
        Book instance = null;
        Date expResult = null;
        Date result = instance.getPUBLISHED_ON();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFINE method, of class Book.
     */
    @Test
    public void testGetFINE() {
        System.out.println("getFINE");
        Book instance = null;
        int expResult = 0;
        int result = instance.getFINE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBorrowedBy method, of class Book.
     */
    @Test
    public void testGetBorrowedBy() {
        System.out.println("getBorrowedBy");
        Book instance = null;
        int expResult = 0;
        int result = instance.getBorrowedBy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFinePayed method, of class Book.
     */
    @Test
    public void testIsFinePayed() {
        System.out.println("isFinePayed");
        Book instance = null;
        boolean expResult = false;
        boolean result = instance.isFinePayed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBorrowedBy method, of class Book.
     */
    @Test
    public void testSetBorrowedBy() {
        System.out.println("setBorrowedBy");
        int memberID = 0;
        Book instance = null;
        instance.setBorrowedBy(memberID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFinePayed method, of class Book.
     */
    @Test
    public void testSetFinePayed() {
        System.out.println("setFinePayed");
        boolean finePayed = false;
        Book instance = null;
        instance.setFinePayed(finePayed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
