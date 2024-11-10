package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class radioButton extends Base{
	public void radioButton()
	{
		//click,
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		//argument passed in xpath locator is Female radio button
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//automate female radiobutton click
		radio1.click();
		
		WebElement showselectedvalue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showselectedvalue.click();	
	}
	public void isSelected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radio1.click();
		Boolean flag=radio1.isSelected();
		System.out.println(flag);
	}
	public void checkSelect()
	{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	Boolean flag=radio1.isSelected();
	System.out.println(flag);
			if(flag)
			{
				System.out.println("Radio button female is selected already");
			}
			else
			{
				radio1.click();
				System.out.println("Radio button female is now clicked");
			}
		
	}
	public void isDisplayed()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		Boolean flag=radio1.isDisplayed();
				//simply write if (flag), which implicitly checks if flag is true.
				if(flag)
				{
					System.out.println("Radio button female is displayed");
				}
				else
				{
					System.out.println("Radio button female is not displayed on page");
				}
	}
	public void isEnabled()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		Boolean flag=radio1.isEnabled();
				if(flag)
				{
					System.out.println("Radio button female is enabled");
				}
				else
				{
					System.out.println("Radio button female is not enabled");
				}
	}

	public static void main(String[] args) {
		
		radioButton radiobutton=new radioButton();
		radiobutton.initializeBrowser();
		radiobutton.radioButton();
		//radiobutton.isSelected();
		//radiobutton.checkSelect();
		//radiobutton.isDisplayed();
		//radiobutton.isEnabled();
		//radiobutton.driverQuitAndClose();
	}

}
