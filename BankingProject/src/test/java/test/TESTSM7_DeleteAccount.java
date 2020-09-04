package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM7_DeleteAccount;

public class TESTSM7_DeleteAccount extends BaseTest {

	@Test
	public void deleteAcc() throws IOException, InterruptedException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM7_DeleteAccount delete = new SM7_DeleteAccount(driver);
		delete.deleteAccount();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		String actual = "Account Deleted Sucessfully";
		String expected = driver.switchTo().alert().getText();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, expected);
		
		String actual_title = "Guru99 Bank Manager HomePage";
		String expected_title=driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
	}
}
