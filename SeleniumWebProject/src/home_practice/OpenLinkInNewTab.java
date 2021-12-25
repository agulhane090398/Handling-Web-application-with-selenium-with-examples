package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		String shortcut=Keys.chord(Keys.CONTROL,Keys.RETURN);
		//chord takes various keyboard keys
		
		
		driver.findElement(By.linkText("Register")).sendKeys(shortcut);
	}

}
