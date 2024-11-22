package assignmentselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDownTesting extends Base{
	public void multiSelect()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement multi=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectmulti=new Select(multi);
		// Select an option
		selectmulti.selectByIndex(0);
		selectmulti.selectByIndex(2);
		//true if the dropdown is multselect
		System.out.println(selectmulti.isMultiple());
		List<WebElement> selectedOptions = selectmulti.getAllSelectedOptions();
		System.out.println("Selected options:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        //this will pirint only the value in index 2
		WebElement getallselected=driver.findElement(By.id("button-all"));
		getallselected.click();	
	}
	
	public void rowAsList()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//to print 1st row of table
		List<WebElement> row1=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		//we can not directly print row1 coz it is list of web elements,so call getText
		for (WebElement row : row1) {
            System.out.println(row.getText());
		}
	}
	
	public void rowColumnCell()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//to get all rows of table
		List<WebElement> allrow=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr"));
		//we cant directly print row1 coz it is list of web elements,so need to call getText
		for (WebElement row : allrow) {
            // get all rows as list first using tr,
			//Get all cells in the current row
           // List<WebElement> cells = row.findElements(By.tagName("td"));
            // Print each cell's text
           // for (WebElement cell : cells) {
                System.out.println(row.getText());
            //}
         // Move to the next line after each row
            //System.out.println("_");
		}
	}
	
	public static void main(String[] args) {
		DropDownTesting test=new DropDownTesting();
		test.initializeBrowser();
		//test.multiSelect();	
		//test.rowAsList();
		test.rowColumnCell();
	}

}
