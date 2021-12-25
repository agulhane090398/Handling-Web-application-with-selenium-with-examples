package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Explicit wait is applied for particular condition/webelement to be true 
 * 
 * */
public class ExplicitWaitStaleness {

	public static void main(String[] args) {

		// WebDriver is parent interface which is implemented in chromedriver class

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("https://www.google.com/");
		// WebDriverWait is class in which there is parameterized constructor which take
		// argument webdriver driver reference and time in second

		WebDriverWait wt = new WebDriverWait(driver, 30);

		try {
			driver.findElement(By.name("q")).sendKeys("ipl", Keys.ENTER);
			WebElement ele = driver.findElement(By.xpath("//span[text()='Next']"));

			
				while (ele.isDisplayed()==true) {
					for (int i = 0; i < 15; i++) {
					driver.findElement(By.xpath("//span[text()='Next']")).click();
				}
			
			/*boolean flag=wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Next']"))).isDisplayed();
			
			while(flag) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}*/
				}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}