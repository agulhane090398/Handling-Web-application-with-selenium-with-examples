package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		WebElement inputbox=driver.findElement(By.xpath("//*[@id=\"age\"]"));
		System.out.println(inputbox.getAttribute("title"));
	}

}
