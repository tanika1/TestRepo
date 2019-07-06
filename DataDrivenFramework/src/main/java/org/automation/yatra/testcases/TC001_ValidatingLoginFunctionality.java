package org.automation.yatra.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.automation.yatra.base.DriverInstance;
import org.automation.yatra.dataGenerator.DataGenerator;
import org.automation.yatra.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC001_ValidatingLoginFunctionality extends DriverInstance{
	
	@Test(dataProvider = "Excel",dataProviderClass=DataGenerator.class)
	public void tc_001_login_functionality(String uname,String pass) throws IOException {
		
		extentTest= new ExtentTest("TC_001", "Verify Login Functionality");
		extentTest=extentReport.startTest("TestLoginBegins");
		
		LoginPage login= new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
		
		extentTest.log(LogStatus.PASS, "Test Case Passed");
				
				//extentTest.getRunStatus();
		//extentReport.
		
		extentReport.endTest(extentTest);
	}
	
	
		
		
		}
		
	


