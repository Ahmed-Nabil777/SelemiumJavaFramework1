package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGmultiBrowserDemo {
	WebDriver driver = null;
	
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setup(String BrowserName) {
		
		System.out.println("browser is" + BrowserName );
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\amnabil\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\amnabil\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
	}
	@Test
    public void Test1() throws Exception {
		
		driver.get("http://google.com");
		Thread.sleep(5000);
		
	}
	@BeforeTest
    public void TearDown() {
		driver.close();
		System.out.println("done");
		
	}
	

}
