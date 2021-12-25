package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.rediff.com/
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		driver.findElement(By.id("txtlogin")).sendKeys("cscsaxs");
		driver.findElement(By.name("next")).click();
		try
		{
		String actual_msg=driver.findElement(By.className("rRed__f12__rbold")).getText();
		System.out.println(actual_msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		driver.close();
	}

}
