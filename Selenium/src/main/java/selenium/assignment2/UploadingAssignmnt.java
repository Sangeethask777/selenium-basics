package selenium.assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UploadingAssignmnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");	
		driver.manage().window().maximize();
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.click();
		firstName.sendKeys("Sangeetha");
		
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.click();
		lastName.sendKeys("S");
		
		WebElement gender=driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		
		WebElement experience = driver.findElement(By.xpath("(//input[@name='exp'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", experience);
		
		WebElement date=driver.findElement(By.xpath("(//input[@style='width:95%;padding:4px 0px 4px 5px;margin:4px 0px'])[3]"));
		date.sendKeys("31/05/2023");
		
		WebElement profession=driver.findElement(By.xpath("(//input[@value='Automation Tester'])[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", profession);
		

		WebElement photoUpload=driver.findElement(By.name("photo"));
		photoUpload.sendKeys("C:\\Users\\sange\\OneDrive\\Pictures\\Add Product.png");
		
		WebElement seleniumFlavour=driver.findElement(By.xpath("//input[@value='RC']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", seleniumFlavour);
		
		
		WebElement continents=driver.findElement(By.xpath("//select[@name='continents']"));
        Select sel=new Select(continents);

		sel.selectByIndex(3);

		

		WebElement firstSelected=sel.getFirstSelectedOption();
        System.out.println(firstSelected.getText());

		

		WebElement seleniumCommands=driver.findElement(By.xpath("//*[@name='selenium_commands']"));
        Select select=new Select(seleniumCommands);
        select.selectByIndex(0);
        select.selectByIndex(2);
        select.selectByIndex(4);

	

		List<WebElement> allSelectedValues= select.getAllSelectedOptions();
        for (WebElement i: allSelectedValues)
        {

		System.out.println(i.getText());

		}

		

		WebElement button=driver.findElement(By.xpath("//button[@name='submit']"));
        button.submit();

		System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

		

			

		//driver.quit();

		

		}
}