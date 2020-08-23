package utils;

public class FrameworkConstants {
	/** contains all the constants in the framework. Such as filePaths, waits in seconds etc 
	 * 
	 */

	
	//Framework filePaths
	public static final String CONFIG_FILEPATH =  System.getProperty("user.dir")+"//config//config.properites";
	public static final String PROJECT_BASEPATH = System.getProperty("user.dir");
	
	//Browser driver exe
	public static final String CHROME_DRIVER_PATH = PROJECT_BASEPATH + "//drivers//chromedriver.exe";
	public static final String FIREFOX_DRIVER_PATH = PROJECT_BASEPATH + "//drivers//geckodriver.exe";
	public static final String IE_DRIVER_PATH = PROJECT_BASEPATH + "//drivers//IEDriverServer.exe";
	
	
	
	
	//Framework Waits
	public static final int  WAIT_IN_SECONDS_02 = 2;
	public static final int  WAIT_IN_SECONDS_03 = 3;
	public static final int  WAIT_IN_SECONDS_05 = 5;
	public static final int  WAIT_IN_SECONDS_10 = 10;
	public static final int  WAIT_IN_SECONDS_15 = 15;
	public static final int  WAIT_IN_SECONDS_30 = 30;
	
	
	
	
}
