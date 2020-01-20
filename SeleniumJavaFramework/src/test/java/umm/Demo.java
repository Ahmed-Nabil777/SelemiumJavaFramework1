package umm;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Demo {
static WebDriver driver;
	
	public static void InvokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\amnabil\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://10.3.1.15:2021/");		
			driver.findElement(By.name("username")).sendKeys("SUPER");
			driver.findElement(By.name("password")).sendKeys("1234");
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[2]/button")).click();
			Thread.sleep(3000);
			AddNewUser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECO		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
	}
	public static void AddNewUser()
	{
		driver.findElement(By.className("btn btn-labeled btn-success m-l-10 add-role-btn pull-right")).click();
	}

	public static void main(String[] args) {
		
		InvokeBrowser();
		
		// TODO Auto-generated method stub

	}

}
