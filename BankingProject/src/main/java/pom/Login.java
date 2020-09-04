package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstatnt;
import generics.ExcellLibrary;

public class Login implements AutoConstatnt{

	@FindBy(name = "uid")
	private WebElement usernameTextField;
	
	@FindBy(name = "password")
	private WebElement passwordTextField;
	
	@FindBy(name = "btnLogin")
	private WebElement loginButton;
	
	@FindBy(name = "btnReset")
	private WebElement resetButton;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutButton;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextField.clear();
		usernameTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 1, 0));
		passwordTextField.clear();
		passwordTextField.sendKeys(ExcellLibrary.getCellValue(excel_path, sheet_name, 1, 1));
		loginButton.click();
	}
	
	public void logoutMethod()
	{
		logoutButton.click();
	}
	
	public void resetMethod()
	{
		resetButton.click();
	}
}
