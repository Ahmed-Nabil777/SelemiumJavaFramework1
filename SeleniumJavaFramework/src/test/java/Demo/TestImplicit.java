package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestImplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void waits()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amnabil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("https://www.google.com/")).sendKeys("automation");
		driver.findElement(By.name("btnK")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
		
		
		driver.findElement(By.name("abc")).click();
		
		
	}

}
