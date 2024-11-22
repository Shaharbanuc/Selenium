package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	public WebDriver driver;
	public void initializeBrowser() {
		
		driver=new ChromeDriver();//browser intialization or loading the chrome driver
		driver.get("https://selenium.qabible.in/");//launching the url
		//If the element is found before the timeout, the remaining time is ignored.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//to maximize window
	}
	public void driverQuitAndClose()
	{
		//driver.close();//only parent window will get closed
		//parent window and all associated windows will get closed by quit
		driver.quit();
	}
	public static void main(String[] args) {
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuitAndClose();

	}

}
