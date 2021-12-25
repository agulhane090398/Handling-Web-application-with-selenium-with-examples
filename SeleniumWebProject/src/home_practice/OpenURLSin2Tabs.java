package home_practice;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenURLSin2Tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		1
		//override on same tab
		/*driver.get("https://demo.nopcommerce.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/");*/

//		2
		//open in new tab used in selenium 4
		/*driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/");*/
		
		//open in new tab used in selenium 3
		driver.get("https://demo.nopcommerce.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.open(\"https://www.geeksforgeeks.org\", \"_blank\");");
							//window.open(URL, "_blank"); blank is optional
			
		
		
		
//		3
		//open in new Window in selenium 4
		/*driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://opensource-demo.orangehrmlive.com/");*/
		
		
		//open in new Window in selenium 3
		/*driver.get("https://demo.nopcommerce.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.open('https://www.encodedna.com/2013/09/open-new-window-using-javascript-window-open-demo.htm', 'Open Multiple Popup Windows', 'width=750,height=660,top=70,left=100,resizable=1,menubar=yes', true);");
						//window.open(URL, true); imp
		*/
	}

}



