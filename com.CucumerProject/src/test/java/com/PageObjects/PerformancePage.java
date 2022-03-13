package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PerformancePage {
	
	private static PerformancePage  PerformancePageInstance=null;
	
	private PerformancePage() {
		
		
	}
	
	
	public static PerformancePage getInstance() {
		
		if (PerformancePageInstance==null) {
			
			PerformancePageInstance=new PerformancePage();
		}
		
		return PerformancePageInstance;
		
	}
	
	
	@FindBy(linkText ="Performance")
	private WebElement performance;
	
	
	@FindBy(linkText = "Employee Trackers")
	private WebElement EmpoloyeeTrackers;
	
	
	@FindBy(linkText = "Garry White")
	private WebElement Employee;
	
	
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[4]")
	private WebElement Review;
	
	
	
	public void ClickPerformance() {
		
		performance.click();
		
	}
	
	
	public void clickEmployeeTracker() {
		
		EmpoloyeeTrackers.click();
		
	}
	
	
	
	public void selectEmployee() {
		
		Employee.click();
		
	}
	
	
	
	public String getReview() {
		
		return Review.getText();
		
	}
	
	
	
	
	
	
	
	
	

}
