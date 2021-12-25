package home_practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		single id
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getWindowHandle());
		
//		multiple id's
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		List<WebElement> socialIcons=driver.findElements(By.xpath("//*[@id=\"social-icons\"]/a"));
		
		for(WebElement icon:socialIcons)
		{
			icon.click();
			System.out.println(driver.getTitle()+":"+icon);//Everytime it prints same because the driver is not switched
		}
		
		Set<String> windowIds=driver.getWindowHandles();
		for(String win:windowIds)
		{
			System.out.println(driver.switchTo().window(win).getTitle());
		}
		driver.close();//close to the current tab, driver pointing 
//		driver.quit();//close all tabs driver pointing
		
//		or
		for(String win:windowIds)
		{
			if(driver.switchTo().window(win).getTitle().equals("Sign Up | LinkedIn"))
			{
				driver.close();
				break;
			}
		}
	}

}
