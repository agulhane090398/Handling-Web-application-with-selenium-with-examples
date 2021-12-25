package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*Implicit wait is applied for entire webpage webelement maximium amount time 
* is given like 30 seconds if it found earilier it will perform action and if not 
* found within max time it will throw NoSuchElementExpection
* */
public class ExplicitWaitVisibility {

	public static void main(String[] args) {
		
		// WebDriver is parent interface which is implemented in chromedriver class

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("https://www.google.com/");
		
		WebDriverWait mywait=new WebDriverWait(driver, 10);
		
		try {
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("ipl");
		
		By locator=By.xpath("//ul[@class=\'G43f7e\']//li");
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		List<WebElement> list=driver.findElements(locator);
		
		
		for(WebElement element:list)
		{
			System.out.println(element.getText());
		}
		
		for(WebElement element:list)
		{
			if(element.getText().equalsIgnoreCase("Indian Premier League — Cricket league\r\n"))
			{
				element.click();
				break;
			}
		}
					

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}