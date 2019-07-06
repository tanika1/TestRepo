package org.automation.yatra.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.automation.yatra.base.DriverInstance;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.OutputType;

public class Screenshots extends DriverInstance {
	
	public void TakeScreenshot() throws IOException  {
		
		File fs= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File fd= new File("C:\\Users\\tanika.gupta\\eclipse-workspace\\DataDrivenFramework\\Screenshots\\ResultScreenshots.png");
		
		FileUtils.copyFile(fs,fd);
		
	}

}
