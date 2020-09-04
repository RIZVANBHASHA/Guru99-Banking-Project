package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class SM1_ChangePassword implements AutoConstatnt{

	@FindBy(linkText  = "Change Password")
	private WebElement changePasswordButton;
	
	@FindBy(name = "oldpassword")
	private WebElement oldpasswordTextfield;
	
	@FindBy(name = "newpassword")
	private WebElement newpasswordTextfield;
	
	@FindBy(name = "confirmpassword")
	private WebElement confirmpasswordTextfield;
	
	@FindBy(name = "sub")
	private WebElement submitButton;
	
	@FindBy(name = "res")
	private WebElement resetButton;
	
	public SM1_ChangePassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void changePasswordMethod() throws IOException  
	{
		changePasswordButton.click();
		oldpasswordTextfield.clear();
		oldpasswordTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 2, 1));
		newpasswordTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path,"Manager", 2, 2));
		confirmpasswordTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 2, 3));
		submitButton.click();
	}
		
}
