Feature: feature to test login functionality

  Background: user is on login page
    Given open metric app login page

  @smoke
  Scenario: Check login is successful with valid credentials
    When user enters valid email and password
    And click on login button
    Then verify that user is on dashboard

  @regression
  Scenario: With invalid user
    When add email and password
    And press login
    Then verify login page

  Scenario: Move to signup from login
    When click on signup button
    Then verify this is signup page

  Scenario: Verify terms page
    When click on terms
    Then verify that this is terms page

  Scenario: Verify policy page
    When click on policy
    Then verify that this is policy page
