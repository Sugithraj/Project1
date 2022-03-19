package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class LoginPage extends ProjectSpecificWrappers {

              public LoginPage(RemoteWebDriver driver, ExtentTest test) {
            	  
            	  if(!verifyTitle("Login - My Store")) {
            		  reportStep("This is not Login Page", "fail");
            	  }
             }
              
              public LoginPage enterUserName() {
                   enterById("userName", "sugith06raj@gmail.com");
                   return this;
              }
              
              public LoginPage enterpassword() {
            	  enterById("password", "seleniumpom");
            	  return this;
              }
              
              public MyAccountPage clickLogin() {
            	  clickByClassName("icon-lock left");
            	  return new MyAccountPage(driver, test);
              }
              
              
}
