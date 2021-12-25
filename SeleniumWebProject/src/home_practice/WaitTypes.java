package home_practice;

import java.time.Duration;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		try {
			
			//unconditional wait
			/*Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"block\"]")).click();
			*/
			
//			Implicitly Wait
			/*driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"block\"]")).click();
				*/

//			Explicitly Wait
			/*WebDriverWait mywait=new WebDriverWait(driver, 12);
			WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block\"]")));
			element.click();
			*/
			
//			Fluently Wait
			Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(12))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(NoSuchElementException.class);
			
			WebElement element=mywait.until(new Function<WebDriver,WebElement>(){
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.xpath("//*[@id=\"block\"]"));
				}
			});
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
