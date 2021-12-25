package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.WebBrowser;

public class AssignmentAlert {

	public static void main(String[] args) {
//		Simple Alert
		WebDriver driver=WebBrowser.openBrowser("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		try {
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//html/body/button")).click();
			
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			
			a.accept();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
//		ConfirmAlert
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		try {
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//html/body/button")).click();
			Alert a=driver.switchTo().alert();
			Thread.sleep(5000);
			a.accept();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
			
			driver.findElement(By.xpath("//html/body/button")).click();
			Alert b=driver.switchTo().alert();
			Thread.sleep(5000);
			a.dismiss();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
//			driver.close();
			
		}
		
		
//		promptAlert
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		try {
			driver.switchTo().frame("iframeResult");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//html/body/button")).click();
			
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText()); 	//Please enter your name:
			
			a.sendKeys("Aniket");
			Thread.sleep(3000);
			a.accept();
			
			String excepted="Hello Aniket! How are you today?";
			String actual=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
			
			if(excepted.equals(actual))
			{
				System.out.println("Test done");
			}
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			driver.close();
			
		}
		
		
		
	}

}
