package home_practice;
/*
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadWordFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			String location = System.getProperty("ures.dir") + "\\Downloads\\";

//		chromeDriver
			Map<String, Object> preferences = new HashMap<String, Object>();
			preferences.put("download.default_directory", location);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", preferences);
			options.addArguments("--disable-notification");

			// Code
			System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");

			WebDriver driver = new ChromeDriver(options);
			driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");

			// file (DOC)
			Thread.sleep(5000);
			String parent = driver.getWindowHandle();
			driver.findElement(By.xpath("//a[@download=\"file-sample_100kB.doc\"]")).click();

			Set<String> windowIds = driver.getWindowHandles();
			System.out.println(windowIds.size());
			for (String win : windowIds) {
				if (!win.equals(parent)) {
					driver.switchTo().window(win);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
*/




//Working Demo

import java.io.File;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class ChangeDownloadDirOfChrome {
 
    public static void main(String[] args) throws IOException, InterruptedException {
 
    	try {
        // Setting chrome driver path
        System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
 
        // Setting new download directory path
        Map<String, Object> prefs = new HashMap<String, Object>();
         
        // Use File.separator as it will work on any OS
        prefs.put("download.default_directory",
                System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator + "downloadFiles");
         
        // Adding cpabilities to ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
         
        // Printing set download directory
        System.out.println(options.getExperimentalOption("prefs"));
         
        // Launching browser with desired capabilities
        WebDriver driver= new ChromeDriver(options);
         
        // URL loading
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.manage().window().maximize();
         
        // Click on download selenium server jar file
        Thread.sleep(5000);        
 

        Thread.sleep(2000);
        
        driver.switchTo().frame("aswift_3");
        driver.switchTo().frame("ad_iframe");
      //*[@id="dismiss-button"]
        driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}

    }
}

//*ad ko block kaise kare