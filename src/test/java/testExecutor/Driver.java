package testExecutor;

import org.openqa.selenium.WebDriver;

import utils.DriverUtils;

public class Driver {

	private static WebDriver driver;
	private Driver() {
		
	}
	
	
	public static WebDriver getDriverInstance(String browser) {
		if(driver==null) {
			driver = DriverUtils.initDriver(browser);
		} 
		return driver;
	}
	
}
