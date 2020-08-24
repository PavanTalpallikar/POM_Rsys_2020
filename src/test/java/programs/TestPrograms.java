package programs;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import impl.programs.Program;
import testExecutor.DriverBase;

public class TestPrograms extends DriverBase{

	Program program;
	
	@BeforeClass
	public void init(){
		program = new Program(driver);		
	}
	
	
	@Test
	public void sampleTest() {
		program.letsStart();
	}
	
}
