package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class SevenRMartTest extends Base{
	
	public void logIn()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("admin");
		WebElement remember=driver.findElement(By.xpath("//label[@for='remember']"));
		remember.click();
		WebElement signin=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		signin.click();
		
	}

	public static void main(String[] args) {
		
		SevenRMartTest seven=new SevenRMartTest();
		seven.initializeBrowser();
		seven.logIn();
	}

}
