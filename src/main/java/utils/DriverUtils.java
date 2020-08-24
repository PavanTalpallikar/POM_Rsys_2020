package utils;

import java.util.concurrent.TimeUnit;

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
			cOptions.addArguments("disable-infobars");

			driver = new ChromeDriver(cOptions);
			
		}
		
		 return driver;

	}
	
	
	public static void navigateToURL(String URL) {
		driver.navigate().to(URL);
		
	}
	
	
	public static void waitImplicitInSeconds(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	
	public static void waitExplicitThreadSleepInMilliSeconds(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
	}


	public static void switchToWindow(String loginpageWindowName) {
		driver.switchTo().window(loginpageWindowName);
		
	}
	
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}




}
