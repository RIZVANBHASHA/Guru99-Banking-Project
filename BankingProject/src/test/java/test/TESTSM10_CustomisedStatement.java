package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM10_CustomisedStatement;

public class TESTSM10_CustomisedStatement extends BaseTest {

	@Test
	public void customstmt() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM10_CustomisedStatement custom = new SM10_CustomisedStatement(driver);
		custom.generateCustomisedStatement();
		
		String actual = "Account does not exist";
		String expected = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, expected);
		
		String actual_title = "Guru99 Bank Statement Page";
		String expected_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
	}
}
