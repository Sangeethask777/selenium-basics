package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//WebElement simpleFormDemo=driver.findElement(By.linkText("Simple Form Demo"));
		//WebElement simpleFormDemo1=driver.findElement(By.partialLinkText("Simple Form"));
		//WebElement messageTextBox=driver.findElement(By.cssSelector("input.form-control"));//using class in cssSelector
		
		WebElement messageTextBox=driver.findElement(By.cssSelector("input#single-input-field"));//using id in cssSelector
		
		messageTextBox.sendKeys("hai");
		//using name in cssSelector syntax :"tagname[name=value of name]"
		
		
		
		
		
		
		
		
		
		
	}

}
