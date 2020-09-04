package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Login;
import pom.POMEditCustomer;

public class TESTEditCustomer {

	WebDriver driver;
	@BeforeTest
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:/selenium/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		Login log = new Login(driver);
		log.loginMethod();
	}
	
	@Test(groups = "smoke")
	public void testeditCustomer()
	{
		POMEditCustomer customer = new POMEditCustomer(driver);
		//customer.editCustomerMethod("50370");
		//customer.changeMobileNo("9113286755");
		//customer.submit();
		customer.deleteCustomer(driver,"79582");
		
	}
	
}
