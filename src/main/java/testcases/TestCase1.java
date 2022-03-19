package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase1 extends ProjectSpecificWrappers {
	
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
	public void tasecase1() {
		
		new LoginPage(driver,test).enterUserName()
		.enterpassword()
		.clickLogin()
		.clickAddresses()
		.ClickUpdate()
		.UpdateState()
		.UpdateCity()
		.ClickSave()
		.verifyTextByXpath()
		.VerifyTextByXpath()
		.clicklogOut();
		
	}

}
