package demo;


import java.util.List;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utility.WebBrowser;
import java.time.Duration;

public class WebScrapping {

	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://www.flipkart.com/search?q=oneplus+9+pro");
		int count=1;
		while(true) {
			try {
			List<WebElement> list=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				
				for (WebElement ele : list) {
					if(isVisible(driver, ele)) {
						System.out.println(count+"."+ele.getText());
						count++;
					}
					
				}
				if(isVisible(driver, By.xpath("//*[text()='Next']")).isDisplayed()) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[text()='Next']")).click();
					Thread.sleep(3000);
				}
			
			}
			catch (Exception e) {
				break;
			}
		}

	}
	public static WebElement isVisible(WebDriver driver, By by) {

		Wait<WebDriver> ft = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(60)).ignoring(NoSuchElementException.class);

		WebElement ele = ft.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {

				return driver.findElement(by);
			}
		});

		return ele;

	}
	
	public static boolean isVisible(WebDriver driver, WebElement	e) {

		Wait<WebDriver> ft = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(60)).ignoring(NoSuchElementException.class);

		return  ft.until(ExpectedConditions.visibilityOf(e)).isDisplayed();

			
		

	}

}