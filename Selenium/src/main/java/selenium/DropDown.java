package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");	
		//driver.manage().window().maximize();

		WebElement dropDownSelectcolor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		dropDownSelectcolor.click();
		Select sel=new Select(dropDownSelectcolor);
		//sel.selectByIndex(1);
		//sel.selectByValue("Yellow");
		sel.selectByVisibleText("Green");
		
		//sel.deselectByVisibleText("Green");
		
		List<WebElement> list = sel.getOptions();
		for (WebElement i: list){
	         System.out.println(i.getText());
		}
		
		Boolean result=sel.isMultiple();
		System.out.println(result);
		
		WebElement firstColor=sel.getFirstSelectedOption();
		System.out.println(firstColor.getText());
		
		
	     driver.quit();
		
		
		
		
	}

}
