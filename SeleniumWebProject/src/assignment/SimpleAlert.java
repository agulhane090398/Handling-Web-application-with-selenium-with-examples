package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;

public class SimpleAlert {

	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@name=\"proceed\"]")).click();
		
		try {
		Alert a=driver.switchTo().alert();
		if(a.getText().equals("Please enter a valid user name"))
		{
			System.out.println("Test done");
		}
		a.accept();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
