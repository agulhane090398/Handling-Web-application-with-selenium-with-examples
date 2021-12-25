package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Frame usually start with <iframe> tag
 * 
 * */
public class SwitchtoFrameWithinFrame {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get(String arg0)  load new webpage  in current browser window
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		try {
		//webelement
			//way 1: xpath
			/*
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(0);
		*/
			
			//way 2: Index
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}