package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	//these are basic locators,findelement is a method() and By. is a class
	public void id()
	{
		//webelement elementname=driver.findEelement(By.locator("locatorvalue"));
		WebElement element1= driver.findElement(By.id("single-input-field"));
		element1.sendKeys("hello world");
		WebElement showmessage= driver.findElement(By.id("button-one"));
		showmessage.click();
		
	}
	public void className()
	{
		WebElement cname1=driver.findElement(By.className("form-control datepicker"));
		WebElement cname2=driver.findElement(By.className("mb-sec"));
		WebElement cname3=driver.findElement(By.className("clearfix"));
		
	}
	public void name()
	{
		//name="viewport"
		WebElement name1=driver.findElement(By.name("viewport"));
		WebElement name2=driver.findElement(By.name("description"));
		WebElement name3=driver.findElement(By.name("keywords"));
	}
	public void linkText()
	{
		//inspect a link ,copy the text
		WebElement link1=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement link2=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement link3=driver.findElement(By.linkText("Select Input"));
		
	}
	public void partiaLinkText()
	{
		//if the text name of a link is too large use partialLinkText ,duplicate value should be avoided 
		WebElement partial1=driver.findElement(By.partialLinkText("Simple F"));
		WebElement partial2=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partial3=driver.findElement(By.partialLinkText("Select I"));
		
	}
	public void example()
	{
		WebElement entervaluea=driver.findElement(By.id("value-a"));
		entervaluea.sendKeys("100");
		WebElement entervalueb=driver.findElement(By.id("value-b"));
		entervalueb.sendKeys("200");
		WebElement gettotal=driver.findElement(By.id("button-two"));
		gettotal.click();
		//click page "select input"
		WebElement twocolor=driver.findElement(By.id("multi-select-field"));
		twocolor.sendKeys("White");
		WebElement getfirst=driver.findElement(By.id("button-first"));
		getfirst.click();
		
	}

	public static void main(String[] args) {
		
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.id();
		locators.driverQuitAndClose();
	}

}
