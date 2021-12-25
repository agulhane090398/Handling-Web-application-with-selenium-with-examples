package assignment;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;
import utility.WebTable;

public class WorkingOnCellsAndRows {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rnum=3;
		int cnum=2;
		WebDriver driver=WebBrowser.openBrowser("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		String data="B. Wagner;Software Engineer;San Francisco;28 Tue 7th Jun 11;$206,850/y";
		String[] arraydata=data.split(";");
		List<String> expdata=Arrays.asList(arraydata);
		
		List<String> actdata=WebTable.getRowData(driver, By.id("example"), 5);
		if(expdata.equals(actdata)) {
			System.out.println("Row verified Successfully");
		}
		
		
		String expecdata="Integration Specialist";
		String actcelldata=WebTable.getCellData(driver, By.id("example"), 6, 1);
		if(expecdata.equals(actcelldata))
		{
			System.out.println("Cell Verified Successfully");
		}
		
		driver.close();
		/*
		
//		for all rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		
//		single row
		WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+rnum+"]"));

//		column
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr["+rnum+"]/td"));
		
		
		WebElement cell=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+rnum+"]/td["+cnum+"]"));
	*/
	}

}
