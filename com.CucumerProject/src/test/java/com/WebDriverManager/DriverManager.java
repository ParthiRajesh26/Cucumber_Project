package com.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static WebDriver driver=null;


	public static WebDriver getDriver() {
		return driver;
	}


	public static void launchBrowser() {

		try {

			switch (Constants.BROWSER) {
			case "chrome":

				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;


			case "firefox":

				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;

			case "edge":

				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;



			default:
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}

		} catch (Exception e) {

           e.printStackTrace();

		}




	}

}
