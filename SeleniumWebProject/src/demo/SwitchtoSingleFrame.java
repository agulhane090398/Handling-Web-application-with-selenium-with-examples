package demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Frame usually start with <iframe> tag
 * 
 * */
public class SwitchtoSingleFrame {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get(String arg0)  load new webpage  in current browser window
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		
		System.out.println(list.size());
		
		try {
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}