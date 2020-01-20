package Demo;

import org.testng.annotations.Test;


@Test(groups= {"all"})

public class TestNGGroupingDemo {
	
	
	@Test(groups= {"group1"})
	public void Test1()
	{
		System.out.println("1");
	}
	@Test(groups= {"windows.reg"})
	public void Test2()
	{
		System.out.println("2");
	}
	@Test(groups= {"linux.reg"})
	public void Test3()
	{
		System.out.println("3");
	}
	@Test
	public void Test4()
	{
		System.out.println("4");
	}

}
