package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePageObjects {
	
	
	private static HomePageObjects  HomePageObjectsInstance=null;
	
	
	
	private HomePageObjects() {
		
		
	}	
	
	
	public static HomePageObjects getInstance() {
		
		if(HomePageObjectsInstance==null) {
			
		HomePageObjectsInstance=new HomePageObjects();
		
		}
		
		return HomePageObjectsInstance;
		
	}
	
	@FindBy(id="welcome")
	private WebElement checkHomepage;
	
	@FindBy(id="menu_pim_viewMyDetails")
	private WebElement My_Info;
	
	@FindBy(id="btnSave")
	private WebElement EditButton;
	
	@FindBy(name = "personal[txtEmpFirstName]")
	private WebElement Employee_Name;
	

	@FindBy(name = "personal[txtEmployeeId]")
	private WebElement Employee_Id;
	

	@FindBy(id = "personal_cmbNation")
	private WebElement Nationality;
	
	
	
	
	
	public String verifyHomepage() {
		
		return checkHomepage.getText();
		
	}
	
	public void clickMyInfo() {
		
		My_Info.click();
		
	}
	
	
	public void clickEditButton() {
		
		EditButton.click();
		
	}
	
	
	
	
	public void setEmployeeName(String name) {
		
		Employee_Name.clear();
		
		
		Employee_Name.sendKeys(name);
		
	}
	
	
	public void setEmployeeId(String id) {
		
		Employee_Id.clear();
		
		Employee_Id.sendKeys(id);
		
	}
	
	
	
	public void SetNationality() {
		
		
		Select select=new Select(Nationality);
		
		select.selectByVisibleText("Indian");
		
	}
	
	
	
	

	

}
