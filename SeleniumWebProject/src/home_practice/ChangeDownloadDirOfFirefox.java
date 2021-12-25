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
			driver.findElement(By.xpath("//*[@class="text-right file-link"]//a")).click();

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




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//Working Demo



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
 
public class ChangeDownloadDirOfFirefox {
 
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
 
        // Setting firefox driver path
        System.setProperty("webdriver.gecko.driver", ".//lib//geckodriver.exe");
 
        // Setting new download directory path
        String location=System.getProperty("user.dir")+".//externalFiles//downloadFiles";
        
        FirefoxProfile profile=new FirefoxProfile();
        profile.setAssumeUntrustedCertificateIssuer(false);
        profile.setPreference("browser.helperapps.neverAsk.saveToDisk", "text/csv,application/java-archive, application/x-msexcel,application/excel,application/vnd.openxmlformats-officedocument.wordprocessingml.document,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/vnd.microsoft.portable-executable");
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", location);
        profile.setPreference("pdfjs.disable", true);
        
    
        // Adding cpabilities to FireFoxOptions
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
         
        // Printing set download directory
        System.out.println(options.setProfile(profile));
         
        // Launching browser with desired capabilities
        WebDriver driver= new FirefoxDriver(options);
         
        // URL loading
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
         
        // Click on download selenium server jar file
        driver.findElement(By.xpath("//*[@class=\"text-right file-link\"]//a")).click();
        driver.switchTo().frame("aswift_3");
        driver.switchTo().frame("ad_iframe");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")));
        //driver.switchTo().parentFrame();
        
        Robot rb=new Robot();
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
    }
}

//*ad ko block kaise kare