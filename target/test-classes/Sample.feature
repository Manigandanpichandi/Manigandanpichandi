@Feature1
Feature: To validate the login functionality of the face book

Background:
Given To launch the chrome browser and maximize window

@Smoke
Scenario: To validate login with valid username and invalid password
Given To launch the chrome browser and maximize window
When To launch URL of the face book application
And To pass the valid user name in email field
And TO pass the invalid password in password field
And To click the login button
And To check whether navigate to the home page or not
Then To close the browser
||||

