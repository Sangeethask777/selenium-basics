package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");	
		driver.manage().window().maximize();

		driver.switchTo().frame("frame-bottom");
		
		WebElement text = driver.findElement(By.cssSelector("body"));
	    System.out.println("Frame text: " +text.getText());
	      
	     driver.switchTo().parentFrame();
	     driver.quit();
		
	}

}
