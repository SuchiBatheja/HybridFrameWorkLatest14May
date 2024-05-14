Feature: Login page Feature

Scenario: Login Page Title
Given user is on Login Page
When user gets the title of the page
Then page title should be "Rahul Shetty Academy - Login page"


Scenario: Forgot Password Link
Given user is on Login Page
Then forgot your password link should be displayed


Scenario: Login with correct credentials
Given user is on Login Page
When user enters username "suchi"
And user enters password "rahulshettyacademy"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Rahul Shetty Academy - Login page123"