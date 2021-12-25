package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebBrowser;
import utility.WebElementMethods;

public class SynchronizationByWebDriverWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=WebBrowser.openBrowser("https://www.google.com/");
		WebElementMethods.enterText(driver, By.name("q"), "a");
		
		try {
			WebElementMethods.clickButton1(driver, By.cssSelector("div.pcTkSc>div>span"));
			
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			WebDriverWait mywait=new WebDriverWait(driver, 20);
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.pcTkSc>div>span")));
			WebElementMethods.clickButton1(driver, By.cssSelector("div.pcTkSc>div>span"));

		}
	}

}
