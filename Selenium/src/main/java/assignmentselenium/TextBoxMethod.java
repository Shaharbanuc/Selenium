package assignmentselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TextBoxMethod extends Base{
	
	public void isEnabledButton()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement tb=driver.findElement(By.id("single-input-field"));
		System.out.println(tb.isEnabled());
		tb.sendKeys("hello wrold");
		//WebElement button=driver.findElement(By.xpath("//button[text()='Show Message']"));
		
	}

	public static void main(String[] args) {
		
		TextBoxMethod tbox=new TextBoxMethod();
		tbox.initializeBrowser();
		tbox.isEnabledButton();
		
	}

}
