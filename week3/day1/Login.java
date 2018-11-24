package week3.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Login {

	public static void main(String[] args) throws InterruptedException {
        //set path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//object creation
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// For IRCTC
		/*driver.findElementById("username")
		.sendKeys("DemoSalesManager", Keys.TAB);
		Thread.sleep(3000);*/
		
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//click crmsfa
		driver.findElementByLinkText("CRM/SFA").click();
		//click createLead
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		//creating object for select class
		Select sc = new  Select(source);
		//sc.selectByVisibleText("Direct Mail");
		//sc.selectByValue("LEAD_PARTNER");  
		//sc.selectByIndex(3);
		List<WebElement> allOptions = sc.getOptions();
		int count = allOptions.size();
		sc.selectByIndex(count-1);
	 	
		
		
		//close the browser
		//driver.close();
	}

}









