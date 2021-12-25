package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMultipleIframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// driver.switchTo().frame(name/id of frame)
		// driver.switchTo().frame(index of frame)
		// driver.switchTo().frame(find WebElement)

		// 1st frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//li/a[text()=\"org.openqa.selenium.chrome\"]")).click();
		driver.switchTo().defaultContent();//back to main page directly (not succeeding parent frame)
		
		Thread.sleep(3000);
		
		// 2nd frame
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[text()=\"ChromeDriver\"]")).click();
		driver.switchTo().defaultContent();//back to main page

		Thread.sleep(3000);
		
		// 3rd frame
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name=\"classFrame\"]")));
		driver.findElement(By.xpath("//*[@class=\"topNav\"]/ul/li/a[text()=\"Help\"]")).click();
		driver.switchTo().defaultContent();//back to main page

	}

}
