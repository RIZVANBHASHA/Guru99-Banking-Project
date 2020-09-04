package pom;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class POMCreateNewCustomer implements AutoConstatnt {

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
	
	public POMCreateNewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCustomerMethod(WebDriver driver, String name, String gender, String dob, String address,
									 String city, String state, String pincode, 
									 String mobileNo, String emailId, String password) throws InterruptedException 
	{
		newCustomerButton.click();
		customerNameTextField.clear();
		customerNameTextField.sendKeys(name);
		if(gender.equals("male"))
			maleRadioButton.click();
		else
			femaleRadioButton.click();
		
		//dobTextField.click();
		//dobTextField.sendKeys(Keys.ARROW_LEFT);
		dobTextField.sendKeys(dob);
		addressTextField.clear();
		addressTextField.sendKeys(address);
		cityTextField.clear();
		cityTextField.sendKeys(city);
		stateTextField.clear();
		stateTextField.sendKeys(state);
		pincodeTextField.clear();
		pincodeTextField.sendKeys(pincode);
		phoneNOTextField.clear();
		phoneNOTextField.sendKeys(mobileNo);
		emailTextField.clear();
		emailTextField.sendKeys(emailId);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		submitButton.click();
		
	}
	
	public void createCustomer() throws IOException
	{
		newCustomerButton.click();
		customerNameTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 0));
		String gender = ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 1);
		if(gender.equals("male"))
			maleRadioButton.click();
		else
			femaleRadioButton.click();
		dobTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 2));
		addressTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 3));
		cityTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 4));
		stateTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 5));
		pincodeTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 6));
		phoneNOTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 7));
		emailTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 8));
		passwordTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 5, 9));
		submitButton.click();
	}
	
	public void screenShots(WebDriver driver) throws IOException 
	{
		 LocalDateTime dateTime = LocalDateTime.now();
		 TakesScreenshot shot = ((TakesScreenshot) driver);
		 File srcfile = shot.getScreenshotAs(OutputType.FILE); 
		 File destfile = new File("./errorshots/"+dateTime+".png");
		 FileUtils.copyFile(srcfile,destfile);	 
	}
	
}
