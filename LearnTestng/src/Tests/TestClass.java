package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void test1()
	{
		
		int a=10;
		int b=10;
		Assert.assertEquals(a,b,"The two numbers are equal");
	}
@Test
public void test2()
{
	Assert.assertEquals("the","the","Two Test are equal");
}
}

