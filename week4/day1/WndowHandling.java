package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		driver.findElementByLinkText("Contact Us").click();
        System.out.println(driver.getTitle());
		//for windows
        Set<String> allWindows = driver.getWindowHandles();
		List<String> lst = new ArrayList<>();
		lst.addAll(allWindows);
		driver.switchTo().window(lst.get(1));
		
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(lst.get(0)); 
		driver.close();
	}

}





