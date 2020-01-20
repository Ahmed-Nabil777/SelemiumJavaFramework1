import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired_Capabilities {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amnabil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver(); 
		
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.navigate().to("https://www.youtube.com/");
		

	}

}
