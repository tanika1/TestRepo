package org.automation.yatra.pages;

import java.io.IOException;

import org.automation.yatra.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {

		this.driver=driver;
	}


	public void enterUsername(String uname) throws IOException {

		driver.findElement(By.id(Utility.fetchLocatorValue("login_user_id"))).sendKeys(uname);
	}	

	public void enterPassword(String pass) throws IOException {

		driver.findElement(By.id(Utility.fetchLocatorValue("login_pass_id"))).sendKeys(pass);
	}


	public void clickSignin() throws IOException {

		driver.findElement(By.id(Utility.fetchLocatorValue("login_signin_id"))).click();
	}
	
	public void enterFirstName(String firstName) throws IOException {

		driver.findElement(By.name(Utility.fetchLocatorValue("login_firstName_name"))).sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) throws IOException {

		driver.findElement(By.name(Utility.fetchLocatorValue("login_lastName_name"))).sendKeys(lastName);
	}
	
	public void enterMobile(String mobile) throws IOException {

		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_mobile_xpath"))).sendKeys(mobile);
	}
}
