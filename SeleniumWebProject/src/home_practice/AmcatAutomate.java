package home_practice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import utility.WebBrowser;
import utility.WebElementMethods;

public class AmcatAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver(option);// imp
		try {
			driver.get("https://www.myamcat.com/help/account/registration-and-login");
			driver.manage().window().maximize();
//			if (driver.findElement(By.xpath("class=\"chatbox  conversation-part--animation \"]")).isDisplayed()) {
//				WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"chat-bot-launcher-button\"]"));
//			}
			WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"main_header\"]//button[@class=\"commonBtn blackBtn gaTrigger\"]"));
			WebElementMethods.enterText(driver, By.xpath("//*[@id=\"loginEmail\"]"), "agulhane090398@gmail.com");
			WebElementMethods.enterText(driver, By.xpath("//*[@id=\"loginPasswordLoginFormNew\"]"), "@niketcup98");
			Thread.sleep(3000);
			WebElementMethods.clickButton(driver, By.xpath("//body/div[@id='loginPopup']/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/button[1]")); //Login successful
			Thread.sleep(6000);
			WebElementMethods.clickButton(driver, By.xpath("//div[@id=\"main_header\"]//a[@href=\"/jobs\"]"));
			
			List<WebElement> applyBtn=driver.findElements(By.xpath("//*[@class=\"job-apply-header-button\"]/a[text()='Apply']"));
		
			for(WebElement apply:applyBtn)
			{
				apply.click();
				WebElementMethods.enterText(driver, By.xpath("//*[@name=\"fix-1\"]"), "7350813275");
				Select state=new Select(driver.findElement(By.xpath("//*[@name=\"fix-2\"]")));
				List<WebElement> options=state.getOptions();
				for(WebElement option1:options)
				{
					if(option1.getAttribute("value").equals("Maharashtra"))
					{
						option1.click();
						break;
					}
				}
				WebElementMethods.enterText(driver, By.xpath("//*[@name=\"fix-3\"]"), "Yavatmal");
				WebElementMethods.enterText(driver, By.xpath("//*[@name=\"custom-13\"]"), "C, JAVA, Python, SQL, Automation Testing, Manual Testing and Responsive Web Development");
				
				List<WebElement> relocate= driver.findElements(By.xpath(""));
				for(WebElement y:relocate)
				{
					if(y.getAttribute("value").equals("Yes"))
					{
						y.click();
						break;
					}
				}
				
				WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"mainFileUploadInput\"]"));
				String path="G:\\Aniket resume.pdf";
				
				Robot rb=new Robot();
				rb.delay(3000);
				
				//copy path 
				StringSelection ss=new StringSelection(path);
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
				
				WebElementMethods.clickButton(driver, By.xpath("//div[@class=\"dy-btn-row\"]//input[@name=\"Submit\"]"));
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
//			driver.close();
			
		}

	}

}
