@Task1

Feature: Parabank Registration and Login Functionality

  Scenario: Verify user is able to register and login successfully

    Given User launches Parabank application

    When User clicks on Register link

    And User enters all registration details

    And User clicks on Register button

    Then User account should get created successfully

    When User logs out from application

    And User enters valid login credentials

    Then User should login successfully

    And User prints account balance