Feature: Application Login
Scenario Outline: Home page login
Given Initialize browser with Chrome
And Navigate to "https://login.salesforce.com/" site
When User enters <username> and <password> and logs in
Then Verify that user is successfully signed in

Examples:

|username| |password|
|test1@123| |secure@12345|
|test2@123| |secure@12345|