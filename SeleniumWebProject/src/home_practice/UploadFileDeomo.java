package home_practice;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import utility.WebBrowser;

public class UploadFileDeomo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver=WebBrowser.openBrowser("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//*[@class=\"engage w100 fl tc engage-desktop\"]/a[@title=\"Click to upload your resume\"]")).click();
		
		String location="C:\\Users\\HP\\Desktop\\Doc1.docx";
		
		//not working
		//driver.findElement(By.xpath("//*[@class=\"line-btn\"]")).click();
		
//		Method 1: sendKey()
		/*driver.findElement(By.xpath("//div/input[@id=\"file-upload\"]")).sendKeys(location);
		Thread.sleep(3000);
		*/
		
		//driver.findElement(By.xpath("//span/input[@type=\"submit\"]")).sendKeys(Keys.ENTER);
		
		//Actions act=new Actions(driver);
		//act.sendKeys(Keys.ENTER);
		
		
//		Method 2: Robot Class
		WebElement uploadButton=driver.findElement(By.xpath("//div/input[@id=\"file-upload\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", uploadButton);
		
		
		Robot rb=new Robot();
		rb.delay(3000);
		
		//copy path 
		StringSelection ss=new StringSelection(location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Ctl + V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pop_upload\"]")).click();
	}

}
