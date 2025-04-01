package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	
	@Test
	public void strictLevelComparison()
	{
		String expectedName = "Raja";
		String actualName = "Raja";
		Assert.assertEquals(actualName, expectedName);
//		Assert.assertTrue(actualName.equals(expectedName));
//		Assert.assertEquals(actualName.equals(expectedName),true);
		System.out.println("Hard Assertion strict level completed");
	}
	
	@Test
	public void containsLevelComparison()
	{
		String a1 = "Don";
		String a2 = "London";
		
		Assert.assertTrue(a2.equals(a1));
		System.out.println("Hard Assertion contains level completed");
	}

}
