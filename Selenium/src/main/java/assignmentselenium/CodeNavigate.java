package assignmentselenium;

public class CodeNavigate extends EdgeBase{
	public void commandCode()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	}

	public static void main(String[] args) {
		 
		CodeNavigate obj=new CodeNavigate();
		obj.initializeBrowser();
		obj.commandCode();
		obj.quitBrowser();

	}

}
