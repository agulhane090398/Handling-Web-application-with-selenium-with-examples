package home_practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		int brokenLinks = 0;
		for (WebElement element : links) {
			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("Url is Empty");
				continue;
			}

			URL link = new URL(url);
			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();
				if (httpconn.getResponseCode() >= 400) {
					System.out.println(httpconn.getResponseCode() + url + " is Broken Link");
					brokenLinks++;
				} else {
					System.out.println(httpconn.getResponseCode() + url + " is Valid Link");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		System.out.println("Number of broken links: " + brokenLinks);
		driver.quit();
	}

}
