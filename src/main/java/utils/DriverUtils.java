package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils {


	public static WebDriver driver;

	public static WebDriver initDriver(String browser) {

		if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.IE_DRIVER_PATH);
			driver = new InternetExplorerDriver();


		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", FrameworkConstants.FIREFOX_DRIVER_PATH);
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.CHROME_DRIVER_PATH);
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.addArguments("--disable-notifications");

			driver = new ChromeDriver(cOptions);
		}
		
		 return driver;

	}



}
