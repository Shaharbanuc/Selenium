package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{
	
	public void tagAndId()
	{
		//css="tag#id"
		WebElement tagid1=driver.findElement(By.cssSelector("button#button-one"));
		WebElement tagid2=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagid3=driver.findElement(By.cssSelector("input#value-a"));
		WebElement tagid4=driver.findElement(By.cssSelector("input#value-b"));
		WebElement tagid5=driver.findElement(By.cssSelector("button#button-two"));	
		
	}
	public void tagAndClass()
	{
		//"tag.class"
		WebElement class1=driver.findElement(By.cssSelector("div.header-top"));	
		WebElement class2=driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement class3=driver.findElement(By.cssSelector("div.top-logo"));
		}
	public void tagAndAttribute()//"tag[attribute='value']"
	//first preference is given to id=value
	{
		WebElement attri1=driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement attri2=driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement attri3=driver.findElement(By.cssSelector("input[id='value-a']"));
				
	}
	public void tagClassAndAttribute()//"tag.classname[attribute='value']"
	{
		WebElement classattri1=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
		WebElement classattri2=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement classattri3=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));	
	}

	public static void main(String[] args) {
		
		CssSelector selector=new CssSelector();
		
		selector.initializeBrowser();
		selector.tagAndId();
		selector.driverQuitAndClose();

	}

}
