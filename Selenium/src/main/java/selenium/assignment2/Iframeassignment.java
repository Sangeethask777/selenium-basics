package selenium.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeassignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");	
		driver.manage().window().maximize();

		
		driver.switchTo().frame("packageListFrame");
		WebElement openqSelenium=driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']"));
		openqSelenium.click();
		
		driver.switchTo().parentFrame();            //driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement openqaframe2=driver.findElement(By.xpath("//a[@href='package-summary.html']"));
		System.out.println("Frame text: " +openqaframe2.getText());
		driver.switchTo().parentFrame();
		//driver.close();
	}
}

