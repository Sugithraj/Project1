package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase2 extends ProjectSpecificWrappers {
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Project1";
		browserName="chrome";
		//dataSheetName="TC001";
		category="Smoke";
		authors="Sugith";
	}
	
	@Test
	public void tasecase1() throws InterruptedException {
		
		new LoginPage(driver,test).enterUserName()
		.enterpassword()
		.clickLogin()
		.mousehover()
		.clickt_shirts()
		.mousehovertoimage()
		.addtocart()
		.verifypop_up()
		.click_Proceedcheckout()
		.verifySHOPPING_CART()
		.checkout_summary()
		.checkout_address()
		.Terms_service()
		.checkout_shipping()
		.Signout();
		
		
		
	}

}
