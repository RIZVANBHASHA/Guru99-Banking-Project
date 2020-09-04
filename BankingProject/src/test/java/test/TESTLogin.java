package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Login;

public class TESTLogin {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test(groups = "smoke")
	public void testLogin() throws IOException
	{
		
		Login log = new Login(driver);
		log.loginMethod();
	}
	
	@AfterTest
	public void testLogout()
	{
		Login log = new Login(driver);
		log.logoutMethod();
	}
}
