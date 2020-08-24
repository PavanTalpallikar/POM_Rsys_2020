package impl.login;

import org.openqa.selenium.WebDriver;

import pages.home.HomePage;
import pages.login.LoginPage;
import utils.CommonUtils;
import utils.DriverUtils;
import utils.FrameworkConstants;

public class Login {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public Login(WebDriver driver) {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
	}
	
	
	public void doLogin() {
		
		System.out.println("Inside DO LOGIN");
		
		String username = CommonUtils.getProperty("username");
		String password = CommonUtils.getProperty("password");
		
		System.out.println(username + " " + password);
		
		loginPage.login(username, password);
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_05);
		Boolean loginSuccess = homePage.checkIfHamburgerMenuExists();
		if(loginSuccess) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Failed");
		}				
	}
	
	public void logout() {
		loginPage.logout();
	}
	

}
