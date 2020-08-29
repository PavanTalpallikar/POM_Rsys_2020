package impl.folders;

import org.openqa.selenium.WebDriver;

import pages.folders.FoldersPage;
import pages.home.HomePage;

public class Folder {
	
	FoldersPage foldersPage;
	HomePage homePage;
	
	public Folder(WebDriver driver) {
		foldersPage = new FoldersPage(driver);
		homePage = new HomePage(driver);
	}

	public void clickOnGivenFolder(String folderName) {
		homePage.clickOnFoldersInHamburgerMenu();
		foldersPage.navigateToAGivenFolder(folderName);
	}
	
	
	public void openAGivenProgramFromFolders(String folderName, String programName) {
		clickOnGivenFolder(folderName);
		foldersPage.openProgram(programName);	
	}
	
	
	
	
	
}
