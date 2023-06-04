package selenium.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/sign-up");
		
		WebElement firstNameInput=driver.findElement(By.name("fname"));
		firstNameInput.sendKeys("Sangeetha");
		
		WebElement lastNameInput=driver.findElement(By.name("lname"));
		lastNameInput.sendKeys("s");
		
		WebElement emailInput=driver.findElement(By.name("email"));
		emailInput.sendKeys("sangeethask777@gmail.com");
		
		
		WebElement telephoneInput=driver.findElement(By.name("phone"));
		telephoneInput.sendKeys("12345678910");
		
		WebElement passwordInput=driver.findElement(By.name("password1"));
		passwordInput.sendKeys("sa@123");
		
		WebElement repeatPasswordInput=driver.findElement(By.name("password2"));
		repeatPasswordInput.sendKeys("sa@123");
		
		WebElement signUpButton=driver.findElement(By.className("next_ch02"));
		signUpButton.click();
		
		driver.quit();
		
		
		
		
		
		

	}

}
