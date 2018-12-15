#Author:bclack@syntaxtech.com
Feature: SignUpWithDT

  Scenario: Sign Up to the FreeCRM
    Given I open the browser
    And I navigate to the FreeCrm
    When I am on the site click on Sign up
    And I provide the following details
      | Edition      | FirstName | LastName | Email           | ConfirmEmail     | UserName      | Password | ConfirmPassword | Company | Phone   |
      | Free Edition | Jimmy     | Doe      | jdoe@test.com   | jdoe@test.com    | jdoe1234567   | test123  | test123         | Syntax  | 1234567 |
      | Free Edition | Moe Moe   | James    | rjames@test.com | rjames.@test.com | rjames1234567 | test123  | test123         | Syntax  | 1234567 |
    Then I quit browser
