package org.automation.yatra.testcases;

import java.io.IOException;

import org.automation.yatra.base.DriverInstance;
import org.automation.yatra.dataGenerator.DataGenerator;
import org.automation.yatra.pages.LoginPage;
import org.testng.annotations.Test;

public class TC002_RegisterNewUser extends DriverInstance{
	
	@Test(dataProvider = "Excel",dataProviderClass = DataGenerator.class)
	
	public void tc002_register_new_user(String fname,String lname,String mobile) throws IOException {
		
		LoginPage login = new LoginPage(driver);
		login.enterFirstName(fname);
		login.enterLastName(lname);
		login.enterMobile(mobile);
	}

}
