package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Search_Page {

	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver)
	{
		element = driver.findElement(By.id("search"));
		return element;
	}
	
	public static WebElement search_Btn(WebDriver driver)
	{
		element = driver.findElement(By.id("search-icon-legacy"));
		return element;
	}
}
