package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class ForcefullyImplementingJScript {
	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("aaa");
		driver.findElement(By.id("userEmail")).sendKeys("aaa@abc.com");
		List<WebElement> radios=driver.findElements(By.name("gender"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for(WebElement rb:radios)
		{
			if(rb.getAttribute("value").equals("Male"))
			{
				js.executeScript("arguments[0].click()", rb);
				break;
			}
		}
		
	}
}
