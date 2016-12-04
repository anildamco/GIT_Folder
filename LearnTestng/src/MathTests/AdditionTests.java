package MathTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTests {
	
	@Test
	public void addTwonumber()
	{
		
		int a=10;
		int b =20;
		int sum=30;
		Assert.assertEquals(a+b, sum,"sum of two numbers passed");
	}

}
