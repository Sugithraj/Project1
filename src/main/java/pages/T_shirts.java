package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class T_shirts extends ProjectSpecificWrappers {
	
	public T_shirts(RemoteWebDriver driver, ExtentTest test) {
		
		if(!verifyTitle("T-shirts - My Store")) {
	   		  reportStep("This is not My account Page", "Fail");
	   	  }
	}
	
	public T_shirts mousehovertoimage() throws InterruptedException {
		Thread.sleep(2000);
	WebElement element=	getElementByXpath("//img[@title='Faded Short Sleeve T-shirts']");
	scrollToElement(element);
	mouseOverByXpath("//img[@title='Faded Short Sleeve T-shirts']");
	return this;
	
	}
	
	public T_shirts addtocart() {
		clickByXpath("//span[contains(text(),'Add to cart')]");
		return this;
		
	}
	
	public T_shirts verifypop_up () {
		verifyTextByXpath("(//h2[contains(text(),'')])[1]", "Product successfully added to your shopping cart");
		return this;
	}
	
	public OrderPage click_Proceedcheckout() {
		clickByXpath("//span[contains(text(),'Proceed to checkout')]");
		return new OrderPage(driver,test);
		
	}

}
