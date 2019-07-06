package org.automation.yatra.dataGenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	
	@DataProvider(name="Excel")
	public static Object testDataGenerator(Method met) throws IOException
	{
		//------Static Data generated directly through Code
		/*Object[][] data= {{"Uname1","pass1"},{"Uname2","pass2"},{"Uname3","pass3"}};
		return data;*/
		
		
		if(met.getName().equalsIgnoreCase("tc_001_login_functionality"))
		{
		FileInputStream fs = new FileInputStream("./TestData/TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet loginSheet=wb.getSheet("Login");
		int rowCount=loginSheet.getPhysicalNumberOfRows();
		Object[][] testData= new Object[rowCount][2];
		
		for(int i=0;i<rowCount;i++) {
			
			XSSFRow row =loginSheet.getRow(i);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			
			testData[i][0]=username.getStringCellValue();
			testData[i][1]=password.getStringCellValue();
			}
		return testData;
		}
		
		else if(met.getName().equalsIgnoreCase("tc002_register_new_user")) {
			
			FileInputStream fs = new FileInputStream("./TestData/TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet loginSheet=wb.getSheet("Register");
			int rowCount=loginSheet.getPhysicalNumberOfRows();
			Object[][] testData= new Object[rowCount][3];
			
			for(int i=0;i<rowCount;i++) {
				
				XSSFRow row =loginSheet.getRow(i);
				XSSFCell firstname=row.getCell(0);
				XSSFCell lastname=row.getCell(1);
				XSSFCell mobile=row.getCell(2);
				
				testData[i][0]=firstname.getStringCellValue();
				testData[i][1]=lastname.getStringCellValue();
				testData[i][2]=mobile.getStringCellValue();
				}
			return testData;
			}
		
		else
		{
			Object[][] testData= new Object[2][2];
			return testData;
		}

			
		}
		
	
	
	}
	
	
