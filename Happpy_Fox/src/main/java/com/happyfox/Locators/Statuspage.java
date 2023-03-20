package com.happyfox.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.happyfox.Baseclass.Baseclass;

public class Statuspage  extends Baseclass{

	public Statuspage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Statuses']")	
	public WebElement Status_Heading;
	
	@FindBy(className ="hf-mod-create")
	public WebElement add_button;
	
	@FindBy(css= "input[aria-label='Status Name']")
	public WebElement StatusName;
	
	@FindBy(tagName = "textarea")
	public WebElement add_des;
	
	@FindBy(xpath = "//button[@data-test-id='add-status']")
	public WebElement Add_status;
	
	 @FindBy(xpath = "(//div[contains(@data-test-id,'behavior')])[2]")
	 public WebElement behavior_dropdown; 
	 
	 @FindBy(linkText = "Priorities")
	 public WebElement priority;
	 
	 @FindBy(xpath = "//table//tr//td//div[text()='Issue created']")
	 public WebElement Verify_Status_Name;
	 
	 @FindBy(xpath = "//div[text()='Issue created']//following::a[text()='Make Default']")
	 public WebElement Ticket_MakeDefault;
	 
	 @FindBy(linkText = "Delete")
	 public WebElement Delete;
	 
	 @FindBy(xpath = "//span[contains(text(),'Choose')]")
	 public WebElement Choose;
	 
	 @FindBy(xpath = "//button[text()='Delete']")
	 public WebElement Ticket_Delete_btn;
	 
	 
	 
	
}
