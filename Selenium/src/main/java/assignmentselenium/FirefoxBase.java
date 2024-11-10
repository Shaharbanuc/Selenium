package assignmentselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBase {
	public WebDriver driver;
	public void initializeBrowser()
	{
		driver=new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
	}

	public static void main(String[] args) {
		
		FirefoxBase firefox=new FirefoxBase();
		
		firefox.initializeBrowser();
	}

}
