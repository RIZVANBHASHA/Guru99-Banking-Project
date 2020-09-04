package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Login;
import pom.SM5_CreateNewAccount;

public class TESTSM5_CreateNewAccount extends BaseTest{

	
	@Test
	public void createAccount() throws IOException
	{
		Login log = new Login(driver);
		log.loginMethod();
		
		SM5_CreateNewAccount account = new SM5_CreateNewAccount(driver);
		account.createNewAccount();
		
		String expected = "Account Generated Successfully!!!";
		String actual=driver.findElement(By.xpath("//p[.='Account Generated Successfully!!!']")).getText();
		Assert.assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void getAccountId() throws IOException
	{
		String acc_no=driver.findElement(By.xpath("(//td[.='Account ID']/..//td)[2]")).getText();
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Manager").createRow(22).createCell(1).setCellValue(acc_no);
		wb.getSheet("Manager").createRow(30).createCell(1).setCellValue(acc_no);
		FileOutputStream fos = new FileOutputStream(excel_path);
		wb.write(fos);
	}
}
