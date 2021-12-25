package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min_sldr=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		WebElement max_sldr=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		
		System.out.println("Before min Location: "+min_sldr.getLocation());
		System.out.println("Before min Size: "+min_sldr.getSize());
		
		System.out.println("Before max Location: "+max_sldr.getLocation());
		System.out.println("Before max Size: "+max_sldr.getSize());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_sldr, 100, 0).perform();
		Thread.sleep(5000);
		act.dragAndDropBy(max_sldr, -100, 0).perform();
		
		System.out.println("After min Location: "+min_sldr.getLocation());
		System.out.println("After min Size: "+min_sldr.getSize());
		
		System.out.println("After max Location: "+max_sldr.getLocation());
		System.out.println("After max Size: "+max_sldr.getSize());
		
		driver.close();
	}

}
