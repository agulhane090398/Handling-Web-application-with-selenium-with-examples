package home_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		//(1)no. of rows
		int rows=driver.findElements(By.xpath("//*[@id=\"task-table\"]/tbody/tr")).size();
		System.out.println("No of rows: "+rows);
		
		//(2)no. of Column
		int cols=driver.findElements(By.xpath("//*[@id=\"task-table\"]/thead/tr/th")).size();
		System.out.println("No of Cols: "+cols);
		
		//(3)Retrieve row/column data
		WebElement data=driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr[2]/td[2]"));
		System.out.println("Data of 2nd row and 2nd column: "+data.getText());

		//(4)Retrieve all data of table
		
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print((driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+r+"]/td["+c+"]")).getText())+"\t");
			}
			System.out.println();
		}
		
		
		//(5)Retrieve data matching to table
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if((driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+r+"]/td["+c+"]")).getText()).equalsIgnoreCase("SEO tags"))
				{
					String status=driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+r+"]/td["+4+"]")).getText();
					System.out.println("SEO tags has status: "+status);
					System.out.println("Search completed");
				}
			}
			
		}
		
		
		//Method
		String status=searchdata(driver, "task-table", driver.findElements(By.xpath("//*[@id=\"task-table\"]/tbody/tr")), driver.findElements(By.xpath("//*[@id=\"task-table\"]/thead/tr/th")), 4);
		System.out.println("Method worked with string: "+status);
		
		driver.close();
	}
	public static String searchdata(WebDriver driver,String tableId,List<WebElement> rowSizelocator,List<WebElement> columnSizelocator,int resultColumnData)
	{
		String status=null;
		for(int r=1;r<=rowSizelocator.size();r++)
		{
			for(int c=1;c<=columnSizelocator.size();c++)
			{
				if((driver.findElement(By.xpath("//*[@id=\""+tableId+"\"]/tbody/tr["+r+"]/td["+c+"]")).getText()).equalsIgnoreCase("SEO tags"))
				{
					status=driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+r+"]/td["+resultColumnData+"]")).getText();
					
				}
			}
			
		}
		return status;
	}

}
