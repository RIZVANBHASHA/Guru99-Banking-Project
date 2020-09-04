package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM9_BalanceEnquiry;

public class TESTSM9_BalanceEnquiry extends BaseTest{

	@Test
	public void balance() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM9_BalanceEnquiry bal = new SM9_BalanceEnquiry(driver);
		bal.balanceEnquiry();
		
		String actual = "Account does not exist";
		String expected = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, expected);
		
		String actual_title = "Guru99 Bank Balance Enquiry Page";
		String expected_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
	}
}
