Feature: Create Account

Scenario: Valid Registration
Given I open browser
And I navigate to FreeCrm
When I am on the site click on Sign up 
And I click on dropdown and select free edition
And I enter new user information
And I check agree terms box
And I click submit
And I fill in company name and number
And I click on Continue
Then I have successfully created new user
And I quit the browser



