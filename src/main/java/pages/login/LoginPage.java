package pages.login;

import org.openqa.selenium.WebDriver;

import core.DriverActions;
import utils.CommonUtils;
import utils.DriverUtils;
import utils.FrameworkConstants;
import utils.Report;

public class LoginPage extends DriverActions{
	
	public static final String XPATH_LOGINPAGE_USERNAME = "//*[@id='txtUserName']"; 
	public static final String XPATH_LOGINPAGE_PASSWORD = "//*[@id='txtPassword']";
	public static final String XPATH_LOGINPAGE_SIGNIN_BUTTON = "//*[@id='signIn']";
	
	private static final String XPATH_RESP_LOGOUT_DROPDOWN = "//a[contains(@id,'uifresponsysheaderaccountbutton')]";
	private static final String XPATH_LOGOUT_LINK = "//a//span[contains(text(),'Sign Out')]";
	private static final String XPATH_LOGINPAGE_SESSION_TIMEOUT = "//tbody/tr//td[@id='ui.login.sessionTimedOut']";
	private static final String XPATH_LOGINPAGE_SESSION_TIMEOUT_LOGIN = "//p[@id='ui.login.pleaseLogInAgain']/a";
	private static final String LOGINPAGE_WINDOW_NAME = "Oracle Sign in";
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String un, String pwd) {
		System.out.println("Inside Login Page Login method");
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_02);
		findElementByXpath(XPATH_LOGINPAGE_USERNAME).sendKeys(un);
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_02);
		findElementByXpath(XPATH_LOGINPAGE_PASSWORD).sendKeys(pwd);
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_02);
		findElementByXpath(XPATH_LOGINPAGE_SIGNIN_BUTTON).click();
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_02);
	}
	
	
	public void logout() {
			if (isVisible(XPATH_RESP_LOGOUT_DROPDOWN, "Logout drop down")) {
				click(XPATH_RESP_LOGOUT_DROPDOWN, "Logout drop down");
				click(XPATH_LOGOUT_LINK, "Sign out link");
				if (isVisible(XPATH_LOGINPAGE_SESSION_TIMEOUT, "Session Timeout screen")) {
					click(XPATH_LOGINPAGE_SESSION_TIMEOUT_LOGIN, "Login link");
				}
				DriverUtils.switchToWindow(LOGINPAGE_WINDOW_NAME);
				System.out.println("Logout successful");
			} else {
				System.out.println("Logout not performed");
			}
		}
	

}
