Feature: LoginFeature

  Scenario: Valid login
    Validating valid login

    Given I open the browser
    And I navigate to the FreeCrm
    When I enter valid "TheGoat" and "lakers248"
    And I click login button
    Then I successfully logged in
    And I quit browser

  Scenario Outline: Invalid login
    Validating invalid login with invalid username and invalid password

    Given I open the browser
    And I navigate to the FreeCrm
    When I enter valid "<uName>" and "<pwd>"
    And I click login button
    Then I see error message
    Then I quit browser
    

    Examples: 
      | uName | pwd       |
      | Messi | liverpool |

  Scenario: Invalid password
    Validating invalid login with valid username and invalid password

    Given I open the browser
    And I navigate to the FreeCrm
    When I enter valid "TheGoat" and "password"
    And I click login button
    Then I still see sign up link
    And I quit browser
