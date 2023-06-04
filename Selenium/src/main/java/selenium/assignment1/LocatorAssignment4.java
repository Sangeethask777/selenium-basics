package selenium.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		electronics.click();
		
		driver.navigate().refresh();
		
		//driver.navigate().back();
		
		WebElement heavyDutyMachine=driver.findElement(By.partialLinkText("Heavy duty"));
		heavyDutyMachine.click();
		
		//driver.navigate().back();
		
		//driver.close();
		
		
		
		
		
	}

}
