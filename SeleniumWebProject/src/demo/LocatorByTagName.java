package demo;
import utility.WebBrowser;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorByTagName {
	public static void main(String[] args) {
		try {
		WebDriver driver=WebBrowser.openBrowser("https://www.google.co.in/");
		
		List <WebElement> l1=driver.findElements(By.tagName("a"));
		
		System.out.println("No of links on Google home page: " + l1.size());
		
		for(WebElement link:l1)
		{
			System.out.println(link.getText());
		}
		driver.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
