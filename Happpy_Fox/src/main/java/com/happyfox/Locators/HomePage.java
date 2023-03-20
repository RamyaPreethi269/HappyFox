package com.happyfox.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.happyfox.Baseclass.Baseclass;

public class HomePage extends Baseclass{

	public HomePage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[contains(@class,'avatar-image')]")
	public WebElement Profile_image;
	
	@FindBy(xpath = "//span[text()='Tickets']")
	public WebElement Tickets_Menu;
	
	@FindBy(linkText = "Statuses")
	public WebElement Statuses_SubMenu;
	
	@FindBy(linkText = "Priorities")
	public WebElement Priorities_SubMenu;
	
	@FindBy(css = "input[placeholder='Search']")
	public WebElement TicketPriority_searchbx;
	
	@FindBy(xpath = "//span[text()='Reply']")
	public WebElement Tickets_Reply;
	
	@FindBy(xpath = "//span[@class='hf-u-vertical-super ']")
	public WebElement Reply_addMsg;
	
	@FindBy(css = "input[placeholder='Search more Canned Actions']")
	public WebElement CannedActions_SearchBx;
	
	@FindBy(xpath = "// button[text()='Apply']")
	public WebElement CannedActions_Apply;
	
	@FindBy(xpath = "(//div[@data-test-id='ticket-box_status'])[2]")
	public WebElement Reply_status;
	
	@FindBy(xpath = "(//div[@data-test-id='ticket-box_priority'])[2]")
	public WebElement Reply_priority;
	
	@FindBy(xpath = "//div[contains(@data-test-id,'add-tags')]")
	public WebElement Reply_Tags;
	
	@FindBy(linkText = "Logout")
	public WebElement logout_btn;
	
	
	
}
