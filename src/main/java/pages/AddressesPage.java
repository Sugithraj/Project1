package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class AddressesPage extends ProjectSpecificWrappers {
	
	 public AddressesPage(RemoteWebDriver driver, ExtentTest test) {
   	  
   	  if(!verifyTitle("Login - My Store")) {
   		  reportStep("This is not  Addresses Page", "Fail");
   	  }
    }
	 
	 
	 public AddressesPage ClickUpdate() {
		 clickByXpath("//span[contains(text(),'Update')]");
		 return this;
	 }
	
	public AddressesPage UpdateState() {
		enterByXpath("//select[@id='id_state']", "Arizona");
	    return this;  	
	}
	
	public AddressesPage UpdateCity() {
		enterByXpath("//input[@id='city']", "Washington");
		return this;
	}
	
	public AddressesPage ClickSave() {
		clickByXpath("addresses\",\"//span[contains(text(),'Save')]");
		return this;
	}
	
	public AddressesPage verifyTextByXpath() {
		verifyTextByXpath("//span[contains(text(),'Arizona')]", "Arizona");
		return this;
	}
	
	public AddressesPage VerifyTextByXpath() {
		verifyTextByXpath("//span[contains(text(),'Washington')]", "Washington");	
		return this;
	}

	public LoginPage clicklogOut() {
		clickByXpath("(//a[contains(text(),'Sign out')])[1]");
		return new LoginPage (driver, test);
	}
	

	
	 
	

}
