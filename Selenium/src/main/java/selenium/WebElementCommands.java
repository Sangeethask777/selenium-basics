package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");	
		driver.manage().window().maximize();
		
		WebElement obsquraLogo=driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
		boolean result=obsquraLogo.isDisplayed();
		System.out.println(result);
		
		WebElement checkBox=driver.findElement(By.className("form-check-input"));
		boolean result2=checkBox.isSelected();
				
		System.out.println(result2);
	
		WebElement firstName=driver.findElement(By.xpath("//label[text()=\"First name\"]"));
		String result3=firstName.getText();
		System.out.println(result3);
		
		String result4 = firstName.getCssValue("font-family");
		System.out.println(result4);
		
		String result5 = firstName.getCssValue("font-size");
		System.out.println(result5);
		
		String result6 = firstName.getAttribute("for");
		System.out.println(result6); 
		
		Point result7 = firstName.getLocation();
		System.out.println(result7);
		
		Dimension size = firstName.getSize();
		System.out.println(size);
		
		
		
		
		
		
		driver.quit();
		

	
	
	
	
	
	
	}

}
