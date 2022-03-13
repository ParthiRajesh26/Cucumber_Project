package com.Utilities;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Constants.Constants;
import com.PageObjects.HomePageObjects;
import com.PageObjects.LoginPage;
import com.PageObjects.PerformancePage;
import com.WebDriverManager.DriverManager;

public class UtilityClass {

	private static UtilityClass  UtilityClassInstance=null;

	private UtilityClass() {


	}


	public static UtilityClass getInstance() {

		if(UtilityClassInstance==null) {


			UtilityClassInstance=new UtilityClass();

		}

		return UtilityClassInstance;
	}



	public void loadProperties() {


		Properties properties = new Properties();



		try {

			properties.load(getClass().getResourceAsStream("/Config.properties"));

		} catch (Exception e) {

			e.printStackTrace();
		}


		Constants.APP_URL =	properties.getProperty("APP_URL");
		Constants.BROWSER =	properties.getProperty("BROWSER");
		Constants.USERNAME=	properties.getProperty("USERNAME");
		Constants.PASSWORD=	properties.getProperty("PASSWORD");
		Constants.CHROME_DRIVER_LOCATION=	properties.getProperty("CHROME_DRIVER_LOCATION");
		Constants.FIREFOX_DRIVER_LOCATION=	properties.getProperty("FIREFOX_DRIVER_LOCATION");
		Constants.EDGE_DRIVER_LOCATION=	    properties.getProperty("EDGE_DRIVER_LOCATION");


	}



	public void initWebElements() {
		
		
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		
		PageFactory.initElements(DriverManager.getDriver(), HomePageObjects.getInstance());
		
		PageFactory.initElements(DriverManager.getDriver(), PerformancePage.getInstance());

	}




}
