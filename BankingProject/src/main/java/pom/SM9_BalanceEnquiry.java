package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class SM9_BalanceEnquiry implements AutoConstatnt{

	@FindBy(linkText = "Balance Enquiry")
	protected WebElement balanceEnquiryButton;
	
	@FindBy(name = "accountno")
	protected WebElement accountNoTextfield;
	
	@FindBy(name = "AccSubmit")
	protected WebElement submitButton;
	
	@FindBy(name = "res")
	protected WebElement resetButton;
	
	public SM9_BalanceEnquiry(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void balanceEnquiry() throws IOException
	{
		balanceEnquiryButton.click();
		accountNoTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 38, 1));
		submitButton.click();
	}
}
