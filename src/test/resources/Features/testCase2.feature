Feature: Login
  Scenario: Login User with correct email and password
    Given Verify that home page is visible
    And Verify Login to your account is visible
    And Click on SignUp-Login button
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click delete acount button
    And Verify that ACCOUNT DELETED! is visible