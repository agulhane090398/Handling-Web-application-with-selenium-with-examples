package home_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class=\"demo-frame lazyloaded\"]")));
		WebElement target=driver.findElement(By.xpath("//*[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		List<WebElement> images=driver.findElements(By.xpath("//*[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
		System.out.println(images.size());
		Actions action=new Actions(driver);
		for(WebElement img:images)
		{
			action.dragAndDrop(img, target).perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}

}
