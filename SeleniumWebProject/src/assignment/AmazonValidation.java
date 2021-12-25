package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.amazon.in/
public class AmazonValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		WebElement searchbar=d.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("Selenium Book");
		
		d.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println(d.getTitle());
		
		d.close();
	}

}


