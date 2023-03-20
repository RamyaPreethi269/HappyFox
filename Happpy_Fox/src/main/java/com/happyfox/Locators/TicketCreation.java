package com.happyfox.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.happyfox.Baseclass.Baseclass;

public class TicketCreation extends Baseclass {
	
	public TicketCreation(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h6[text()='Create a New Ticket']")
	public WebElement CreateTicket_heading;
	
	@FindBy(xpath = "//div[contains(text(),'Your ticket has been created')]")
	public WebElement CreateTicket_SuccessMSG;
	
	@FindBy(id="id_subject")
	public WebElement subject;
	
	@FindBy(xpath = "//div[@role='textbox']")
	public WebElement Message_txtbx;
	
	@FindBy(id="id_name")
	public WebElement name;
	
	@FindBy(id="id_email")
	public WebElement email;
	
	@FindBy(id = "submit")
	public WebElement Createticket_btn;
	
	
	
	

}
