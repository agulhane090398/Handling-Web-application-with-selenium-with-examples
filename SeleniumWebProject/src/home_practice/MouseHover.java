package home_practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		
		Actions action=new Actions(driver);
		WebElement desktop=driver.findElement(By.xpath("//div[@class=\"collapse navbar-collapse navbar-ex1-collapse\"]/ul/li[1]"));
		action.moveToElement(desktop).perform();
		
		
		try {
		List<WebElement> subOp=driver.findElements(By.xpath("//div[@class=\"dropdown-inner\"]/ul[@class=\"list-unstyled\"]/li/a"));
		for(WebElement opt:subOp)
		{
			if(opt.getText().equalsIgnoreCase("Mac (1)"))
			{
				opt.click();
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
