package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base{
	
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		button.click();
		//gettext should always write before accept or dismiss
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		//alertbox elements are not an html element so we need to switch from html to alert
		driver.switchTo().alert().accept();	
	}
	
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button1=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button1.click();
		//must call accept() after sendKeys
		driver.switchTo().alert().sendKeys("hi world");
		String text3=driver.switchTo().alert().getText();
		System.out.println(text3);
		driver.switchTo().alert().accept();//you pressed ok message will be displayed
		//driver.switchTo().alert().dismiss();//to cancel the pop-up
		
	}
	
	public void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		button2.click();
		String text2=driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().accept();//You pressed ok !
		//driver.switchTo().alert().dismiss();//You pressed Cancel!
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.initializeBrowser();
		//alerthandling.simpleAlert();
	//alerthandling.confirmationAlert();
		alerthandling.promptAlert();
		

	}

}
