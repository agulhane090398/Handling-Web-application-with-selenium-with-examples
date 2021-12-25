package home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
	public static void main(String[] args) {
//		demo1
		
		try {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
/*		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@tabindex=\"3\"]")).click();
		String date="10";
		String month="Oct";
		String year="2021";
		
		
		
		while(true)
		{
			String monthYear=driver.findElement(By.xpath("//*[@class=\"monthTitle\"]")).getText();
//			System.out.println(monthYear);
			String[] arr=monthYear.split(" ");
			
			String mon=arr[0];
			String yr=arr[1];

			if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
				break;
			else
			{
//				System.out.println(mon+"  "+yr);
				
				driver.findElement(By.xpath("//*[@class=\"next\"]/button")).click();
			}
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class=\"rb-monthTable first last\"]//td"));
		for(WebElement d:alldates)
		{
			String dy=d.getText();
			if(dy.equalsIgnoreCase(date))
			{
				d.click();
				System.out.println("Test Done");
				break;
			}

		}*/
		
//		Demo 2
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.findElement(By.xpath("//*[@name=\"dob\"]")).click();
		
		//month
		WebElement month=driver.findElement(By.xpath("//*[@data-handler=\"selectMonth\"]"));
		Select mDropDown=new Select(month);
		mDropDown.selectByVisibleText("Mar");
		
		//year
		WebElement year=driver.findElement(By.xpath("//*[@data-handler=\"selectYear\"]"));
		Select yDropDown=new Select(year);
		yDropDown.selectByVisibleText("1998");
		
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//tr/td"));
		for(WebElement d:alldates)
		{
			String dy=d.getText();
			if(dy.equalsIgnoreCase("9"))
			{
				d.click();
				System.out.println("Test Done");
				break;
			}

		}
		
//		driver.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
