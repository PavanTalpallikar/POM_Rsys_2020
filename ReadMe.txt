The project flow is as below:

a. There is a Core>DriverActions. 
This class should be extended by all page classes. This class has public constructor(this.driver=driver) to initiate the protected WebDriver.
This class contains Actions on the driver like getElements, switchToFrame, click, submit 
Basically all 'verbs' on driver. 

b. There are Page Classes which extend the DriverActions. 
These page classes contain a Page Objects and Page functions. 
