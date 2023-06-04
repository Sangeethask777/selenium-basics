package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");	
		driver.manage().window().maximize();
		
		WebElement clickMe1=driver.findElement(By.xpath("//button[text()='Click me!'][1]"));
		clickMe1.click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		WebElement clickme2=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		clickme2.click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		WebElement clickMe3=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		clickMe3.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("sangeetha");
		driver.switchTo().alert().accept();
		
		
		
		//driver.close();

	}

}
