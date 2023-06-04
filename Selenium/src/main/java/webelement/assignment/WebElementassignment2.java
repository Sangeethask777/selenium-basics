package webelement.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementassignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");	
		driver.manage().window().maximize();
		
		WebElement pathById=driver.findElement(By.id("un"));
		
		//pathById.click();
		WebElement pathByName=driver.findElement(By.name("un"));
		
		WebElement pathByClass=driver.findElement(By.className("form-control"));
		
		WebElement pathByCss=driver.findElement(By.cssSelector("un"));
		
		WebElement pathByCss2=driver.findElement(By.cssSelector("un"));
		WebElement pathByCss3=driver.findElement(By.cssSelector("form-control"));
		
		WebElement pathByLinkTxt=driver.findElement(By.linkText("Electronics"));
		
		WebElement pathByLinkTxt2=driver.findElement(By.partialLinkText("Ele"));
		
		WebElement pathByxpath=driver.findElement(By.xpath("(//a[@href='https://groceryapp.uniqassosiates.com/electronics?p'])[1]"));
		
		WebElement pathByXpathtext=driver.findElement(By.xpath("WebElement pathByLinkTxt2=driver.findElement(By.partialLinkText(\"Ele\"));"));
		
		WebElement pathbyAttributeTyp=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/electronics?p']"));
		
		WebElement pathByXpath=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		
		
		
		
		

	}

}
