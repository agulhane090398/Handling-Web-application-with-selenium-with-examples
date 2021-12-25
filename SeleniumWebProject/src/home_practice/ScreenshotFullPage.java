package home_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotFullPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		
		//full page
		TakesScreenshot ts=(TakesScreenshot) (driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".//ScreenShots//home.png");
		FileHandler.copy(src, trg);
		
		//Specific section part
		WebElement section=driver.findElement(By.xpath("//*[@class=\"stats-section\"]"));
		
		File src1=section.getScreenshotAs(OutputType.FILE);
		File trg1=new File(".//ScreenShots//section.png");
		FileHandler.copy(src1, trg1);
		
		//Specific Element
		WebElement ele=driver.findElement(By.xpath("//*[@class=\"stats-1\"]"));
		
		File src2=ele.getScreenshotAs(OutputType.FILE);
		File trg2=new File(".//ScreenShots//Element.png");
		FileHandler.copy(src2, trg2);
		
		System.out.println("Test Done");
	
	}

}
