package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleWindowHandling extends Base{
	
	public void multipleWindowHandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		//getWindowHandle()return handle of only parent ie main page
		String parent=driver.getWindowHandle();
		System.out.println("parent is "+parent);
		System.out.println("parent's title is "+driver.getTitle());
		System.out.println("______________________________________");
		//getWindowHandles() return handles of all pages including  main page,contactus and loginpage.
		//set unordered collection of unique elementse
		Set<String> allwindows=driver.getWindowHandles();
		for(String temp:allwindows)
		{
			System.out.println("windows is "+temp);
			//switch to windows is important window(String nameOrHandle)
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("************************************");
			//driver.switchTo().window(temp).close();
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling multiplewindow=new MultipleWindowHandling();
		multiplewindow.initializeBrowser();
		multiplewindow.multipleWindowHandling();
	}

}
