package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstatnt {

	
	public void openChromeBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void openFirefoxBrowser()
	{
		System.setProperty(gecko_key, gecko_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}

	public void openIEBrowser()
	{
		System.setProperty(ie_key, ie_value);
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	
	@AfterMethod
	public void closeApp() {
		//driver.quit();
	}

}