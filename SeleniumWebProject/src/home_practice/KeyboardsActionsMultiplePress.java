package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardsActionsMultiplePress {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		WebElement input2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
		input1.sendKeys("Welcome My Friend");
		
		Actions act=new Actions(driver);
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Ctrl+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB
		act.sendKeys(Keys.TAB);
		
		//Ctrl+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyDown(Keys.CONTROL);
		act.perform();
		
		if(input1.getText().equals(input2.getText()))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}

}

