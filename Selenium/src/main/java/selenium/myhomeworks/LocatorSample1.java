package selenium.myhomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        
       
        
        WebElement downloads=driver.findElement(By.linkText("Downloads"));
        downloads.click();
        
        
        
        
		
		
		
		
	}

}
