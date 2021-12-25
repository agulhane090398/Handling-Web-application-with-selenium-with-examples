package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;

public class SwitchToNewSeperateWindow {

	public static void main(String[] args) {
		WebDriver driver = WebBrowser.openBrowser("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();

//		Session id
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();

//		get all session ids
		Set<String> childids = driver.getWindowHandles();
		
		try {
			for(String win:childids)
			{
				if(!win.equalsIgnoreCase(parentId))
				{
					driver.switchTo().window(win);
					driver.manage().window().maximize();
					System.out.println(driver.getTitle());
				}
			}
//			driver.switchTo().window(parentId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
