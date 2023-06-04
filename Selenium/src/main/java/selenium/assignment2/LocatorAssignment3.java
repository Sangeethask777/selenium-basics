package selenium.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		enterValueA.sendKeys("10");
		
		WebElement enterValueB=driver.findElement(By.id("value-b"));
		enterValueB.sendKeys("20");
		
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();
		
		//driver.navigate().back();
		//driver.close();
		
		
		

	}

}
