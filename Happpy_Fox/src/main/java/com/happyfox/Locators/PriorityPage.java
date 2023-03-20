package com.happyfox.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.happyfox.Baseclass.Baseclass;

public class PriorityPage extends Baseclass {

	
	public PriorityPage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Priorities']")
	public WebElement PriorityHeading;
	
	@FindBy(css = "input[aria-label='Priority Name']")
	public WebElement PriorityName;
	
	@FindBy(css = "textarea[aria-label='Description']")
	public WebElement Description;
	
	@FindBy(css = "button[data-test-id='add-priority']")
	public WebElement Add_Priority;
	
	 @FindBy(xpath = "//table//tr//td//span[text()='Assistance required']")
	 public WebElement Verify_Priority_Name;
	 
	 
	 @FindBy(xpath = "//span[text()='Assistance required']//following::div[text()='Make Default']")
	 public WebElement Priority_MakeDefault;
	
	
}
