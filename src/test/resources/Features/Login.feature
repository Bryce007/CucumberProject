Feature: LoginFeature

Scenario: Valid login
Given I open the browser
And I navigate to the FreeCrm
When I enter valid username and password
And I click login button
Then I successfully logged in 
And I quit browser

Scenario: Invalid login
Given I open the browser
And I navigate to the FreeCrm
When I enter invalid username and password
And I click login button
Then I see error message
And I quit browser