package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;
import utility.WebElementMethods;

public class CheckElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("https://demo.nopcommerce.com/register");
		WebElement sarchStored=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
//		isDisplay()
		System.out.println("Display Status: "+sarchStored.isDisplayed());
		
//		isEnabled()
		System.out.println("Enabled Status: "+sarchStored.isEnabled());
		
//		isSelected()
		WebElement male=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		System.out.println("Selected Status: "+male.isSelected());//False
		System.out.println("Selected Status: "+female.isSelected());//False
		
		WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"gender-male\"]"));
		System.out.println("Selected Status: "+male.isSelected());//True
		System.out.println("Selected Status: "+female.isSelected());//False
	
		WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"gender-female\"]"));
		System.out.println("Selected Status: "+male.isSelected());//False
		System.out.println("Selected Status: "+female.isSelected());//True
	}

}
