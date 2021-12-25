package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.WebBrowser;
import utility.WebElementMethods;

public class LocateByIdAndName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//
////		Problem 1
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("aniket12");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("aniket12");

		driver.findElement(By.name("proceed")).click();
//
////		Problem 2
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		WebElement username1 = driver.findElement(By.id("txtCustomerID"));
		username1.sendKeys("aniket@123");

		WebElement password1 = driver.findElement(By.id("txtPassword"));
		password1.sendKeys("anipass");

		driver.findElement(By.name("Butsub")).click();
		

		driver.close();
		
//		problem 3
//		comment above and run problem 3
//		using package shortcuts
		WebDriver driver1=WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElementMethods.enterText(driver1, By.id("login1"), "aniket12");
		WebElementMethods.enterText(driver1, By.id("password"), "aniket12");
		
		WebElementMethods.clickButton(driver1, (By.name("proceed")));
		System.out.println(driver1.getTitle());
		
		driver1.close();

	}
}
