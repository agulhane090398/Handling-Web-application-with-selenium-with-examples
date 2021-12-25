package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocationOfElement {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		//Location
		System.out.println(logo.getLocation());
		System.out.println(logo.getLocation().getX());
		System.out.println(logo.getLocation().getY());
		
		//Size
		System.out.println(logo.getSize());
		System.out.println(logo.getSize().getWidth());
		System.out.println(logo.getSize().getHeight());
	}
}
