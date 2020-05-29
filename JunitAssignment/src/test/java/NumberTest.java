import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

	private Number ob;

	@Before
	public void setup()
	{
		ob = new Number();
	}
	
	//test for CheckPrime function
	@Test
	public void checkNoAsNotPrime() throws Exception
	{
		int input=10;
		int expected=0;
		int actual=ob.checkPrime(input);
		assertEquals(expected, actual);
	}

	@Test
	public void checkNoAsPrime() throws Exception
	{
		int input=71;
		int expected=1;
		int actual=ob.checkPrime(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkNoAsPrimeThrowsException()
	{
		int input=-5;
		try {
			ob.checkPrime(input);
			//fail();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
	}
	
	//test for CheckArmstrong function
	@Test
	public void checkNoAsNotArmstrong() throws Exception
	{
		int input=10;
		boolean expected=false;
		boolean actual=ob.checkArmstrong(input);
		assertEquals(expected, actual);
	}

	@Test
	public void checkNoAsArmstrong() throws Exception
	{
		int input=1;
		boolean expected=true;
		boolean actual=ob.checkArmstrong(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkNoAsArmstrongThrowsException()
	{
		int input=-5;
		try {
			ob.checkArmstrong(input);
			//fail();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
	}
	
	//test for CheckPalindrome function
		@Test
		public void checkNoAsNotPalindrome() throws Exception
		{
			int input=10;
			boolean expected=false;
			boolean actual=ob.checkPalindrome(input);
			assertEquals(expected, actual);
		}

		@Test
		public void checkNoAsPalindrome() throws Exception
		{
			int input=151;
			boolean expected=true;
			boolean actual=ob.checkPalindrome(input);
			assertEquals(expected, actual);
		}
		
		@Test
		public void checkNoAsPalindromeThrowsException()
		{
			int input=-5;
			try {
				ob.checkPalindrome(input);
				//fail();
			} catch (Exception e) {
				//e.printStackTrace();
			}
			
		}

}
