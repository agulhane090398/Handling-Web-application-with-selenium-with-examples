package home_practice;

import org.openqa.selenium.WebDriver;

import utility.WebBrowser;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("https://www.snapdeal.com/");
		driver.get("https://www.amazon.com/");
		
		driver.getTitle();
		driver.navigate().back();
		driver.getTitle();
		
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.getTitle();
		
		driver.navigate().to("https://www.amazon.com/");
		
//		Que difference between navigateTo and get method
	}

}
