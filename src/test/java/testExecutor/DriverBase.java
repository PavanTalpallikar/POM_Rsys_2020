package testExecutor;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static utils.DriverUtils.*;
import impl.login.Login;
import utils.CommonUtils;

import utils.FrameworkConstants;

public class DriverBase {
	
	public WebDriver driver;
	protected Login login;
	
	@BeforeTest(alwaysRun=true)
	public void initBrowser() {
		String browser = CommonUtils.getProperty("browser");
		
		driver = Driver.getDriverInstance(browser);
		login = new Login(driver);
		if(driver!=null) {
			navigateToURL(CommonUtils.getProperty("QA1_URL"));
			waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_02);
			maximizeBrowser();
			login.doLogin();		
			
		} else
			System.out.println("Driver is null");
		
	}
	
	
	
	@AfterTest
		public void logout() {
			login.logout();
		}
	}
