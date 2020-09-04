package pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import generics.ExcellLibrary;

public class SM7_DeleteAccount extends SM6_DeleteAccount{

	public SM7_DeleteAccount(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void deleteAccount() throws IOException
	{
		deleteAccountButton.click();
		accNoTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 30, 1));
		submitButton.click();
	}
}
