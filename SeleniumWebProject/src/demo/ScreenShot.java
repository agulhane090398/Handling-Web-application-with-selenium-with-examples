package demo;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.id("login1")).sendKeys("Selenium@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.name("proceed")).click();

		
		try {
			if (driver.findElement(By.xpath("//*[@id=\"div_login_error\"]")).isDisplayed()) {
				
				Date d=new Date();
				String name=LocalTime.now().getHour()+"_"+LocalTime.now().getMinute()+"_"+LocalTime.now().getSecond()+"_"+LocalDate.now().getDayOfMonth()+"_"+LocalDate.now().getMonthValue()+"_"+LocalDate.now().getYear();
				//int name=(int)d.getTime();
				
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File trg=new File(".//ScreenShots//demo_"+name+".png");
				
				FileHandler.copy(src, trg);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
