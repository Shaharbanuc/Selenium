package testscript;

public class BrowserCommands extends Base{
	
	public void browserCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//page source code 
		String page=driver.getPageSource();
		System.out.println(page);
	}

	public static void main(String[] args) {
		
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.browserCommands();
		browsercommands.driverQuitAndClose();
	}

}
