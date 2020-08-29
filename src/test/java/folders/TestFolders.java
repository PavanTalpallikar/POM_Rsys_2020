package folders;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import impl.folders.Folder;
import impl.home.Home;
import testExecutor.DriverBase;

public class TestFolders extends DriverBase {
	
	Folder folder;
	Home home;
	
	@BeforeClass
	public void init() {
		folder = new Folder(driver);
		home = new Home(driver);
		
	}
	
	@Test
	public void goToFolder() {
		folder.clickOnGivenFolder("P_Sanity2_SaveAs");
	}

}
