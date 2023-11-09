Feature: To test Login functionality
Scenario Outline:Test with valid credentials
Given User is on Homepage
When User navigate to Login page
And User enters <username> and <password>
Then Login successful 
Examples: 
|username|password|
|hari|test@123|
|hari1|test@1234|