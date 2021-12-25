package home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {					//Dynamic table is pending

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");

		List<WebElement> cells = driver.findElements(By
				.xpath("//div[@class=\"market_bx\"]//div[@id=\"maindindi\"]//table[@class=\"mctable1\"]/tbody/tr/td"));
		for (WebElement cell : cells) {
			System.out.println(cell.getText());
		}

	}

}
