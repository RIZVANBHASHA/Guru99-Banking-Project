package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.Login;
import pom.POMCreateNewCustomer;

public class TESTCreateNewCustomer {

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
	
	@Test(groups ="functional")
	public void createCustomer() throws IOException, InterruptedException
	{
		POMCreateNewCustomer customer = new POMCreateNewCustomer(driver);
		customer.createCustomerMethod(driver,"Virendra","male","04112013","Jamnagar","Jamnagar","Gujarat","567321","800439024","narendrabahu@gmail.com","narendra@123");
		
	}
}
