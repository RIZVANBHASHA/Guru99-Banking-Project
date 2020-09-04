package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.BasePage;
import generics.ExcellLibrary;

public class SM5_CreateNewAccount implements AutoConstatnt{

	@FindBy(linkText = "New Account")
	private WebElement addNewAccountButton;
	
	@FindBy(name = "cusid")
	private WebElement customerIdTextfield;
	
	@FindBy(name = "selaccount")
	private WebElement accountTypeDropdown;
	
	@FindBy(name = "inideposit")
	private WebElement depositTextField;
	
	@FindBy(name = "button2")
	private WebElement submitButton;
	
	@FindBy(name = "reset")
	private WebElement resetButton;
	
	
	public SM5_CreateNewAccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void createNewAccount() throws IOException
	{
		addNewAccountButton.click();
		customerIdTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 14, 2));
		String acc_type = ExcellLibrary.getCellValue(excel_path, "Manager", 20, 2);
		BasePage.selectByValue(accountTypeDropdown, acc_type);
		depositTextField.sendKeys("5000");
		submitButton.click();
	}
}
