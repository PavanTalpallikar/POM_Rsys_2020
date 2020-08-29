package programs;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import impl.folders.Folder;
import impl.programs.Program;
import testExecutor.DriverBase;

public class TestPrograms extends DriverBase{

	Program program;
	Folder folder;
	
	@BeforeClass
	public void init(){
		program = new Program(driver);
		folder = new Folder(driver);
	}
	
	
	@Test(priority =2)
	public void sampleTest() {
		program.letsStart();
	}
	
	
	
	@Test(priority=3)
	public void openProgram() {
		folder.openAGivenProgramFromFolders("P_Sanity2_SaveAs", "P_Sanity2_AllocationSwitch_SaveAs");
	}
	
}
