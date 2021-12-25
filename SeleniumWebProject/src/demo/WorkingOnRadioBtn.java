package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkingOnRadioBtn {

	public static void main(String[] args) {
		
		WebDriver driver = WebBrowser.openBrowser("https://echoecho.com/htmlforms10.htm");

		List<WebElement> radios = driver.findElements(By.name("group1"));
		for (WebElement rb : radios) {
			if (rb.getAttribute("value").equalsIgnoreCase("Cheese")) {
				rb.click();
				break;
			}

		}

		radios = driver.findElements(By.name("group2"));
		for (WebElement rb : radios) {
			if (rb.getAttribute("value").equalsIgnoreCase("water")) {
				rb.click();
				break;
			}
		}
	}

}
