package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM4_AddNewCustomer;

public class TESTSM4_AddNewCustomer extends BaseTest{

	@Test
	public void addCustomer() throws IOException
	{
		String expected = "Customer Registered Successfully!!!";
		Login log = new Login(driver);
		log.loginMethod();
		SM4_AddNewCustomer add = new SM4_AddNewCustomer(driver);
		add.addNewCustomer();
		WebElement details_of_customer=driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']"));
		String actual=details_of_customer.getText();
		Assert.assertEquals(actual, expected);
		
	}
	
	@AfterTest
	public void storeCustomerId() throws IOException
	{
		String cust_id=driver.findElement(By.xpath("(//td[.='Customer ID']/../td)[2]")).getText();
		System.out.println("Created customer Id: "+cust_id);
		
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Manager").getRow(14).createCell(2).setCellValue(cust_id);
		wb.getSheet("Manager").getRow(20).createCell(1).setCellValue(cust_id);
		FileOutputStream fos = new FileOutputStream(excel_path);
		wb.write(fos);
	}
}
