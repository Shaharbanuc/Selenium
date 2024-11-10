package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class DemoSite extends Base {
	
	
	public void demo()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement elem1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		elem1.sendKeys("shanu");
		WebElement elem2=driver.findElement(By.xpath("//button[@id='button-one']"));
		elem2.click();
		
	}
	public void getTotal()
	{
		//css selector tag#Id
		WebElement a=driver.findElement(By.cssSelector("input#value-a"));
		a.sendKeys("100");
		WebElement b=driver.findElement(By.xpath("//input[@id='value-b']"));//xpath
		b.sendKeys("200");
		WebElement gettotal=driver.findElement(By.id("button-two"));//locator id
		gettotal.click();
	}

	public static void main(String[] args) {
		
		DemoSite demosite=new DemoSite();
		demosite.initializeBrowser();
		demosite.demo();
		demosite.getTotal();
		demosite.driverQuitAndClose();	

	}

}
