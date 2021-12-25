package home_practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//How to capture Cookies from browser
		Set<Cookie> allcookies=driver.manage().getCookies();
		for(Cookie c:allcookies)
		{
			System.out.println(c.getName()+" : "+c.getDomain()+" : "+c.getValue()+" : "+c.getPath());
		}
		System.out.println();
		
		
		//How to add Cookies
		Cookie ck=new Cookie("scscccs", "12551");
		driver.manage().addCookie(ck);
		allcookies=driver.manage().getCookies();
		System.out.println("addCookie: "+allcookies.size());
		
		
		//How to delete Cookies as object
		driver.manage().deleteCookie(ck);
		allcookies=driver.manage().getCookies();
		System.out.println("deleteCookie: "+allcookies.size());
		
		//How to delete Cookies as Name
		driver.manage().deleteCookieNamed(".Nop.Customer");
		allcookies=driver.manage().getCookies();
		System.out.println("deleteCookieNamed :"+allcookies.size());
		
		
		//How to delete all Cookies
		driver.manage().deleteAllCookies();
		allcookies=driver.manage().getCookies();
		System.out.println("deleteAllCookies :"+allcookies.size());
		

		driver.close();
	}

}
