$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid login",
  "description": "Validating valid login",
  "id": "loginfeature;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter valid \"TheGoat\" and \"lakers248\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I quit browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_the_FreeCrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TheGoat",
      "offset": 15
    },
    {
      "val": "lakers248",
      "offset": 29
    }
  ],
  "location": "LoginSteps.i_enter_valid_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_successfully_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_quit_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Invalid login",
  "description": "Validating invalid login with invalid username and invalid password",
  "id": "loginfeature;invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I navigate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter valid \"\u003cuName\u003e\" and \"\u003cpwd\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I see error message",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I quit browser",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I open it again",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "loginfeature;invalid-login;",
  "rows": [
    {
      "cells": [
        "uName",
        "pwd"
      ],
      "line": 25,
      "id": "loginfeature;invalid-login;;1"
    },
    {
      "cells": [
        "Messi",
        "liverpool"
      ],
      "line": 26,
      "id": "loginfeature;invalid-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Invalid login",
  "description": "Validating invalid login with invalid username and invalid password",
  "id": "loginfeature;invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I navigate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter valid \"Messi\" and \"liverpool\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I see error message",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I quit browser",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I open it again",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_the_FreeCrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Messi",
      "offset": 15
    },
    {
      "val": "liverpool",
      "offset": 27
    }
  ],
  "location": "LoginSteps.i_enter_valid_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_see_error_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_quit_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 28,
  "name": "Invalid password",
  "description": "Validating invalid login with valid username and invalid password",
  "id": "loginfeature;invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I navigate to the FreeCrm",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter valid \"TheGoat\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I still see sign up link",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I quit browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_the_FreeCrm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TheGoat",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 29
    }
  ],
  "location": "LoginSteps.i_enter_valid_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_still_see_sign_up_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_quit_browser()"
});
formatter.result({
  "status": "skipped"
});
});