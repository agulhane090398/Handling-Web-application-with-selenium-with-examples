package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDblClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		
		WebElement feild1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		feild1.clear();
		feild1.sendKeys("Welcome");
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()=\"Copy Text\"]"));
		Actions action=new Actions(driver);
		action.doubleClick(button).perform();
		
		
	}
	

}
