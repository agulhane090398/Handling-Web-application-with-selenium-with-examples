package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");		
//		Create an Object of ChromeBrowser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		Methods to operate
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.toString());
		
		driver.close();
	}

}
