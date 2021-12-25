package home_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");

		// syntax
		/*
		 * JavaScriptExecutor js=(JavaScriptExecutor) driver;
		 * js.executeScript(Script,args);
		 */

		// Draw border and take screenshot
		WebElement element = driver.findElement(By.xpath("//*[@title=\"OpenCart - Open Source Shopping Cart Solution\"]"));
		drawBorder(element, driver);
		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//ScreenShots//JSE img1.png");
		FileHandler.copy(src, trg);
		Thread.sleep(5000);

		// Getting title
		Thread.sleep(5000);
		System.out.println("Title of page is:" + getTitle(driver));
		Thread.sleep(5000);

		// Generating alert
		generateAlert("Alert is call using JSE", driver);
		Thread.sleep(5000);

		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(5000);

		/// Refreshing page
		refreshPage(driver);
		Thread.sleep(5000);

		// Scroll down
		scrollPageDown(driver);
		Thread.sleep(5000);

		// Scroll up
		scrollPageUp(driver);
		Thread.sleep(5000);

		// Flash
		WebElement logo = driver.findElement(By.xpath("//*[@title=\"OpenCart - Open Source Shopping Cart Solution\"]"));
		flash(logo, driver);

		// click element
		WebElement reg = driver.findElement(By.xpath("//*[text()=\"Register\"]"));
		clickElementByJS(reg, driver);

		// zoom page
		zoomPageByJS(driver, 50);
		Thread.sleep(5000);
		zoomPageByJS(driver, 150);
		Thread.sleep(5000);
		zoomPageByJS(driver, 100);
		Thread.sleep(5000);

	}

	// Methods
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);

	}

	public static String getTitle(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public static void generateAlert(String message, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	public static void refreshPage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");

	}

	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	public static void scrollPageUp(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

	}

	public static void zoomPageByJS(WebDriver driver, int percent) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.body.style.zoom='" + percent + "%'");

	}

	public static void flash(WebElement element, WebDriver driver) {
		// JavascriptExecutor js=((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 50; i++) {
			chanegeColor("#000000", element, driver);
			chanegeColor(bgcolor, element, driver);
		}
	}

	public static void chanegeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
