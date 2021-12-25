package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class AutocompleteGooglePlacesDropDown {

	public static void main(String[] args) throws InterruptedException {
		try {
		WebDriver driver=WebBrowser.openBrowser("https://www.twoplugs.com/");
		driver.findElement(By.linkText("LIVE POSTING")).click();
		
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		searchbox.clear();
		Thread.sleep(3000);
		searchbox.sendKeys("Yavatmal");
		Thread.sleep(3000);
		String text;
		
		do {
			//first the arrow key takes value in search 
			//box and then share the text with us
			searchbox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(5000);
			text=searchbox.getAttribute("value");
			System.out.println(text);
			
			if(text.contains("Arni"))
			{
				Thread.sleep(5000);
				searchbox.sendKeys(Keys.ENTER);
				break;
			}
			
		}while(!text.isEmpty());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
