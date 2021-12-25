package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

//			Name
			WebElement name = driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
			name.sendKeys("Aniket");

//			Choose email
			WebElement rdfid = driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input"));
			rdfid.sendKeys("abcxyz123");

			driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
			if (driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font[1]/b")).isDisplayed()) {
				// IMPORTANT
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//table/tbody/tr[8]/td/div[@id=\"recommend_text\"]/table/tbody/tr[1]/td[1]/input[@id=\"radio_login\"]")))
						.click();
				System.out.println("id choosen is: " + wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//table/tbody/tr[8]/td/div[@id=\"recommend_text\"]/table/tbody/tr[1]/td[@class=\"f14\"]")))
						.getText());

//			Password
				WebElement pass = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input"));
				pass.sendKeys("@nikeT123");

//			Retype Password
				WebElement re_pass = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input"));
				re_pass.sendKeys("@nikeT123");

//			No-Alternate Email
				WebElement email_chkbox = driver
						.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
				email_chkbox.click();

				if (driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table")).isDisplayed()) {
//			Security Question
					WebElement que = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
					if (que.isEnabled()) {
						boolean flag = false;
						Select question = new Select(que);
						List<WebElement> options = question.getOptions();
						for (WebElement option : options) {
							if (option.getAttribute("value").equals("What is your favourite food?")) {
								flag = true;
								question.selectByValue("What is your favourite food?");
								break;
							}
						}
						if (flag == false) {
							System.out.println("The Option you are looking is not available");
						}
					}

//			Answer
					WebElement ans = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input"));
					ans.sendKeys("apple");

//			Maiden name
					WebElement Maide_Name = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input"));
					Maide_Name.sendKeys("Gangu Tai");
				}
//			Mobile No
				WebElement Mob = driver.findElement(By.xpath("//*[@id=\"mobno\"]"));
				Mob.sendKeys("7350813275");

//			DOB
//			Day
				WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
				Select d = new Select(day);
				{
					boolean flag = false;
					List<WebElement> days = d.getOptions();
					for (WebElement i : days) {
						if (i.getText().equalsIgnoreCase("09")) {
							flag = true;
							d.selectByVisibleText("09");
							break;
						}
					}
					if (flag == false) {
						System.out.println("Day option not availaible");
					}
				}

//			Month
				WebElement Month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
				Select m = new Select(Month);
				{
					boolean flag = false;
					List<WebElement> months = m.getOptions();
					for (WebElement i : months) {
						if (i.getText().equalsIgnoreCase("Mar")) {
							flag = true;
							m.selectByVisibleText("MAR");
							break;
						}
					}
					if (flag == false) {
						System.out.println("Month option not availaible");
					}
				}

//			Year
				WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
				Select y = new Select(year);
				{
					boolean flag = false;
					List<WebElement> years = y.getOptions();
					for (WebElement i : years) {
						if (i.getText().equalsIgnoreCase("1998")) {
							flag = true;
							y.selectByVisibleText("1998");
							break;
						}
					}
					if (flag == false) {
						System.out.println("Year option not availaible");
					}
				}

//			Gender
				List<WebElement> gender = driver.findElements(By.name("gendere67a5854"));
				for (WebElement i : gender) {
					if (i.getAttribute("value").equalsIgnoreCase("Male")) {
						i.click();
						break;
					}
				}

//			Country
				WebElement Country = driver.findElement(By.cssSelector("[id=\"country\"]"));
				Select countr = new Select(Country);
				{
					boolean flag = false;
					List<WebElement> c = countr.getOptions();
					for (WebElement i : c) {
						if (i.getText().equalsIgnoreCase("India")) {
							flag = true;
							countr.selectByVisibleText("India");
							break;
						}
					}
					if (flag == false) {
						System.out.println("Option is not available for Country");
					}
				}

//			city
				WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
				Select cities = new Select(city);
				{
					boolean flag = false;
					List<WebElement> c = cities.getOptions();
					for (WebElement i : c) {
						if (i.getText().equalsIgnoreCase("Pune")) {
							flag = true;
							cities.selectByVisibleText("Pune");
							break;
						}
					}
					if (flag == false) {
						System.out.println("Option is not available for City");
					}
				}

				/*
				 * // Captcha name WebElement
				 * Captcha=driver.findElement(By.name("58cf15a98155486c591c54769723cca1e67a5854"
				 * )); Captcha.sendKeys("");
				 */
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("some sort of error occured");
		}
	}
}
