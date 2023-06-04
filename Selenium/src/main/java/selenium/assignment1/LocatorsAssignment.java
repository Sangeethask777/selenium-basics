package selenium.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement inputForm=driver.findElement(By.id("single-input-field"));
		inputForm.click();
		
		//driver.navigate().refresh();
		inputForm.sendKeys("Hai");
		
		WebElement messageTextbox=driver.findElement(By.id("button-one"));
		messageTextbox.click();
		inputForm.clear();
		
		

	}

}
