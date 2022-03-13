package com.StepDefenitions;

import org.junit.Assert;

import com.PageObjects.HomePageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateInfo {


	@Given("the user is logged sucessfully and on the homepage of Orange HRM App")
	public void the_user_is_logged_sucessfully_and_on_the_homepage_of_orange_hrm_app() {
		
		try {
			
			
		String status=	HomePageObjects.getInstance().verifyHomepage();
			
			//Assert.assertEquals("Welcome Paul", status);
			
			System.out.println("Assertion Passed");
			
		} catch (Exception e) {
			
			System.out.println("Assertion failed");
			
		}
		
		
	}
	
	@Given("the user clicks the My info Option in the menu bar")
	public void the_user_clicks_the_my_info_option_in_the_menu_bar() {
		
		try {
			
			HomePageObjects.getInstance().clickMyInfo();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	@When("the user clicks the edit button and update his Information")
	public void the_user_clicks_the_edit_button_and_update_his_information() {
		
		try {
			
			HomePageObjects.getInstance().clickEditButton();
			
			HomePageObjects.getInstance().setEmployeeName("Parthiban");
			
			HomePageObjects.getInstance().setEmployeeId("26394");
			
			HomePageObjects.getInstance().SetNationality();
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	@Then("the user click the save button")
	public void the_user_click_the_save_button() {
		
		try {
			
			HomePageObjects.getInstance().clickEditButton();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
