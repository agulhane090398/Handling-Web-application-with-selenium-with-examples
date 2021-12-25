package home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class AutoSuggestionSearchBoxDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebBrowser.openBrowser("https://www.google.com/");
		driver.findElement(By.xpath("//*[@class=\"gLFyf gsfi\"]")).sendKeys("selenium webdriver");
		
		Thread.sleep(3000);
		
		List<WebElement> l=driver.findElements(By.xpath("//li[@class=\"sbct\"]//div[@role=\"option\"]/div[1]/span"));
		System.out.println(l.size());
		for(WebElement i:l)
		{
			System.out.println(i.getText());
		}
		for(WebElement i:l)
		{
			if(i.getText().contains("questions"))
			{
				i.click();
				System.out.println("Test Done");
				break;
			}
		}
		
		driver.close();
	}

}
