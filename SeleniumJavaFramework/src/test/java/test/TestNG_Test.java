package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Google_Search_Page;

public class TestNG_Test {
	
	private static WebDriver driver = null;

	public static void google_search()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amnabil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.youtube.com/");
		
		// driver.findElement(By.name("q")).sendKeys("performance testing");
		Google_Search_Page.textbox_search(driver).sendKeys("automation");
		
		// driver.findElement(By.name("btnK")).click();
		
		Google_Search_Page.search_Btn(driver).click();
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		google_search();

	}

}
