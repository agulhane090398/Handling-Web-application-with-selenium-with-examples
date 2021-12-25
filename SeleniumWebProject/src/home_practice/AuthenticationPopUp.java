package home_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Syntax
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://username:password@url");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
