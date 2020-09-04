package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.ExcellLibrary;

public class SM12_DeleteCustomer extends SM11_DeleteCustomer {

	
	public SM12_DeleteCustomer(WebDriver driver)
	{
		super(driver);
	}
	
	public void deleteCustomer() throws IOException
	{
		deleteCustomerButton.click();
		customeridTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 50, 1));
		submitButton.click();
	}
}
