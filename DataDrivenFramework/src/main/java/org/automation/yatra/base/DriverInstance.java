package org.automation.yatra.base;

import java.io.IOException;

import org.automation.yatra.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.automationtesting.excelreport.Xl;



public class DriverInstance {
	public WebDriver driver;
	public ExtentReports extentReport; 
	public ExtentTest extentTest;

	@BeforeMethod
	public void initiateDriverInstance() throws IOException {
		
		extentReport = new ExtentReports("./ExtentReport/report.html", true);
		extentReport.addSystemInfo("Author Name", "Tanika");

		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");

			driver = new FirefoxDriver();
		}
		
		else{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

			driver = new ChromeDriver();

		}
		
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());



	}

	@AfterMethod
	public void closeDriverInstance() {
		extentReport.flush();
		extentReport.close();
		driver.quit();
	}
	
	
	/*@AfterSuite
	
	public void generateReport() throws Exception
	{
	
		Xl.generateReport("ExcelReport.xlsx");

	}*/
	
	}



