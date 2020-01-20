package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamterizationDemo {
	
	
	@Test
	@Parameters({"MyName"})

	public void Test(@Optional ("default") String name)
	{
		System.out.println("name is " + name);
	}
}
