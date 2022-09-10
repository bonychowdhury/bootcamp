@contact
Feature: This is to validate Contact Page Functionality


Scenario: Verify Contact Link is clickable
Given Launch the "<URL>"
When Click on Contact link
Then Verify User can visit Contact page after clicking Contact link

Scenario: Verify Contact Email field is available in Contact page
Given Launch the "<URL>"
When Click on Contact link
Then Verify User can see Contact Email field in Contact Page

Scenario: Verify Contact Name field is available in Contact page
Given Launch the "<URL>"
When Click on Contact link
Then Verify User can see Contact Name field in Contact Page

Scenario: Verify Message field is available in Contact page
Given Launch the "<URL>"
When Click on Contact link
Then Verify User can see Message field in Contact Page


Scenario: Verify Send message button is clickable
Given Launch the "<URL>"
When Click on Contact link
When Click on Send Message button
Then Verify pop up text is displayed after clicking Send Message button


Scenario: Verify user can send message after once click Send message button
Given Launch the "<URL>"
When Click on Contact link
When Enter Contact fields credentials
When Click on Send Message button
Then Verify user can send message after once click Send message button


Scenario: Verify user cannot send message with empty contact fiels credentials
Given Launch the "<URL>"
When Click on Contact link
When Click on Send Message button
Then Verify user cannot send message with empty contact fiels credentials