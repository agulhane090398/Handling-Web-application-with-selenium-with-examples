package home_practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardsActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.F1).perform();
		Thread.sleep(2000);
		
	}

}
