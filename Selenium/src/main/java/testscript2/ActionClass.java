package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class ActionClass extends Base{
	
public void doubleClick()
{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		//in website under others tab
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		//WebElement dropped=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(drag1).build().perform();
}
public void mouseHover()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(drag1).build().perform();
}
public void dragAndDrop()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement dropped=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions actions=new Actions(driver);
	//dragAndDrop(webelement source, webelement target)
	actions.dragAndDrop(drag1, dropped).build().perform();
}
//right click is contextclick
public void rightClick()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions=new Actions(driver);
	actions.contextClick(drag1).build().perform();	
}
	public static void main(String[] args) {
		
		ActionClass actionclass=new ActionClass();
		actionclass.initializeBrowser();
		//actionclass.doubleClick();
		//actionclass.mouseHover();
		//actionclass.dragAndDrop();
		actionclass.rightClick();
	}

}
