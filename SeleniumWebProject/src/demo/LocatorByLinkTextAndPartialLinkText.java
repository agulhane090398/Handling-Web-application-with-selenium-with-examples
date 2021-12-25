package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinkTextAndPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
//		driver.findElement(By.linkText("Gmail")).click();
//		String title=driver.getTitle();
//		if(title.equals("Gmail"))
//		{
//			System.out.println("Gmail pass");
//		}
//		else
//		{
//			System.out.println("Gmail fail");
//		}
//		driver.navigate().back();
		
		driver.findElement(By.linkText("Images")).click();
		String title=driver.getTitle();
		if(title.equals("Google Images"))
		{
			System.out.println("Images pass");
		}
		else
		{
			System.out.println("Images fail");
		}
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Adve")).click();
		title=driver.getTitle();
		if(title.equals("Get More Customers With Easy Online Advertising | Google Ads"))
		{
			System.out.println("Advertizement pass");
		}
		else
		{
			System.out.println("Advertizement fail");
		}
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("How Se")).click();
		title=driver.getTitle();
		if(title.equals("Google Search – Discover how Google Search works"))
		{
			System.out.println("Advertizement pass");
		}
		else
		{
			System.out.println("Advertizement fail");
		}
		driver.navigate().back();
		
		
		
	}
		

}
