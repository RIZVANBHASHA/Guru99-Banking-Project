package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM12_DeleteCustomer;

public class TESTSM12_DeleteCustomer extends BaseTest {

	@Test
	public void deletetest() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM12_DeleteCustomer delete = new SM12_DeleteCustomer(driver);
		delete.deleteCustomer();
		
		driver.switchTo().alert().accept();
		String actual = "Customer could not be deleted!!. First delete all accounts of this customer then delete the customer";
		String expected = driver.switchTo().alert().getText();
		Assert.assertEquals(actual, expected);
		
	}
	
}
