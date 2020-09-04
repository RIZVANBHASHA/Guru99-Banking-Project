package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class SM4_AddNewCustomer implements AutoConstatnt{

	@FindBy(linkText = "New Customer")
	private WebElement newCustomerButton;
	
	@FindBy(name = "name")
	private WebElement customerNameTextField;
	
	@FindBy(xpath = "//input[@value='m']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath = "//input[@value='f']")
	private WebElement femaleRadioButton;
	
	@FindBy(name = "addr")
	private WebElement addressTextField;
	
	@FindBy(name = "dob")
	private WebElement dobTextField;
	
	@FindBy(name = "city")
	private WebElement cityTextField;
	
	@FindBy(name = "state")
	private WebElement stateTextField;
	
	@FindBy(name = "pinno")
	private WebElement pincodeTextField;
	
	@FindBy(name = "telephoneno")
	private WebElement phoneNOTextField;
	
	@FindBy(name = "emailid")
	private WebElement emailTextField;

	@FindBy(name = "password")
	private WebElement passwordTextField;
	
	@FindBy(name = "sub")
	private WebElement submitButton;

	@FindBy(name = "res")
	private WebElement resetButton;
	
	
	public SM4_AddNewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void addNewCustomer() throws IOException
	{
		newCustomerButton.click();
		customerNameTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 1));
		String gender = ExcellLibrary.getCellValue(excel_path, "Manager", 13, 2);
		if(gender.equals("male"))
			maleRadioButton.click();
		else
			femaleRadioButton.click();
		dobTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 3));
		addressTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 4));
		cityTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 5));
		stateTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 6));
		pincodeTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 7));
		phoneNOTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 8));
		emailTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 9));
		passwordTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 13, 10));
		submitButton.click();
	}
}
