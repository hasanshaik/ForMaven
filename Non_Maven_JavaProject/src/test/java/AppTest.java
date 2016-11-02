import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void testApp()
    {
        assertEquals(0,new App().calculateSomething());
		
    }
	
	@Test
	public void testMethod()
	{
		assertEquals(3,new App().givesThree("three"));
		assertEquals(0,new App().givesThree("df"));
	}
	
}
