package assignmentselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class EdgeBase {

	public WebDriver driver;
	
	public void initializeBrowser() {
		driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/");
	}
	public void quitBrowser()
	{
		driver.close();
	}
	public static void main(String[] args) {
		EdgeBase obj=new EdgeBase();
		obj.initializeBrowser();

	}

}
