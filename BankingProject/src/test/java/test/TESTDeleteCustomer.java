package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM11_DeleteCustomer;

public class TESTDeleteCustomer extends BaseTest{

	@Test
	public void delete() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM11_DeleteCustomer delete = new SM11_DeleteCustomer(driver);
		delete.deleteCustomer();
		
		String actual = "Do you really want to delete this Customer?";
		String expected = driver.switchTo().alert().getText();
		Assert.assertEquals(actual, expected);
	}
}
