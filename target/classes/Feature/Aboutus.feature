@Aboutus
Feature: This is to validate About us page creation


Scenario: Verify About us text is displayed in About us page
Given Launch "<URL>"
When Click on About us Link
Then Verify About us text is displayed in About us page


Scenario: Verify About us video is displayed in About us page
Given Launch "<URL>"
When Click on About us Link
Then Verify About us video is displayed in About us page


Scenario: Verify user able to play About us video
Given Launch "<URL>"
When Click on About us Link  
When Click play video button                                 
Then Verify User is able to watch  About us  video


Scenario: Verify user can click close button to close video
Given Launch "<URL>"
When Click on About us Link
When Click play video button  
When Click close button                                 
Then Verify user can click close button to close video


Scenario: Verify user can click x button to close video
Given Launch "<URL>"
When Click on About us Link
When Click play video button  
When Click x button                                 
Then Verify user can click x button to close video


Scenario: Verify user can maximize about us video
Given Launch "<URL>"
When Click on About us Link
When Click play video button  
When Click Fullscreen button                                 
Then Verify user can maximize about us video


Scenario: Verify user can click picture-in-picture button to watch picture in seperate window
Given Launch "<URL>"
When Click on About us Link
When Click play video button  
When Click picture-in-picture button                                
Then Verify user can watch picture in seperate window


Scenario: Verify user can click mute button to mute the audio
Given Launch "<URL>"
When Click on About us Link
When Click play video button  
When Click mute button                                
Then Verify user can mute the audio