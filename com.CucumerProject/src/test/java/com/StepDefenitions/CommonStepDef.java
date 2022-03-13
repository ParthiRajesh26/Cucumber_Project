package com.StepDefenitions;

import com.Constants.Constants;
import com.PageObjects.LoginPage;
import com.Utilities.UtilityClass;
import com.WebDriverManager.DriverManager;

import io.cucumber.java.Before;

public class CommonStepDef {
	
	
	
	@Before
	public void beforeScenario() {
		
		try {
			
		UtilityClass.getInstance().loadProperties();
		
		if (DriverManager.getDriver()==null) {
			
			DriverManager.launchBrowser();
			
			UtilityClass.getInstance().initWebElements();
			
			login();
		}
			
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	
	
	public void login() {
		
		
		DriverManager.getDriver().get(Constants.APP_URL);
		LoginPage.getInstance().provideUsername();
		LoginPage.getInstance().providePassword();
		LoginPage.getInstance().clicklLoginButton();
	
	}
	
	
	
	
	
	
	

}
