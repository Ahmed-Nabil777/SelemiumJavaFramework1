package Demo;

import org.testng.annotations.Test;

public class TestNGdependenecyDemo {
	
	
	@Test(dependsOnGroups = {"go.*"})
	public void Test1()
	{
		System.out.println("This is Test1");
	}
	@Test(groups = {"run"})
	public void Test2()
	{
		System.out.println("This is Test2");
	}
	@Test(groups = {"go"})
	public void Test3()
	{
		System.out.println("This is Test3");
	}


}
