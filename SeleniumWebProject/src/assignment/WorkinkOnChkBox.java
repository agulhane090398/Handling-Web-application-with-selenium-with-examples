package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkinkOnChkBox {
	public static void main(String[] args) {
		WebDriver driver = WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("div>div>input[type=checkbox]"));
		for(WebElement i:checkboxes)
		{
			if(i.getAttribute("value").equals("Movies"))
			{
				if(!i.isSelected())
				{
					i.click();
				}
			}
		}
	}
}
