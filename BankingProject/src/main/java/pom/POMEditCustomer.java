package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMEditCustomer {

	@FindBy(linkText = "Edit Customer")
	private WebElement editCustomerButton;
	
	@FindBy(name = "cusid")
	private WebElement customerIdTextField;
	
	@FindBy(name = "AccSubmit")
	private WebElement accountSubmitButton;
	
	@FindBy(name = "res")
	private WebElement accountResetButton;
	
	@FindBy(name = "addr")
	private WebElement addressTextField;
	
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
	
	@FindBy(name = "sub")
	private WebElement submitButton;

	@FindBy(name = "res")
	private WebElement resetButton;
	
	@FindBy(linkText = "Delete Customer")
	private WebElement deleteCustomerButton;
	
	public POMEditCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void editCustomerMethod(String custId)
	{
		editCustomerButton.click();
		customerIdTextField.clear();
		customerIdTextField.sendKeys(custId);
		accountSubmitButton.click();
		
	}

	public void changeAddress(String address)
	{
		addressTextField.clear();
		addressTextField.sendKeys(address);
	}
	
	public void changeCity(String city)
	{
		cityTextField.clear();
		cityTextField.sendKeys(city);
	}
	
	public void changeState(String state)
	{
		stateTextField.clear();
		stateTextField.sendKeys(state);
	}
	
	public void changePincode(String pincode)
	{
		pincodeTextField.clear();
		pincodeTextField.sendKeys(pincode);
	}
	
	public void changeMobileNo(String phoneNo) 
	{
		phoneNOTextField.clear();
		phoneNOTextField.sendKeys(phoneNo);
	}
	public void changeEmailId(String emailId)
	{
		emailTextField.clear();
		emailTextField.sendKeys(emailId);
	}
	
	public void submit()
	{
		submitButton.click();
	}
	
	public void deleteCustomer(WebDriver driver,String custId)
	{
		deleteCustomerButton.click();
		customerIdTextField.sendKeys(custId);
		accountSubmitButton.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}
}
