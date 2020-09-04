package test;




import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseTest;
import pom.Login;
import pom.SM1_ChangePassword;

public class TESTSM1_ChangePassword extends BaseTest {
	@Test
	public void changePassword() throws IOException {
		String actual = "Old Password is incorrect";
		Login log = new Login(driver);
		log.loginMethod();
		SM1_ChangePassword change = new SM1_ChangePassword(driver);
		change.changePasswordMethod();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(expected);
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		System.out.println("Test case passed");
		s.assertAll();
		}

	
}
