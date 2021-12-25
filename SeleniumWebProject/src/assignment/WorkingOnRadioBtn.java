package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;
import utility.WebElementMethods;

public class WorkingOnRadioBtn {
	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://echoecho.com/htmlforms10.htm");
		WebElementMethods.selectRadio(driver, By.name("group1"), "Cheese");
		WebElementMethods.selectRadio(driver, By.name("group2"), "beer");
	}
}
