package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Unconditional synchronization is typ of synchronization where ther is no condtion 
 * it halt/stop execution of program by stopping JVM 
 * example 
 * Thread.Sleep(milliSecond); 
 * Advantage use for all exepection like NoSuchElementException,NoSuchAlertExpection.....
 * Disadvantage unneccessary waiting
 * */
public class UnconditionalSync {

	public static void main(String[] args) {
		
		// WebDriver is parent interface which is implemented in chromedriver class

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("https://www.naukri.com/");

		try {
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*s[@id='block']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}