package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	
	@Test
	public void strictLevelAssertion()
	{
		String a1 = "hell";
		String a2 = "hello";
		
		SoftAssert s = new SoftAssert();
		System.out.println("Soft Assertion strict level completed");
		s.assertTrue(a2.equals(a1));
		s.assertAll();
	}
	
	@Test
	public void containsLevelAssertion()
	{
		String expectedCity = "Delhi";
		String actualCity = "New Delhi";
		
		SoftAssert s = new SoftAssert();
		s.assertTrue(actualCity.equals(expectedCity));
		s.assertAll();
		System.out.println("Soft Assertion contains level completed");
		
	}

}
