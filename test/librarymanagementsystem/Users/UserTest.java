/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem.Users;

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
public class UserTest {
    
    public UserTest() {
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
     * Test of getUSERNAME method, of class User.
     */
    @Test
    public void testGetUSERNAME() {
        System.out.println("getUSERNAME");
        User instance = null;
        String expResult = "";
        String result = instance.getUSERNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUSER_ID method, of class User.
     */
    @Test
    public void testGetUSER_ID() {
        System.out.println("getUSER_ID");
        User instance = null;
        int expResult = 0;
        int result = instance.getUSER_ID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNAME method, of class User.
     */
    @Test
    public void testGetNAME() {
        System.out.println("getNAME");
        User instance = null;
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserImpl extends User {

        public UserImpl() {
            super("", 0, "");
        }
    }
    
}
