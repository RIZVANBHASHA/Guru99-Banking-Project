package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.POMCreateNewCustomer;

public class TESTPOMCreateNewCustomer extends BaseTest{

	
	@Test
	public void createNewCustomer() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		POMCreateNewCustomer customer = new POMCreateNewCustomer(driver);
		customer.createCustomer();
	}
	
}
