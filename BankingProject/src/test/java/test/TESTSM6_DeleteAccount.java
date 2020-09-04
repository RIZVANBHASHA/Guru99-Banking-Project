package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM6_DeleteAccount;

public class TESTSM6_DeleteAccount extends BaseTest {

	@Test
	public void deleteAcc() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM6_DeleteAccount delete = new SM6_DeleteAccount(driver);
		delete.deleteAccount();
		
		String actual = "Do you really want to delete this Account?";
		String expected=driver.switchTo().alert().getText();
		Assert.assertEquals(actual, expected);
	}
}
