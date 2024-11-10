package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;
//program to automate single select dropdown
public class DropDown extends Base{
	
	public void index()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		// Locate the dropdown element
		WebElement ddown=driver.findElement(By.cssSelector("select#single-input-field"));
		// Create a Select object
		Select selectclass=new Select(ddown);
		// Select an option by index
		selectclass.selectByIndex(1);
		
	}
	public void value()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement ddown1=driver.findElement(By.cssSelector("select#single-input-field"));
		Select selectclass=new Select(ddown1);
		 // Select an option by attribute value
		selectclass.selectByValue("Yellow");
	}
	
	public void visibleText()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement ddown2=driver.findElement(By.cssSelector("select#single-input-field"));
		Select selectclass=new Select(ddown2);
		// Select an option by visible text
		selectclass.selectByVisibleText("Green");
	}
	
	public static void main(String[] args) {
		
		DropDown dropdown=new DropDown();
		dropdown.initializeBrowser();
		//dropdown.index();
		//dropdown.value();
		//dropdown.visibleText();
	}

}
