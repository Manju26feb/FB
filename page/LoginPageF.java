package page;

import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPageF {
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement UNTB;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement UNPW;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement LoginBT;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement TBFN;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement TBLN;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement TBMN;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement TBNPwd;
	
	@FindBy(id="day")
	private WebElement DDDAY;
	
	@FindBy(id="month")
	private WebElement DDMONTH;
	
	@FindBy(xpath="//select[@title='Year']")
	private WebElement DDYEAR;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement RBSEXFEMALE;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement RBSEXMALE;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement SNUPBTN;
	
	public LoginPageF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstName(String fn)
	{
		TBFN.sendKeys(fn);
	}
	
	public void setLastName(String ln)
	{
		TBLN.sendKeys(ln);
	}
	
	public void setMobileNo(String mn)
	{
		TBMN.sendKeys(mn);
	}
	
	public void setNewPwd(String npwd)
	{
		TBNPwd.sendKeys(npwd);
	}
	
	public void setDOB_Day(String day)
	{
		//DDDAY.sendKeys(day);
		Select select = new Select(DDDAY);
		select.selectByValue(day);
	}
	
	public void setDOB_Month(String month)
	{
		DDMONTH.sendKeys(month);
	}
	
	public void setDOB_year(String year)
	{
		DDYEAR.sendKeys(year);
	}
	
	public void setSEX(String gender)
	{
	   
	if(gender =="male")	
	{
		RBSEXMALE.click();
	}
	else if(gender =="female")
	{
		RBSEXFEMALE.click();
		
	}
	}
	public void clickSignUp(WebDriver driver)
	{
		SNUPBTN.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//title[text()='Facebook']")));
		
	}
	
	public void setUserName(String un)
	{
		UNTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		UNPW.sendKeys(pw);
	}
	
	public void clickLoginF()
	{
		LoginBT.click();
	}
	

}
