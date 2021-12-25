package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.WebBrowser;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=WebBrowser.openBrowser("https://www.americangolf.co.uk/");
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//header/nav[@id='header-navigation-wrapper']/div[@id='header-navigation']/div[1]/ul[1]/li[3]/a[1]"));
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
		
		WebElement subEle=driver.findElement(By.xpath("//header/nav[@id='header-navigation-wrapper']/div[@id='header-navigation']/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
		subEle.click();
		
		//Right Click
       
	}

}
