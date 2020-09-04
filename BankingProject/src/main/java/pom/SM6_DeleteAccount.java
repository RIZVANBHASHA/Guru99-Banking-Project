package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class SM6_DeleteAccount implements AutoConstatnt {

	@FindBy(linkText = "Delete Account")
	protected WebElement deleteAccountButton;
	
	@FindBy(name = "accountno")
	protected WebElement accNoTextfield;

	@FindBy(name = "AccSubmit")
	protected WebElement submitButton;
	
	@FindBy(name = "res")
	protected WebElement resetButton;
	
	public SM6_DeleteAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void deleteAccount() throws IOException
	{
		deleteAccountButton.click();
		accNoTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 26, 1));
		submitButton.click();
	}
}
