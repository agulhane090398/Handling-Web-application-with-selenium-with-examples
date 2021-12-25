package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToInnerFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));			//outer frame
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@title=\"Iframe Example\"]")));	//inner frame
		
		System.out.println(driver.findElement(By.xpath("//*/h1")).getText());
		
		driver.switchTo().parentFrame();
		
		System.out.println(driver.findElement(By.xpath("//*/p[contains(text(),\"You can \")]")).getText());
		
		driver.close();
	}

}
