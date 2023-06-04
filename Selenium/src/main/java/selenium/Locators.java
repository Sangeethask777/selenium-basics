package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

     public class Locators {
	
	
	 public static void main(String args[]) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sange\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://groceryapp.uniqassosiates.com/home");
		
		WebElement search=driver.findElement(By.id("un"));
		//WebElement search1=driver.findElement(By.name("un"));
		//WebElement search2=driver.findElement(By.className("form-control"));
		search.sendKeys("Apple"); //used to type an element in searchbox.
		
		//search.clear();
		//search.click();
		
		
		
		
		
	}
	

}
