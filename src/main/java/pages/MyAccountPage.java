package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class MyAccountPage extends ProjectSpecificWrappers {
	
	 public MyAccountPage(RemoteWebDriver driver, ExtentTest test) {
   	  
		 if(!verifyTitle("My account - My Store")) {
   		  reportStep("This is not My account Page", "Fail");
   	  }
	 }
	 
	 public AddressesPage clickAddresses() {
		clickByXpath("//span[contains(text(),'My addresses')]");
		 return new AddressesPage(driver, test);
	 }
	 
	 public MyAccountPage mousehover() {
			mouseOverByXpath("(//a[contains(text(),'Women')])[1]");
			return this;
		}
		
		public T_shirts clickt_shirts(){
			clickByXpath("//a[contains(text(),'T-shirts')])[1]");
			return new T_shirts(driver,test);
			
		}
}

	

