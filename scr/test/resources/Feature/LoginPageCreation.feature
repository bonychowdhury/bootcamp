@Log
Feature: This is to validate Login Page Creation Functionality

@logD
Scenario: Verify log in text is displayed in the Log In page
Given Launch the "<URL>"
When Click on login link
Then Verify log in text is displayed in the Log In page

@logP
Scenario: Verify user can login using valid credentials
Given Launch the "<URL>"
When Click on login link
When Enter username and password
When Click on login button in login page
Then Verify user can login using valid credentials

@logN1
Scenario: Verify user cannot login using valid username and invalid password
Given Launch the "<URL>"
When Click on login link
When Enter username and invalid password
When Click on login button in login page
Then Verify user cannot login using invalid credentials

@logN2
Scenario: Verify user cannot login using emptycredentials
Given Launch the "<URL>"
When Click on login link
When Click on login button in login page
Then Verify user cannot login using invalid credentials

@logN3
Scenario: Verify user cannot login using invalid username and valid password
Given Launch the "<URL>"
When Click on login link
When Enter invalid username and valid password
When Click on login button in login page
Then Verify user cannot login using invalid credentials

@logN4
Scenario: Verify user cannot login using invalid username and invalid password
Given Launch the "<URL>"
When Click on login link
When Enter invalid username and invalid password
When Click on login button in login page
Then Verify user cannot login using invalid credentials

@logN5
Scenario: Verify user cannot login using empty username and invalid password
Given Launch the "<URL>"
When Click on login link
When Enter empty username and invalid password
When Click on login button in login page
Then Verify user cannot login using invalid credentials

@logN6
Scenario: Verify user cannot login using valid username and empty password
Given Launch the "<URL>"
When Click on login link
When Enter valid username and empty password
When Click on login button in login page
Then Verify user cannot login using invalid credentials

