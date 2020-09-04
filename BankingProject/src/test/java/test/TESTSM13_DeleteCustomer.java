package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM13_DeleteCustomer;

public class TESTSM13_DeleteCustomer extends BaseTest {

	@Test
	public void delete() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM13_DeleteCustomer delete = new SM13_DeleteCustomer(driver);
		delete.deleteCustomer();
		
		driver.switchTo().alert().accept();
		String actual="customer deleted successfully";
		String expected = driver.switchTo().alert().getText();
		Assert.assertEquals(actual, expected);
		
	}
}