The project flow is as below:
========================================================================================
src/main/java/
Core> DriverActions

This class should be extended by all page classes. This class has public constructor(this.driver=driver) to initiate the protected WebDriver.
This class contains Actions on the driver like getElements, switchToFrame, click, submit 
doubleClick(String, String)
doubleClick(WebElement, String)
dragAndDrop(String, String, String)
dragAndDropBy(String, int, int, String)
getAttribute(String, String, String)
getElement(String)
getElements(String)
getSelectedValue(String, WebElement)
getSelectedValueFromDropDown(String, String)
getText(String, String)
getText(WebElement, String)
getWebElement(String)
isVisible(String, String)
isVisible(WebElement, String)
mouseOver(String, String)
moveToElement(String, String)
rightClick(String, String)
rightClick(WebElement, String)
scrollDownToElement(String, String)
scrollDownToElementInTreeView(String, String)
selectDateFromCalendar(String, String, String, int)
selectFromDropdown(String, String, String)
selectFromDropdownByValue(String, String, String)
selectMultipleElements(String[], String[])
selectUsingVisibleText(String, WebElement, String)
selectUsingVisibleValue(String, WebElement, String)
setValue(String, String, String)
setValue(String, WebElement, String)
switchToFrameAndReturnElement(String)
waitForCXAPageToLoad()
waitForElement(String)
waitForPageSave()
waitForPageToLoad()
waitForProgramPageToLoad()
Basically all 'verbs' on driver. 

========================================================================================
src/main/java/
Pages > Programs > ProgramDesignerPage

Page Classes extend the DriverActions. 
These page classes contain a Page Objects and Page functions. Each Page class public constructor which passes the driver to the super class - DriverActions.
Page Functions like - 
ProgramAnalyzePage(WebDriver)
clickRefreshButton()
getPassedThroughCount()
getStageEnactmentCount(String, StageStats)
navigateToAnalyzeTab()
navigateToSnapshotTab()
setFilterCriteria(FilterCriteria, int)
unpublishProgram()

  
========================================================================================
src/main/java/
utils> DriverUtils

Contains public static WebDriver driver. 
Contains initDriver method to initialize driver. 
Contains methods such as : launchBrowserAndNavigateToURL, launchBrowserAndGoToPodURL, getTitle, waitImplicit, 
All methods are static and are available at compile time without needing to create instances.

alertAccept()
alertCancel()
alertPresent()
closeRecentTab(WebDriver)
closeWindow(WebDriver, String)
getAlertText()
getBrowserURL(WebDriver)
getLocalConfigData(String)
getLocalHub(String, String)
getSourceCodeSize(WebDriver)
getTitle(WebDriver)
initDriver()
initMobileDriver(String)
initRemoteDriver(String, String)
initRemoteMobileDriver(String, String)
launchBrowser(WebDriver)
maximizeWindow(WebDriver)
navigateToUrl(WebDriver, String)
openNewTab(WebDriver, String)
refreshPage(WebDriver)
switchToDefaultPage(WebDriver)
switchToDefaultWindow(WebDriver)
switchToFrame(WebDriver, int)
switchToFrame(WebDriver, String)
switchToFrame(WebDriver, WebElement)
switchToRecentTab(WebDriver)
switchToWindow(WebDriver, String)
switchToWindowOrTab(WebDriver, String)
waitExplicit(int)
waitImplicit(WebDriver, int)
writeScreenshotToFile(WebDriver, String)


========================================================================================
src/main/java/
utils> CommonUtils

Contains Utils which are no related to driver such as Load Properties file, methods to work on excel sheet.
All utility methods related to: Date & time Waits Excel sheet Properties file
Java related methods parsing string, array etc.  
All methods should be static so that they are available at compile time without needing to create instances. 

generateRandomNumber()
getAccountCurrentDateTime(String, String)
getExcelInputData(String, String, String)
getExcelInputDataArray(ITestNGMethod, String, String, String)
getExcelInputDataArrayBasedOnDepth(String, String, String, int)
getPath(String)
getProjectBasePath()
getProperty(String)
getSubStringBetween(String, String, String)
loadProperties(String)
runCommandLine(String)
verifyText(String, String)
verifyTextContains(String, String)
writeStringDataToTextFile(String, String)


========================================================================================
src/test/java/
testExecutor> Driver

 A singleton class to create driver instance if not present and return it. If the instance already exists, return it.
 Contains private static WebDriver variable.
 Contains private default constructor which does nothing but is required as part of Singleton class structure.
 (A private Constructor prevents any other class from instantiating.)
 Contains getDriverInstance method 
 


========================================================================================



========================================================================================



========================================================================================


========================================================================================


========================================================================================


========================================================================================


========================================================================================


========================================================================================


========================================================================================
