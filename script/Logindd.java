package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Logindd {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //driver.findElement(By.name("firstname")).sendKeys("Manju");
	 driver.switchTo().activeElement().sendKeys("Manju");
	 driver.findElement(By.name("lastname")).sendKeys("g");
	 driver.findElement(By.name("reg_email__")).sendKeys("g@yahoo.co.in");
	 driver.findElement(By.name("reg_passwd__")).sendKeys("abcd");

	 WebElement dd = driver.findElement(By.id("day"));
	 Select select = new Select(dd);
	 select.selectByIndex(5);
	 
	 Select select1 = new Select(driver.findElement(By.id("month")));
	 select1.selectByValue("12");
	 Select select2 = new Select(driver.findElement(By.id("year")));
	 select2.selectByIndex(20);

	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	 

	}

}
