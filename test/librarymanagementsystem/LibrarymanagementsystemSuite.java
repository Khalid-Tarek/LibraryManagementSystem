/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ahmed
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({librarymanagementsystem.GUI.GUISuite.class, librarymanagementsystem.Users.UsersSuite.class, librarymanagementsystem.MainTest.class, librarymanagementsystem.DatabaseUtilsTest.class, librarymanagementsystem.BookTest.class})
public class LibrarymanagementsystemSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}