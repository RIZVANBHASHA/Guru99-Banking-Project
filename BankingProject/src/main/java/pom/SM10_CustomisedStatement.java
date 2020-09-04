package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class SM10_CustomisedStatement implements AutoConstatnt {

	@FindBy(linkText = "Customised Statement")
	protected WebElement customisedStatementButton;
	
	@FindBy(name = "fdate")
	protected WebElement fromDateTextfield;
	
	@FindBy(name = "tdate")
	protected WebElement toDateTextfield;
	
	
	@FindBy(name = "amountlowerlimit")
	protected WebElement minimumTransactionTextfield;
	
	@FindBy(name = "numtransaction")
	protected WebElement numberOfTransactionTextfield;
	
	@FindBy(name = "accountno")
	protected WebElement accountNoTextfield;
	
	@FindBy(name = "AccSubmit")
	protected WebElement submitButton;
	
	@FindBy(name = "res")
	protected WebElement resetButton;
	
	public SM10_CustomisedStatement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void generateCustomisedStatement() throws IOException
	{
		customisedStatementButton.click();
		accountNoTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 42, 1));
		fromDateTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 42, 2));
		toDateTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 42, 3));
		minimumTransactionTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 42, 4));
		numberOfTransactionTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 42, 5));
		submitButton.click();
	}
}
