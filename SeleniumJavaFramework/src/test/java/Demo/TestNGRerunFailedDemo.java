package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRerunFailedDemo {
	
	@Test
	public void Test1()
	{
		System.out.println("This is Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("This is Test2");
		//int i=1/0;
	}
	@Test(retryAnalyzer = pages.Analyzer.class)
	public void Test3()
	{
		System.out.println("This is Test3");
		Assert.assertTrue(0>1);
	}
	

}
