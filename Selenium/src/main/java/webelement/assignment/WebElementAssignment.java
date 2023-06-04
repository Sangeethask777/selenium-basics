package webelement.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");	
		driver.manage().window().maximize();
		
		WebElement valueAtextBox=driver.findElement(By.id("value-a"));
		valueAtextBox.sendKeys("10");
		
		WebElement valueBtextBox=driver.findElement(By.id("value-b"));
		valueBtextBox.sendKeys("20");
		
		WebElement getTotal = driver.findElement(By.id("button-two"));
		getTotal.click();
		
		WebElement totalValue=driver.findElement(By.id("message-two"));
		boolean result= totalValue.isDisplayed();
		System.out.println(result);
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		
		WebElement checkBoxone=driver.findElement(By.xpath("(//input[@id='check-box-one'])[1]"));
		boolean result1=checkBoxone.isSelected();
		System.out.println(result1);
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		WebElement femaleButton = driver.findElement(By.xpath("(//input[@name='inlineRadioOptions'])[2]"));
		//femaleButton.click();
		boolean gender = femaleButton.isSelected();
		System.out.println(gender);
		
		
		driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		
		WebElement obsquraLogo=driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
		boolean image=obsquraLogo.isDisplayed();
		System.out.println(image);
		
		Point obsquraLogo1=obsquraLogo.getLocation();
		System.out.println(obsquraLogo1);
		
		Dimension size=obsquraLogo.getSize();
		System.out.println(size);
		
		driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		
		WebElement copyRight=driver.findElement(By.xpath("//p[contains(text(),'© 2021 Obsqura Testing, All Rights Reserved.')]"));
		String getText=copyRight.getText();
		System.out.println(getText);
		
		String fontFam = copyRight.getCssValue("font-family");
		System.out.println(fontFam);
		
		String fontSize = copyRight.getCssValue("font-size");
		System.out.println(fontSize);
		
		String tagName=copyRight.getTagName();
		System.out.println(tagName);
		
		driver.quit();
		
		
		
		
		
		
		
		
		//driver.quit();
		
		
		
		

	}

}
