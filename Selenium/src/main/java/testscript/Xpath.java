package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	//if general locators are not available then use xpath locator
	public void xpathLocator()
	{
		// //tagname[@attribute='value'] double slash represent current node(inspecting web element)
		//@represnets attribute
		WebElement elem1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement elem2=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement elem3=driver.findElement(By.xpath("//input[@id='value-b']"));
			
	}
	public void contains()// //tag[contains(@attribute,'value')]
	{
		WebElement elem4=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		WebElement elem5=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		//inspect Total A+B,messgae-two is the text ,we can use 'two' or 'message' but with no duplicate in dom
		WebElement totalelem=driver.findElement(By.xpath("//div[contains(@id,'two')]"));
	}
	
	public void startsWith()// //tag[starts-with(@attribute,'value')]
	{
		WebElement elem6=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
		WebElement elem7=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		//inspect Total A+B,messgae-two is the text ,we will just use the starting chars with no duplicates
		WebElement elem8=driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
		
	}
	public void text()// //tag[text()='text']
	{
		WebElement elem9=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement elem10=driver.findElement(By.xpath("//button[text()='Get Total']"));	
		//WebElement elem11=driver.findElement(By.xpath("//div[text()='Your Message :']"));
	}
	
	public void and()//tag[@attribute1='value' and @attribute2='value']
	{
		WebElement element1=driver.findElement(By.xpath("//input[@id='value-a' and @type='text']"));
		
		WebElement element2=driver.findElement(By.xpath("//input[@id='value-a' and @placeholder='Enter Value']"));
	}
	public void or()//tag[@attribute1='value' or @attribute2='value']
	{
		//dom will display more than one value ,check the id befor taking the value
		WebElement element3=driver.findElement(By.xpath("//input[@id='value-a' or @placeholder='Enter Value']"));
		WebElement element4=driver.findElement(By.xpath("//input[@id='value-a' or @type='text']"));
	}

	public static void main(String[] args) {
		
		Xpath xpath=new Xpath();
		xpath.initializeBrowser();
		xpath.xpathLocator();
		xpath.driverQuitAndClose();

	}

}
