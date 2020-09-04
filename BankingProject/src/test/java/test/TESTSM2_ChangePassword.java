package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseTest;
import generics.ExcellLibrary;
import pom.Login;
import pom.SM2_ChangePassword;

public class TESTSM2_ChangePassword extends BaseTest{

	@Test
	public void changePassword() throws IOException, InterruptedException {
		String actual_popup = "Password is Changed";
		String actual_login_title="Guru99 Bank Home Page";
		Login log = new Login(driver);
		log.loginMethod();
		SM2_ChangePassword change = new SM2_ChangePassword(driver);
		change.changePasswordMethod();
		String expected_popup=driver.switchTo().alert().getText();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual_popup, expected_popup);
		String expected_login_title=driver.getTitle();
		s.assertEquals(actual_login_title, expected_login_title);
		
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet(sheet_name).getRow(1).getCell(1).setCellValue(ExcellLibrary.getCellValue(excel_path,"Manager", 6, 2));
		FileOutputStream fos = new FileOutputStream(excel_path);
		wb.write(fos);
		s.assertAll();
		}

}
