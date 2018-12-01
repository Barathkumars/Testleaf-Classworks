package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Alert Box']").click();
//		String alertText = driver.switchTo().alert().getText();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	 	wait.until(ExpectedConditions.alertIsPresent());
//		Thread.sleep(3000);
//		System.out.println(alertText);
//		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}








