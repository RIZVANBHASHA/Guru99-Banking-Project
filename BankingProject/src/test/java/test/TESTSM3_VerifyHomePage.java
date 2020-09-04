package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;

public class TESTSM3_VerifyHomePage extends BaseTest {

	@Test
	public void verifyHomePage() throws IOException
	{
		String actual_HomePageTitle = "Guru99 Bank Manager HomePage";
		Login log = new Login(driver);
		log.loginMethod();
		String expected_HomePageTitle=driver.getTitle();
		Assert.assertEquals(actual_HomePageTitle, expected_HomePageTitle);
	}
}
