package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *
 * */
public class SwitchtoNewMultipleWindow2 {

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
		
		List<String> list=new ArrayList<String>(childId);
		//last wala open rakhs hai window
		try {
			for(int i=0;i<list.size()-1;i++) {
				driver.switchTo().window(list.get(i));
				driver.close();
			}
			driver.switchTo().window(list.get(list.size()-1));
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}