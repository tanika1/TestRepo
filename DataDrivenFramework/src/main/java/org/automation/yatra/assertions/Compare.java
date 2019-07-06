package org.automation.yatra.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {

		
	public static boolean validateURL(WebDriver driver,String expURL) {
		boolean flag=false;
		
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
			flag=true;
		}
		
		return flag;
	}
	
	
	public static boolean pageTitle(WebDriver driver,String expTitle) {
		boolean flag=false;
		
		if(driver.getTitle().equalsIgnoreCase(expTitle)){
			flag=true;
		}
		
		return flag;
	}
}
