package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser() {
		
		driver=new ChromeDriver();//browser intialization or loading the chrome driver
		driver.get("https://selenium.qabible.in/");//launching the url
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
