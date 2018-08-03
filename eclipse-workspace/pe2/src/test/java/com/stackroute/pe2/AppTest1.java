package com.stackroute.pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest1 {
    private static App pal;

    @BeforeClass
    public static void setup() {
        pal = new App();

    }

    @AfterClass
    public static void teardown() {
        pal = null;

    }

   
   @Test
	public void testCheckFact() {
	 assertEquals("The factorial of 12 is 479001600", pal.intfact(12));
	 assertNotEquals("The factorial of 2 is 2", pal.intfact(2));
	 assertNotEquals("The factorial of 20 is 2432902008176640000", pal.longfact(20));
	 assertNotEquals(1, pal.longfact(0));
	}
    
    @Test
    public void testCheckEven() {
    	int num = 16;
    	assertEquals(true, pal.even(num));
    	assertNotNull("failure",pal.even(num));
    	assertNotEquals(1,pal.even(num));
	}
    
    @Test
    public void testCheckMember()
    {
    	String s=pal.membervariable();
        assertEquals("HarryPotter 30 2500.3",s);
        assertNotEquals("failure",s);
		}
    
      
}
    	   