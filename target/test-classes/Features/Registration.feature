Feature: Create Account

  Scenario Outline: Valid Registration
    Given I open the browser
    And I navigate to the FreeCrm
    When I am on the site click on Sign up
    And I click on dropdown and select free edition
    And I enter "<firstName>" , "<lastName>" and "<email>"
    And I enter credentials "<uName>" and "<pwd>"
    And I check agree terms box
    And I click submit
    And I enter company information "<companyName>" and "<phoneNumber>"
    And I click submit
    And I click on continue registration
    Then I have successfully created new user
    Then I quit the browser

    Examples: 
      | firstName | lastName | email             | uName    | pwd      | compayName | phoneNumber |
      | Lebron    | James    | jjohnson@test.com | jj123456 | jj123456 | Syntax     |     1234567 |
