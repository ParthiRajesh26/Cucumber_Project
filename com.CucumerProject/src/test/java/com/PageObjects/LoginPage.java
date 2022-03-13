package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Constants.Constants;

public class LoginPage {

	private static LoginPage loginpageInstance=null;

	private LoginPage() {


	}


	public static LoginPage getInstance() {


		if (loginpageInstance==null) {


			loginpageInstance=new LoginPage();
		}

		return loginpageInstance;

	}


	@FindBy(id="txtUsername")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;

	@FindBy(id="btnLogin")
	private static WebElement loginButton;



	public void provideUsername() {

		username.sendKeys(Constants.USERNAME);

	}


	public void providePassword() {

		password.sendKeys(Constants.PASSWORD);


	}


	public void clicklLoginButton() {

		loginButton.click();

	}



}
