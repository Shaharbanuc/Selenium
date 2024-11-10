package testscript2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base{
	
	public void printTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void printRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//to print 1st row of table locate it using id and tbody and tr
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(row.getText());
	}
	
	public void printCell()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		////to print 1st cell of 1st row of table locate table using id and then tbody/tr[index]/td[index]
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		System.out.println(cell.getText());
		
	}
	public void assignmentMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//to print 4th row of table
		WebElement row4=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(row4.getText());
		//to print 3rd cell of 5th row
		WebElement cellva=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]/td[3]"));
		System.out.println(cellva.getText());
		
	}
	public void printHead()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//to print header of table
		WebElement head=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]"));
		System.out.println(head.getText());
	}
	public void printColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//List<String> L1=new ArrayList<String>();L1 contains string data ,eg:place
		//findelements() return list of webelements
		List<WebElement> column1=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		//for(String place :L1) using sysout place can be printed
		//int index=0;
		for(WebElement cell: column1)
		{
			System.out.println(cell.getText());
		}
	}
	//compare a cell value in column 1 with a string Ashton Cox and print the value if it is matched
	public void compareColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column1=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		String str2="Ashton Cox";
		int i=0;
		for(WebElement cell: column1)
		{
			//System.out.println();
			i=i+1;
			String str=cell.getText();
			//instead of str in if cell.getText() can be used
			if(str2.equals(str))
			{
				System.out.println("got same string "+str2+" in cell "+i+" ie "+str);
			}
			
		}
	}
	
	public void printColumnTwo()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//findelement will print only the cell value at td1
		WebElement column=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		System.out.println(column.getText());
	}

	public static void main(String[] args) {
		TableHandling table=new TableHandling();
		table.initializeBrowser();
		//table.printTable();
		//table.printRow();
		//table.printCell();
		//table.assignmentMethod();
		//table.printHead();
		//table.printColumn();
		table.compareColumn();

	}

}
