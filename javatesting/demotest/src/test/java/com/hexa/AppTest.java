package com.hexa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @BeforeClass
    public static void setup(){
        System.out.println(" used for initing static variables.. called only once ");
    }

    @AfterClass
    public static void teardown(){
        System.out.println(" used for cleaning static resources.. called only once ");
    }
    @Before
    public void init(){
        System.out.println("Called every time before the test is executed");
    }
     
    @After
    public void shutdown(){
        System.out.println("Called after every tests are executed.");
    }
    @Test
    public void methodOne(){
        App myapp = new App();
        String expected = "JTest";
        String retActual = myapp.getMyAppName();
        assertEquals(expected, retActual);
        System.out.println( " methodOne  is invoked.. checking positive test case");
    }
    @Test
    public void methodTwo(){
        App myapp = new App();
        String expected = "Different";
        String retActual = myapp.getMyAppName();
        assertNotEquals(expected, retActual);
        System.out.println( " methodTwo  is invoked.. checking negtive test case");
    }

    @Test
    public void methodThree()
    {
        App myapp = new App();
        String expected = "JTest";
        assertTrue ( expected.equals(myapp.myappName));
        System.out.println( " methodThree  is invoked..");
    }

    @Test
    public void testmethodFour(){
        App myapp = new App();
        String expected = "JProfile";
        assertFalse("false condition",   
                expected.equals(myapp.myappName));
        System.out.println( " testmethodFour  is invoked..");
    }
}
