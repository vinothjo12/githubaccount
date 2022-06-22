Feature: To check fb 1st page

@jo
  Scenario: To click create new account and sign button
    Given to launch chrome browser
    When to click create new button
    And pass fb first name
      | aala | vino | car |
    And pass sur name
      | audi | a4       | multithronic |
      | bmw  | x series | s drive     |
    Then to click signup button
