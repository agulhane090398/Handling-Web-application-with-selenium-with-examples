package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkingOnCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Demo1
			WebDriver driver = WebBrowser.openBrowser("https://echoecho.com/htmlforms09.htm");
			WebElement checkbox = driver.findElement(By.name("option1"));
//														simple locator
			if (!checkbox.isSelected()) 
			{
				checkbox.click();
				
			}
			
//			Demo 2														//here we have used cssSelector
			
			List <WebElement> chkboxes=driver.findElements(By.cssSelector("td.table5>input"));
			for (WebElement i:chkboxes)
			{
				if(i.getAttribute("value").equals("Cheese"))	//GetAttribute method
				{
					if (!i.isSelected()) 
					{
						i.click();
					}
				}
			}
						
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
