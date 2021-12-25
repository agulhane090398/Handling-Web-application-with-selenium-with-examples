package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;
import utility.WebElementMethods;

public class Assignment2 {

	public static void main(String[] args) {
		try {
		WebDriver driver=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
//		fName
		WebElementMethods.enterText(driver, By.xpath("//*[@ng-model=\"FirstName\"]"), "Aniket");
		
//		lName
		WebElementMethods.enterText(driver, By.xpath("//*[@ng-model=\"LastName\"]"), "Gulhane");
		
//		Address
		WebElementMethods.enterText(driver, By.xpath("//*[@ng-model=\"Adress\"]"), "B 18 Jasrana Appartment, Ek vira chowk, yavatmal, 445001");

//		email
		WebElementMethods.enterText(driver, By.xpath("//*[@ng-model=\"EmailAdress\"]"), "agulhane090398@gmail.com");

//		phone
		WebElementMethods.enterText(driver, By.xpath("//*[@ng-model=\"Phone\"]"), "7350813275");
		
//		Gender
		WebElementMethods.selectRadio(driver, By.xpath("//*[@ng-model=\"radiovalue\"]"), "Male");
		
//		Hobbies
		WebElementMethods.selectCheckBox(driver, By.xpath("//*[@class=\"form-group\"]/div/div/input"), "Cricket");
		WebElementMethods.selectCheckBox(driver, By.xpath("//*[@class=\"form-group\"]/div/div/input"), "Hockey");
		
//		Languages
		WebElementMethods.clickButton(driver, By.id("msdd"));
		WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
		
//		Skills
		WebElementMethods.selectByVisibleText(driver, By.xpath("//*[@ng-model=\"Skill\"]"), "Programming");
		
//		Country
		WebElementMethods.selectByVisibleText(driver, By.xpath("//*[@ng-model=\"country\"]"), "India");
		
//		Select Country
		WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		WebElementMethods.clickButton(driver, By.xpath("//*[@id=\"select2-country-results\"]/li[6]"));
		
//		Date
		WebElementMethods.selectByVisibleText(driver, By.xpath("//*[@ng-model=\"daybox\"]"), "9");
		WebElementMethods.selectByVisibleText(driver, By.xpath("//*[@ng-model=\"monthbox\"]"), "March");
		WebElementMethods.selectByVisibleText(driver, By.xpath("//*[@ng-model=\"yearbox\"]"), "1998");
		
//		Password
		WebElementMethods.enterText(driver, By.xpath("//*[@ng-model=\"Password\"]"), "Pass@123");
		
//		confirm
		WebElementMethods.enterText(driver, By.xpath("//*[@ng-model=\"CPassword\"]"), "Pass@123");
		
//		Submit
//		WebElementMethods.clickButton1(driver, By.id("submitbtn"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
