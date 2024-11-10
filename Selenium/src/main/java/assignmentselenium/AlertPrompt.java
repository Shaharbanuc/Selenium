package assignmentselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testscript.Base;

public class AlertPrompt extends Base{
//exception code
	public void alertPrompt()
	{
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//wont locate need timer to wait
		 
		WebElement alert1=driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
		//button[@onclick='myFunction()']
		alert1.click();
		// Create an instance of WebDriverWait with a 10-second timeout (Selenium 4+)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='myFunction()']")));
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		
		AlertPrompt test=new AlertPrompt();
		test.initializeBrowser();
		test.alertPrompt();

	}

}
