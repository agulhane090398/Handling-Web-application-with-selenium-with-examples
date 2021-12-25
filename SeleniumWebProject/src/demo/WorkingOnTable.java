package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkingOnTable {

	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

		WebElement table=driver.findElement(By.id("task-table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows in table are: "+rows.size());
		
		for(WebElement row:rows)
		{
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell:cells)
			{
				System.out.println(cell.getText());
			}
		}
		System.out.println("\n\n");
//		table2
		
		WebElement table2=driver.findElement(By.cssSelector("[class=\"table\"]"));
		List<WebElement> rows2=table2.findElements(By.xpath("//html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]"));
		System.out.println("No of rows in table are: "+rows2.size());
		
		for(WebElement row:rows2)
		{
			List<WebElement> cells=row.findElements(By.xpath("//html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]"));
			for(WebElement cell:cells)
			{
				System.out.println(cell.getText());
			}
		}
	}

}
