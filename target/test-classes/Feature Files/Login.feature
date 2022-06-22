
Feature: To check login functions

  Background: 
    Given To open Chrome Browser

@vinoth
  Scenario: To pass valid username and valid password
    When To pass valid username nd password
      | username | rolls royce |
      | password | ghost       |
    Then To click LoginButton
@mini
  Scenario: To pass invalid username and invalid password
    When To pass invalid username nd invalid password
      | moive  | lang  | hero  |
      | vikram | tamil | kamal |
      | beast  | tamil | vijay |
    Then To click LoginButton
