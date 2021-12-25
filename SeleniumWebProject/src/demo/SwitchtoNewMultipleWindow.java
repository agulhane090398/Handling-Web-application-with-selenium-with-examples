package demo;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * */
public class SwitchtoNewMultipleWindow {

	public static void main(String[] args) {
		
		// WebDriver is parent interface which is implemented in chromedriver class

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("https://www.naukri.com/");

		

		// getWindowHandle() return string of Session Id
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		// getWindowHandles() return Set of string of all Session Id
		Set<String> childId = driver.getWindowHandles();

		try {
			for (String win : childId) {
				if (!win.equalsIgnoreCase(parentId)) {
					driver.switchTo().window(win);
					driver.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}