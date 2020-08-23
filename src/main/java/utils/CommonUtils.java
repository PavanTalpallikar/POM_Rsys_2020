package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {




	public static Properties loadProperties(String filePath) {
		Properties prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return prop;
	}
	
	public static String getProperty(String propertyName) {
			
		return loadProperties(FrameworkConstants.CONFIG_FILEPATH).getProperty(propertyName);	
	}
	
	

}
