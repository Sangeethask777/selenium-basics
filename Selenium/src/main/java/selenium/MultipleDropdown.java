package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");	
		driver.manage().window().maximize();
		
		WebElement dropDown=driver.findElement(By.id("multi-select-field"));
		Select sel=new Select(dropDown);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		WebElement getAllSelected=driver.findElement(By.id("button-all"));
		getAllSelected.click();
		//sel.deselectByIndex(1);
		//sel.deselectByIndex(2);
		//sel.deselectAll();
		
		
		
		/* code to select all values from a multi select dropdown.*/
		/* getOptions() - returns the list of all options in the dropdown  */
		
		
		
		List<WebElement> allColors = sel.getOptions();
		for (WebElement i: allColors){
	         System.out.println(i.getText());
		}
	     
		/* check if it is a multi select dropdown or not . isMultiple() used to return true if multi-select dropdown*/
		
		Boolean result=sel.isMultiple();
		System.out.println(result);
		
		//for getting first select option
		
		WebElement firstColor=sel.getFirstSelectedOption();
		System.out.println(firstColor.getText());
		
		List<WebElement> allSelectedColors = sel.getAllSelectedOptions();
		for (WebElement i: allSelectedColors){
	         System.out.println(i.getText());
		}
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
