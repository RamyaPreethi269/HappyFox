@Demo @Regression
Feature: Happy Fox 

Background:
Given User launch Browser "chrome"
And User Navigate to the Happy fox "Staff_Url"
Then User Verify Login page
And User Enter Username "Username" and Password "Password"
And User Click login Button
Then User Verify Home page
And User Select Statuses in Ticket
Then User Verify Statuses page


@TC-101
Scenario: Login to agent portal with valid credentials.
And User Click the Add Button
And User Enter Status Name "Status_name" , "Behavior" & "Description"
And User Click Add Status Button
Then User Verify Created Status
And User Click & Verify Priorties Page
And User Click the Add Button
And User Enter Priority Name "Priority_Name" & "PriorityDescription"
And User Click Add Priority Button
Then User Verify Priority Name

@TC-102
Scenario: Create a new Ticket
And User Change Ticket status to Make Default
And User Click & Verify Priorties Page
And User Change Ticket Priorty status to Make Default
And User navigate to the Happy fox "Ticket_Url"
Then User Verify Create a New Ticket page
And User enter Subject "Subject","Message","name"&"email"
And User click on Create Ticket Button 
Then User Verify Ticket has been Created
And User navigate to the Happy fox "Staff_Url"
Then User Verify Home page
And User Change the ticket priotity to "Medium"
And User Click ticket Reply Button
And User Click and Select "CannedAction_Msg"
And User Click Apply Button
Then Verify Shipment, Status and Tags

@TC-103
Scenario: Delete status & Priority Ticket
And User Click the Status Created
And User select "Completed" and delete the status
Then User Verify "status" deleted
And User Click & Verify Priorties Page
And User Click the Priorty Created
And User select "Low" and delete the status
Then User Verify "Priorty" deleted
Then User LogOut the Application