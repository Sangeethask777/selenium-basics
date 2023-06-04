package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");	
		driver.manage().window().maximize();
		
		WebElement iFrame=driver.findElement(By.id("a077aa5e"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
				
		//js.executeScript("arguments[0].scrollIntoView();", iFrame);
		
		driver.switchTo().frame("a077aa5e");
		js.executeScript("arguments[0].click();", iFrame);
		driver.switchTo().parentFrame();
		
		
		
		
		WebElement email=driver.findElement(By.id("philadelphia-field-email"));
		email.sendKeys("sangeetha342@gmail.com");
		
		
		

	}

}
