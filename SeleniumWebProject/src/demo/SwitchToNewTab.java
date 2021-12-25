package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;

public class SwitchToNewTab {

	public static void main(String[] args) {
		WebDriver driver = WebBrowser.openBrowser("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Tabbed Windows")).click();

//		Session id
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		driver.findElement(By.xpath("//a/button[@class=\"btn btn-info\"]")).click();

//		get all session ids
		Set<String> childids = driver.getWindowHandles();
		int count = 1;
		for (String win : childids) {
			System.out.println(count + ":" + win);
			count++;
		}

		try {
			//Switch to parent Window or main window
			//driver.switchTo().window(parentId);
			
			//Following code opens the child windows and closes it, except parent
			for (String win : childids) {
				if (!win.equalsIgnoreCase(parentId)) {
					driver.switchTo().window(win);
					driver.close();
				}
			}

//			driver.switchTo().window(parentId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
