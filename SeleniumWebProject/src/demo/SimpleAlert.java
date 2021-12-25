package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * When we test for alert it is called as yellow-box testing
 * Alert is java-script or window message 
 * Simple alert is alert which display information where we can only accept(ok)
 * */
public class SimpleAlert {

	public static void main(String[] args) {
		// To handle alert(javascript) in selenium webdriver there is interface Alert
		//WebDriver is parent interface which is implemented in chromedriver class
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get(String arg0)  load new webpage  in current browser window
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		try {
		Alert alert=driver.switchTo().alert();
		String expected="I am an alert box!";
		String actual=alert.getText();
		
		System.out.println(actual);
		if(expected.equals(actual)) {
			System.out.println("both matches");
		}
		//ok click
		Thread.sleep(5000);
		alert.accept();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}