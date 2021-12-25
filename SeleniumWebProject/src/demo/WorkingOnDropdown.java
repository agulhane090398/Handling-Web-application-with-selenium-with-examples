package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.WebBrowser;


public class WorkingOnDropdown {

	public static void main(String[] args) {
		boolean flag=false;
		
		WebDriver driver=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		WebElement month=driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		
		Select ddmonth=new Select(month);
		List<WebElement> options=ddmonth.getOptions();
		for(WebElement option:options)
		{
			if(option.getAttribute("value").equals("february"))
			{
				flag=true;
				ddmonth.selectByValue("February");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Incorrect input option");
		}
		
		
		for(WebElement option:options)
		{
			if(option.getText().equals("September"))
			{
				flag=true;
				ddmonth.selectByVisibleText("September");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Incorrect input option2");
		}

	}

}
