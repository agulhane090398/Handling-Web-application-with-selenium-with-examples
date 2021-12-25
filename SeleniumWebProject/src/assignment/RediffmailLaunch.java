package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RediffmailLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

//		Methods to operate
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.toString());
		
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.toString());
		driver.close();
		
//		Firefox
		System.setProperty("webdriver.gecko.driver", "lib//geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("mariontte", true);
		
		driver=new FirefoxDriver(options);
		driver.get("https://www.google.co.in/");

		driver.close();
	}

}
