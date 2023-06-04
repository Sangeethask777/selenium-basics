package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingSendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");	
		driver.manage().window().maximize();

		WebElement chooseFile=driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys("C:\\Users\\sange\\OneDrive\\Pictures\\Add Product.png");
		
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.submit();
		
	}

}
