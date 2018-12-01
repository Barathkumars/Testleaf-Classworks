package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(0);
//		//move one step back
//		driver.switchTo().parentFrame();
//		//switch to default page
//		driver.switchTo().defaultContent();
		
		
		driver.findElementByXPath("//li[text()='Item 3']").click();
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
