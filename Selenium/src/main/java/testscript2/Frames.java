package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Frames extends Base{
	
	public void frameMethod()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		//first we need to inspect iframe and switch to iframe then only inspect the ad.image or whatever
		WebElement ad=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		ad.click();
	}
	
	//play the video which is in iframe
	public void frameVideo()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe2=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
		driver.switchTo().frame(iframe2);
		WebElement video=driver.findElement(By.xpath("//a[text()='Automation Testing Tutorial for Beginners']"));
		video.click();
	}

	public static void main(String[] args) {
		
		Frames frames=new Frames();
		frames.initializeBrowser();
		frames.frameMethod();
		//frames.frameVideo();
		

	}

}
