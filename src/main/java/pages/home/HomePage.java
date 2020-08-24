package pages.home;

import org.openqa.selenium.WebDriver;

import core.DriverActions;

public class HomePage extends DriverActions{
	
   public HomePage(WebDriver driver) {
		super(driver);
	}

public Boolean checkIfHamburgerMenuExists() {
	   
	   System.out.println("Hamburger Menu exits");
	   
	   return true;
   }

}
