package pages.folders;

import org.openqa.selenium.WebDriver;

import core.DriverActions;
import pages.home.HomePage;
import utils.DriverUtils;
import utils.FrameworkConstants;
import utils.Report;

public class FoldersPage extends DriverActions {
	
	
	private static final String XPATH_FOLDERS_DROPDOWN = "//div[contains(@class,'auto-folders-foldersLayout-foldersListCombo')]//div[contains(@id,'trigger-picker')]";
	
	private static final String XPATH_SELECT_ALL_FOLDERS_IN_FOLDERS_DROPDOWN = "//div[contains(@class,'x-field auto-folders-foldersLayout-foldersListCombo')]//*[@value='All folders']";
	private static final String XPATH_SELECT_GIVEN_FOLDER = "//div[contains(@id,'suitefolderslistdataview')]//span[contains(text(),'%s')]";
	private static final String XPATH_OPEN_REQUIRED_PROGRAM = "//div[@class='x-container x-container-default']//[text()='%s']";
	private static final String XPATH_OPEN_REQUIRED_PROGRAM2 = "//div[contains(@class,'suite-folders-content-link') and text()='%s']";
	
			
	public FoldersPage(WebDriver driver) {
		super(driver);
	}
	
	
	/** Assumes that the driver is on folders page and clicks the given folder
	 *  
	 * @param folderName
	 */
	public void navigateToAGivenFolder(String folderName) {
		
		Report.info("This is inside goToAGivenFolder in Folders page");
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_02);
		click(XPATH_FOLDERS_DROPDOWN, "DropDown to select All folders");
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_05);
		click(XPATH_SELECT_ALL_FOLDERS_IN_FOLDERS_DROPDOWN, "XPATH_SELECT_ALL_FOLDERS_IN_FOLDERS_DROPDOWN");
		DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_02);
		DriverUtils.waitExplicitThreadSleepInMilliSeconds(5000);
		
		if(isVisible(String.format(XPATH_SELECT_GIVEN_FOLDER, folderName), "Folder - " + folderName)) {
			Report.log("Inside All folders, checked given folder exists and now trying to click");
			click(String.format(XPATH_SELECT_GIVEN_FOLDER, folderName), "Folder - " + folderName);
			Report.pass("Clicked on the folder - " + folderName);
		} else {
			Report.fail("Couldnt find " + folderName + " folder");		
		}	
		
	}
	
	
	/** Assumes that driver is on folders page and opens the given program from 
	 * folder
	 * @param programName
	 */
	public void openProgram(String programName) {
		
		DriverUtils.waitExplicitThreadSleepInMilliSeconds(3000);
		click(String.format(XPATH_OPEN_REQUIRED_PROGRAM2, programName),   "Click on " + programName);
		DriverUtils.waitExplicitThreadSleepInMilliSeconds(3000);	
	}


}
