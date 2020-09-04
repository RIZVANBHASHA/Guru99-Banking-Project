package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;

public class TESTPOMLogin extends BaseTest
{

	@Test
	public void login() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
	}
}
