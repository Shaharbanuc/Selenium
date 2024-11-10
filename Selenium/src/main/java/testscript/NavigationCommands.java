package testscript;

public class NavigationCommands extends Base {
	
	public void commands()
	{
	//driver.navigate().to("https://www.amazon.ae/");
		driver.navigate().to("https://www.amazon.in/");//it will navigate from obsqura page to amazon page
		driver.navigate().back();//going back to obsqura
		driver.navigate().forward();//again to amazon
		driver.navigate().refresh();//refreshing opened page,amazon
	
	}

	public static void main(String[] args) {
		
		NavigationCommands navigationcommands=new NavigationCommands();
		
		navigationcommands.initializeBrowser();
		navigationcommands.commands();
		navigationcommands.driverQuitAndClose();

	}

}
