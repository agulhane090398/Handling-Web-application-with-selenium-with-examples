package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.WebBrowser;

public class WOrkingOnDropDownbtn {
	//select[@ng-init="country=''"]
	public static void main(String[] args) {
		try {
			WebDriver driver=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
			WebElement country=driver.findElement(By.xpath("//select[@ng-init=\"country=''\"]"));
			
			Select ecountry=new Select(country);
			List<WebElement> options = ecountry.getOptions();
			
			for(WebElement option: options)
			{
				ecountry.selectByValue("india");
				break;
				
			}
			
			for(WebElement option: options)
			{
				ecountry.selectByValue("India");
				break;
				
			}
		}
		catch(Exception e)
		{
			System.out.println("incorrect option given");
			e.printStackTrace();
			
		}
	}

}
