package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBox extends Base{
	
	public void checkBoxMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		if(checkbox.isSelected())
		{
			checkbox.click();
		}
	}

	
	public static void main(String[] args) {
		
		CheckBox checkbox=new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkBoxMethod();
	}

}
