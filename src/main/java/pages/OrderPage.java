package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class OrderPage extends ProjectSpecificWrappers {
	
public OrderPage(RemoteWebDriver driver, ExtentTest test) {
		
		if(!verifyTitle("Order - My Store")) {
	   		  reportStep("This is not My account Page", "Fail");
	   	  }
	}

    public OrderPage verifySHOPPING_CART() {
    	verifyTextByXpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[2]", "Faded Short Sleeve T-shirts");
    	return this;
    }
    
    public OrderPage checkout_summary() {
    	clickByXpath("(//span[contains(text(),'Proceed to checkout')])[2]");
    	return this;
    }
    
    public OrderPage checkout_address() {
    	clickByXpath("(//span[contains(text(),'Proceed to checkout')])[2]");
    	return this;
    }
    
    public OrderPage Terms_service() {
    	clickByXpath("//input[@type='checkbox']");
    	return this;
    }
    
    public OrderPage  checkout_shipping() {
    	clickByXpath("(//span[contains(text(),'Proceed to checkout')])[2]");
    	return this;
     }
    
    public LoginPage Signout() {
    	clickByXpath("//a[@title='Log me out']");
    	return new LoginPage (driver, test);
    }

}
