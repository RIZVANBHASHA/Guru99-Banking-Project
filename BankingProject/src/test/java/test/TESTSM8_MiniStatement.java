package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM8_MiniStatement;

public class TESTSM8_MiniStatement extends BaseTest {

	@Test
	public void miniStatement() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM8_MiniStatement mini = new SM8_MiniStatement(driver);
		mini.generateMiniStatement();
		
		String actual = "Account does not exist";
		String expected = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, expected);
	}
}
