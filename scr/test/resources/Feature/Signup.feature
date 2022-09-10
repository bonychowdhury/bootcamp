Feature: This is to validate New User Sign-up page creation

@Signup+
Scenario: Verify User able to register once click Sign up using Valid Sign up credentials
Given Launch "<URL>"
When Click on Sign up Link
When New user enter Unique Username and Password
When User click on Sign up button
Then Verify User able to register sucessfully


@Signup-
Scenario: Verify User not able to sign up using Existing (Username)
Given Launch "<URL>"
When Click on Sign up Link
When New user enter existing Username and Password
When User click on Sign up button
Then Verify User not able to register sucessfully