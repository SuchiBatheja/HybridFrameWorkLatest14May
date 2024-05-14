Feature: Home page Feature

Background: 
Given user has already logged in to application
|username|password|
|suchi|rahulshettyacademy|


Scenario: Home Page Title
Given user is on Home Page
When user gets the title of the page
Then page title should be "Rahul Shetty Academy - Login page"


Scenario: Home page Login Section
Given user is on Home Page
When user gets login section
Then logged in message should be displayed

