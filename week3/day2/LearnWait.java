package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
        //set path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//object creation
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//click crmsfa
		driver.findElementByLinkText("CRM/SFA").click();
		//click createLead
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("gopi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	 	
		WebDriverWait wait = new WebDriverWait(driver, 10);
	 	wait.until(ExpectedConditions.elementToBeClickable(
	 			driver.findElementByXPath(
	 			"//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
	 	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		
		//close the browser
		//driver.close();
	}

}









