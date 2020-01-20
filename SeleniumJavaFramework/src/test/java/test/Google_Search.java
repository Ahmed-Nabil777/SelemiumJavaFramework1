package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Google_Search_Page;

public class Google_Search {
	
	private static WebDriver driver = null;

	public static void google_search()  {
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\amnabil\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			driver.get("https://www.youtube.com/");
			
			// driver.findElement(By.name("q")).sendKeys("performance testing");
			Thread.sleep(5000);
			Google_Search_Page.textbox_search(driver).sendKeys("automation");
			
			// driver.findElement(By.name("btnK")).click();
			
			Google_Search_Page.search_Btn(driver).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		google_search();

	}

}
