package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		//set path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//object creation
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//load url
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MDU",Keys.TAB);
		WebElement check = driver.findElementById("chkSelectDateOnly");
		if (check.isSelected()) {
			check.click();
		}
		//table level
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		//row level
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		for (int i = 0; i < row.size(); i++) {
			WebElement secondRow = row.get(i);
			//column level
			List<WebElement> column = secondRow.findElements(By.tagName("td"));
			System.out.println(column.size());
			String text = column.get(1).getText();
			System.out.println(text);
		} 



	}

}








