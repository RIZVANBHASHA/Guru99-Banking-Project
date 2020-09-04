package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class SM11_DeleteCustomer implements AutoConstatnt {

	@FindBy(linkText = "Delete Customer")
	protected WebElement deleteCustomerButton;
	
	@FindBy(name = "cusid")
	protected WebElement customeridTextfield;
	
	@FindBy(name = "AccSubmit")
	protected WebElement submitButton;
	
	@FindBy(name = "res")
	protected WebElement resetButton;
	
	public SM11_DeleteCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void deleteCustomer() throws IOException
	{
		deleteCustomerButton.click();
		customeridTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 46, 1));
		submitButton.click();
	}
}
