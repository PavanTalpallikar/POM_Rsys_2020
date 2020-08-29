package pages.home;

import org.openqa.selenium.WebDriver;

import core.DriverActions;
import utils.DriverUtils;
import utils.Report;

public class HomePage extends DriverActions{

	public static final String XPATH_HAMBURGER_MENU = "//span[@data-ref='btnIconEl' and @class='x-btn-icon-el x-btn-icon-el-ri-iconbutton-small uif-hamburger-button-icon ']";
	
	public static final String XPATH_HAMBURGER_MENU_HOME = "//div[@class='x-treelist-item-text' and contains(text(),'Home')]";
	public static final String XPATH_HAMBURGER_MENU_FOLDERS ="//div[@class='x-treelist-item-text' and contains(text(),'Folders')]";;
	public static final String XPATH_HAMBURGER_MENU_PROGRAMS ="//div[@class='x-treelist-item-text' and text()='Programs']";; 
	public static final String XPATH_HAMBURGER_MENU_MANAGE_PROGRAMS ="//div[@class='x-treelist-item-text' and text()='Manage Programs']"; 
	public static final String XPATH_HAMBURGER_MENU_MANAGE_LISTS = "//div[@class='x-treelist-item-text' and text()='Manage Lists']";
	public static final String XPATH_HAMBURGER_MENU_CAMPAIGNS = "";
									
	

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public Boolean checkIfHamburgerMenuExists() {
		
		Report.info("This is inside checkIfHamburgerMenuExists in Home page");

		if(findElementByXpath(XPATH_HAMBURGER_MENU).isDisplayed()){
			return true;
		}
		Report.error("Hamburger Menu does not exist");
		return false;
	}


	public void clickOnHomeInHamburgerMenu() {
		
		Boolean HBMenu = checkIfHamburgerMenuExists();
		
		if(HBMenu) {
			click(XPATH_HAMBURGER_MENU, "Click on Hamburger menu");
			click(XPATH_HAMBURGER_MENU_HOME, "Home in Hamburger Menu");
		}
			
	}


	public void clickOnFoldersInHamburgerMenu() {
		Report.info("This is inside clickOnFoldersInHamburgerMenu in Home page");
		Boolean HBMenu = checkIfHamburgerMenuExists();

		if(HBMenu) {
			DriverUtils.waitExplicitThreadSleepInMilliSeconds(3000);
			click(XPATH_HAMBURGER_MENU, "Click on Hamburger menu");
			DriverUtils.waitExplicitThreadSleepInMilliSeconds(3000);
			click(XPATH_HAMBURGER_MENU_FOLDERS, "Folders in Hamburger Menu");
		}
	}


	public void clickOnProgramsInHamburgerMenu() {
		Boolean HBMenu = checkIfHamburgerMenuExists();
		
		if(HBMenu) {
			click(XPATH_HAMBURGER_MENU, "Click on Hamburger menu");
			click(XPATH_HAMBURGER_MENU_PROGRAMS, "Programs in Hamburger Menu");
		}

	}


	public void clickOnManagePrograms() {
		Boolean HBMenu = checkIfHamburgerMenuExists();

		if(HBMenu) {
			click(XPATH_HAMBURGER_MENU, "Click on Hamburger menu");
			click(XPATH_HAMBURGER_MENU_MANAGE_PROGRAMS, "Manage Programs in Hamburger Menu");
		}

	}



	public void clickOnManageLists() {
		Boolean HBMenu = checkIfHamburgerMenuExists();

		if(HBMenu) {
			click(XPATH_HAMBURGER_MENU, "Click on Hamburger menu");
			click(XPATH_HAMBURGER_MENU_MANAGE_LISTS, "Home in Hamburger Menu");
		}


	}




}
