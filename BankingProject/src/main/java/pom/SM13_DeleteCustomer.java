package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import generics.ExcellLibrary;

public class SM13_DeleteCustomer extends SM11_DeleteCustomer {

	public SM13_DeleteCustomer(WebDriver driver) {
		super(driver);
	}
	public void deleteCustomer() throws IOException
	{
		deleteCustomerButton.click();
		customeridTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 54, 1));
		submitButton.click();
	}

}
