package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract public class DriverActions {
	protected WebDriver driver;
	
	public DriverActions(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement findElementByXpath(String xpathOfPageObject) {
		return driver.findElement(By.xpath(xpathOfPageObject));
	}
	
	

}
