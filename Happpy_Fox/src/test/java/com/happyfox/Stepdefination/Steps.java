package com.happyfox.Stepdefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.happyfox.Baseclass.Baseclass;

import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends Baseclass{

PageObjectManager obj=new PageObjectManager(driver);

@Given("User launch Browser {string}")
public void user_launch_browser(String string) {
	  browserlaunch(string);
}
@Given("User Navigate to the Happy fox {string}")
public void user_Navigate_to_the_happy_fox(String string) throws IOException, InterruptedException {
	Thread.sleep(5000);
getURL(PropertyRead(string));    
}

@Given("User navigate to the Happy fox {string}")
public void user_navigate_to_the_happy_fox(String string) throws IOException, InterruptedException {
	Thread.sleep(5000);
Naviagte_URL(PropertyRead(string));    
}
@Then("User Verify Login page")
public void user_verify_login_page() {
    Assert.assertTrue(elementIsDisplayed(obj.getLoginPage().happyFox_logo));
}
@Then("User Enter Username {string} and Password {string}")
public void user_enter_username_and_password(String string, String string2) throws IOException {
    elementSendKeys(obj.getLoginPage().Username, PropertyRead(string));
    elementSendKeys(obj.getLoginPage().Password, PropertyRead(string2));
}
@Then("User Click login Button")
public void user_click_login_button() {
    elementClick(obj.getLoginPage().Login_btn);
    
}
@Then("User Verify Home page")
public void user_verify_home_page() {
Assert.assertTrue(elementIsDisplayed(obj.getHomePage().Profile_image));  
}

@Then("User Select Statuses in Ticket")
public void user_select_statuses_in_ticket() {
	mouseHover(obj.getHomePage().Tickets_Menu);
	elementClick(obj.getHomePage().Statuses_SubMenu);
}

@Then("User Verify Statuses page")
public void user_verify_statuses_page() {
    Assert.assertTrue(elementIsDisplayed(obj.getSPpage().Status_Heading));
}

@Then("User Click the Add Button")
public void user_click_the_add_button() {
	elementClick(obj.getSPpage().add_button);  
}
@Then("User Enter Status Name {string} , {string} & {string}")
public void user_enter_status_name(String string, String string2, String string3) throws IOException, InterruptedException {
	Thread.sleep(3000);
	ASendkeys(obj.getSPpage().StatusName, PropertyRead(string));
Selectdrop(obj.getSPpage().behavior_dropdown,PropertyRead(string2));
elementSendKeys(obj.getSPpage().add_des, PropertyRead(string3));
}

@Then("User Click Add Status Button")
public void user_click_add_status_button() {
	elementClick(obj.getSPpage().Add_status);
}
@Then("User Verify Created Status")
public void user_verify_created_status() {
	  Assert.assertTrue(elementIsDisplayed(obj.getSPpage().Verify_Status_Name));
}
@Then("User Click & Verify Priorties Page")
public void user_click_verify_priorties_page() {
    elementClick(obj.getSPpage().priority);
    Assert.assertTrue(elementIsDisplayed(obj.getPriorityPage().PriorityHeading));
}
@Then("User Enter Priority Name {string} & {string}")
public void user_enter_priority_name(String string, String string2) throws InterruptedException, IOException {
   Thread.sleep(3000);
elementSendKeys(obj.getPriorityPage().PriorityName, PropertyRead(string));
elementSendKeys(obj.getPriorityPage().Description, PropertyRead(string2));
	
}

@Then("User Click Add Priority Button")
public void user_click_add_priority_button() {
   elementClick(obj.getPriorityPage().Add_Priority);
}
@Then("User Verify Priority Name")
public void user_verify_priority_name() {
    Assert.assertTrue(elementIsDisplayed(obj.getPriorityPage().Verify_Priority_Name));
}
@Then("User Verify Create a New Ticket page")
public void user_verify_create_a_new_ticket_page() {
	 Assert.assertTrue(elementIsDisplayed(obj.getTicketCreation().CreateTicket_heading));  
}
@Then("User enter Subject {string},{string},{string}&{string}")
public void user_enter_subject(String string, String string2, String string3, String string4) throws IOException {
   elementSendKeys(obj.getTicketCreation().subject, PropertyRead(string));
   elementSendKeys(obj.getTicketCreation().Message_txtbx, PropertyRead(string2));
   elementSendKeys(obj.getTicketCreation().name, PropertyRead(string3));
   elementSendKeys(obj.getTicketCreation().email, PropertyRead(string4));
   
}
@Then("User click on Create Ticket Button")
public void user_click_on_create_ticket_button() {
	 elementClick(obj.getTicketCreation().Createticket_btn);
}
@Then("User Change the ticket priotity to {string}")
public void user_change_the_ticket_priotity_to(String string) throws IOException, InterruptedException {
   elementClick( driver.findElement(By.xpath("//a[text()='"+PropertyRead("Subject")+"']//following::div[text()='priority'][1]")));
Thread.sleep(2000);
   ASendkeys(obj.getHomePage().TicketPriority_searchbx, string);
   Thread.sleep(2000);
   AEnter(obj.getHomePage().TicketPriority_searchbx);
}

@Then("User Verify Ticket has been Created")
public void user_verify_ticket_has_been_created() {
	 Assert.assertTrue(elementIsDisplayed(obj.getTicketCreation().CreateTicket_SuccessMSG));  
}
@Then("User Click ticket Reply Button")
public void user_click_ticket_reply_button() throws InterruptedException {
	Thread.sleep(5000);
	 elementClick(obj.getHomePage().Tickets_Reply);
	 Thread.sleep(5000);
}
@Then("User Click and Select {string}")
public void user_click_and_select(String string) throws IOException, InterruptedException {
	 elementClick(obj.getHomePage().Reply_addMsg);
	 Thread.sleep(2000);
	 ASendkeys(obj.getHomePage().CannedActions_SearchBx, PropertyRead(string));
	 Thread.sleep(5000);
	 AEnter(obj.getHomePage().CannedActions_SearchBx);
}
@Then("User Click Apply Button")
public void user_click_apply_button() {
	 JSclcick(obj.getHomePage().CannedActions_Apply);
}
@Then("Verify Shipment, Status and Tags")
public void verify_shipment_status_and_tags() {
	 Assert.assertTrue(elementIsDisplayed(obj.getHomePage().Reply_status));  
	 Assert.assertTrue(elementIsDisplayed(obj.getHomePage().Reply_priority));  
	 Assert.assertTrue(elementIsDisplayed(obj.getHomePage().Reply_Tags));  

}

@Then("User Change Ticket status to Make Default")
public void user_change_ticket_status_to_make_default() throws InterruptedException {
	 Thread.sleep(2000);
	 mouseHover(obj.getSPpage().Verify_Status_Name);
	 Thread.sleep(2000);
	 elementClick(obj.getSPpage().Ticket_MakeDefault);
	 Thread.sleep(3000);
}

@Then("User Change Ticket Priorty status to Make Default")
public void user_change_ticket_priorty_status_to_make_default() throws InterruptedException {
	 Thread.sleep(2000);
	 mouseHover(obj.getPriorityPage().Verify_Priority_Name);
	 Thread.sleep(2000);
	 elementClick(obj.getPriorityPage().Priority_MakeDefault);
	 Thread.sleep(3000);
	 
}
@Then("User LogOut the Application")
public void user_log_out_the_application() throws InterruptedException {
	Thread.sleep(3000);
	elementClick(obj.getHomePage().Profile_image);
	elementClick(obj.getHomePage().logout_btn);
}

@Then("User Click the Status Created")
public void user_click_the_status_created() throws InterruptedException {
   elementClick(obj.getSPpage().Verify_Status_Name);
   Thread.sleep(3000);
   
}
@Then("User select {string} and delete the status")
public void user_select_and_delete_the_status(String string) throws InterruptedException {
	elementClick(obj.getSPpage().Delete);
	Thread.sleep(2000);
	Selectdrop(obj.getSPpage().Choose, string);
	Thread.sleep(2000);
	elementClick(obj.getSPpage().Ticket_Delete_btn);
	 
}

@Then("User Verify {string} deleted")
public void user_verify_deleted(String key) throws InterruptedException {
	Thread.sleep(20000);
   switch (key) {
case "status":
	Assert.assertFalse(elementIsDisplayed(obj.getSPpage().Verify_Status_Name));
	break;
case "Priorty":
	Assert.assertFalse(elementIsDisplayed(obj.getPriorityPage().Verify_Priority_Name));
	break;

}
}
@Then("User Click the Priorty Created")
public void user_click_the_priorty_created() {
    elementClick(obj.getPriorityPage().Verify_Priority_Name);
}
}
