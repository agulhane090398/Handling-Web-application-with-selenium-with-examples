package home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
//		1) Selecting specific checkbox
		/*
		 driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		 		
		*/
		
//		2)Selecting all checkbox
																		//Imp Xpath
		/*List<WebElement> chboxes=driver.findElements(By.xpath("//*[@type=\"checkbox\" and contains(@id,\"day\")]"));
		//way1
		for(WebElement chbox:chboxes)
		{
			chbox.click();
		}
		
		//way2
		for(int i=0;i<chboxes.size();i++)
		{
			chboxes.get(i).click();
		}*/
		
//		3)Selecting multiple checkbox (eg monday and sunday)
		/*
		 List<WebElement> chboxes=driver.findElements(By.xpath("//*[@type=\"checkbox\" and contains(@id,\"day\")]"));
		 
		for(WebElement chbox:chboxes)
		{
			if(chbox.getAttribute("id").equalsIgnoreCase("monday") || chbox.getAttribute("id").equalsIgnoreCase("sunday"))
			{
				chbox.click();
			}
		}
		*/
		
//		4)Selecting last 2 checkbox
		/*
		  List<WebElement> chboxes=driver.findElements(By.xpath("//*[@type=\"checkbox\" and contains(@id,\"day\")]"));
		 
		 //way1
		 for(int i=chboxes.size()-2;i<chboxes.size();i++)
			{
				chboxes.get(i).click();
			}
		
		//way2
		 int count=1;
		 for(WebElement chbox:chboxes)
			{
			 if(count==chboxes.size()-1 || count==chboxes.size())
			 {
				 chbox.click();				 
			 }
			 count++;
			}
		 */
		
//		5)Selecting first 2 checkbox
		  List<WebElement> chboxes=driver.findElements(By.xpath("//*[@type=\"checkbox\" and contains(@id,\"day\")]"));
		//way1
		  /* int count=1;
			 for(int i=0;i<chboxes.size();i++)
				{
				 if(count<=2)
					chboxes.get(i).click();
				 count++;
				}
			*/
			//way2
			int count=1;
			 for(WebElement chbox:chboxes)
				{
				 if(count<=2)
				 {
					 chbox.click();				 
				 }
				 count++;
				}
		  
	}

}
