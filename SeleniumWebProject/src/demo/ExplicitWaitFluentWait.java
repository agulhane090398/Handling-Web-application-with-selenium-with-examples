package demo;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Explicit wait is applied for particular condition/webelement to be true 
 * 
 * */
public class ExplicitWaitFluentWait {

	public static void main(String[] args) {

		// WebDriver is parent interface which is implemented in chromedriver class

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("https://www.google.com/");
		

		try {
				driver.findElement(By.name("q")).sendKeys("ipl",Keys.ENTER);
				
				
				while(isElementPresent(driver, By.xpath("//*[@id=\"pnnext\"]/span[2]")).getText() != null)
				{
					driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]")).click();
				}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static WebElement isElementPresent(WebDriver driver, By locator) {
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class).pollingEvery(Duration.ofSeconds(5));

		WebElement ele = mywait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(locator);
			}

		});

		return ele;

	}

}