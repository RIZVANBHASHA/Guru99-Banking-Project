package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class SM8_MiniStatement implements AutoConstatnt {

	@FindBy(linkText = "Mini Statement")
	protected WebElement miniStatementButton;
	
	@FindBy(name = "accountno")
	protected WebElement accountNoTextfield;
	
	@FindBy(name = "AccSubmit")
	protected WebElement submitButton;
	
	@FindBy(name = "res")
	protected WebElement resetButton;
	
	public SM8_MiniStatement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void generateMiniStatement() throws IOException
	{
		miniStatementButton.click();
		accountNoTextfield.sendKeys(ExcellLibrary.getCellValue(excel_path, "Manager", 34, 1));
		submitButton.click();
	}
}
