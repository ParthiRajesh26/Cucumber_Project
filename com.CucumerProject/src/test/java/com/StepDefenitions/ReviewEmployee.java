package com.StepDefenitions;

import org.junit.Assert;

import com.PageObjects.PerformancePage;
import com.WebDriverManager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewEmployee {
	
	
	
	@Given("the user is on the Orange HRM Homepage after the Updation")
	public void the_user_is_on_the_orange_hrm_homepage_after_the_updation() {
		
		
		try {
			
			
			String status=DriverManager.getDriver().getCurrentUrl();
				
				if(status.contains("MyViewDetails#")) {
					
					System.out.println("User is on the Homepage");
				}
				
			} catch (Exception e) {
				
				System.out.println("Assertion failed");
				
			}
			
	    
		
	}
	
	@When("the user clicks Performance link in the Menu bar")
	public void the_user_clicks_performance_link_in_the_menu_bar() {
		
		
		try {
			
			PerformancePage.getInstance().ClickPerformance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}
	
	@When("clicks the Employee Tracker")
	public void clicks_the_employee_tracker() {
		
		try {
			
			PerformancePage.getInstance().clickEmployeeTracker();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
		
		
	}
	
	@When("the user Select the specific employee")
	public void the_user_select_the_specific_employee() {
		
		
		try {
			PerformancePage.getInstance().selectEmployee();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
		
	}
	
	@Then("the user checks the review Positive or Not")
	public void the_user_checks_the_review_positive_or_not() {
		
		
		try {
			
		String status=PerformancePage.getInstance().getReview();
		
		Assert.assertEquals("Positive", status);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	    
		
	}


}
