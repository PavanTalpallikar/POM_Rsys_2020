package core;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import utils.DriverUtils;
import utils.FrameworkConstants;
import utils.Report;

abstract public class DriverActions {
	protected WebDriver driver;
	
	public DriverActions(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement findElementByXpath(String xpathOfPageObject) {
		return driver.findElement(By.xpath(xpathOfPageObject));
	}
	
	
	
	/**
	 * This method finds webElement based on elementType and Click on the
	 * element - POM flow
	 * 
	 * @param locator
	 * @param elemenType
	 * @param objectName
	 */
	protected void click(String locator, String objectName) {
		try {
			WebElement element = findElementByXpath(locator);
			if (element != null) {
				element.click();
				DriverUtils.waitImplicitInSeconds(FrameworkConstants.WAIT_IN_SECONDS_05);
				//Report.pass("'" + objectName + "'" + " is clicked");
				System.out.println("'" + objectName + "'" + " is clicked");
			} else {
				System.out.println("'" + objectName + "' is not found");
				//Report.fail("'" + objectName + "' is not found");
			}
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
			//Report.fail("'" + objectName + "' is not found");
		} catch (WebDriverException e) {
			e.printStackTrace();
			//Report.fail("Unable to click " + "'" + objectName + "'");
		}
	}
	
	
	
	
	
	/**
	 * This method finds the WebElement and checks if the web element is visible
	 * or not - POM flow
	 * 
	 * @param locator
	 *            String element
	 * @param objectName
	 *            - String value representing the name of the element.
	 * @return true if a web element is found, else return false
	 */
	protected boolean isVisible(String locator, String objectName) {
		boolean isVisible = false;
		WebElement element = findElementByXpath(locator);
		if (element != null) {
			isVisible = element.isDisplayed();
			if (isVisible)
				System.out.println("'" + objectName + "' is visible.");
			else
				System.out.println("'" + objectName + "' is not visible.");
		} else {
			System.out.println("'" + objectName + "' is not present.");
		}
		return isVisible;
	}
	

}
