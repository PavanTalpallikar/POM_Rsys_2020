package impl.programs;

import org.openqa.selenium.WebDriver;

import pages.home.HomePage;
import pages.login.LoginPage;

public class Program {

	LoginPage loginPage;
	HomePage homePage;
	
	public Program(WebDriver driver) {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
	}
	
	
	public void letsStart() {
		System.out.println("Started ");
	}
	
}
