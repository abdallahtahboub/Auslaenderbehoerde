# mvn clean verify -Dcucumber.filter.tags=@InvalidCredentials -Dbrowser=chrome -DtestedEnv=STAGING
Feature: Login

  @HomePage @UserAuthentication
  Scenario: Page laods Successfully
    When I navigate to the homepage
    Then The homepage should load

  @ValidCredentials @UserAuthentication
  Scenario: Successful login with valid credentials
    Given I can open the Quota Management Tool
    When I enter a valid username
    And enter a valid password
    And click on the login button
    Then I log in into my account successfully

  @InvalidCredentials @UserAuthentication
  Scenario: Login with invalid credentials
    Given I can open the Quota Management Tool
    When enter an invalid username
    And enter an invalid password
    And click on the login button
    Then the user should not be logged in
    And an error message should be displayed

  @InvalidPasswordValidUsername @UserAuthentication
  Scenario:Login with valid username and invalid password
    Given I can open the Quota Management Tool
    When I enter a valid username
    And enter an invalid password
    And click on the login button
    Then the user should not be logged in
    And an error message should be displayed

  @InvalidUsernameValidPassword @UserAuthentication
  Scenario: Login with invalid email and valid password
    Given I can open the Quota Management Tool
    When enter an invalid username
    And enter a valid password
    And click on the login button
    Then the user should not be logged in
    And an error message should be displayed

  @EmptyUsername @UserAuthentication
  Scenario: Login with empty username field and valid password
    Given I can open the Quota Management Tool
    When the user leaves the username field empty
    And enter a valid password
    And click on the login button
    Then the user should not be logged in
    And a proper error message should be displayed

  @EmptyPassword @UserAuthentication
  Scenario: Login with valid username and empty password field
    Given I can open the Quota Management Tool
    When I enter a valid username
    And the user leaves the password field empty
    And click on the login button
    Then the user should not be logged in
    And an error Message should appear

  @EmptyUsenamePasswor @UserAuthentication
  Scenario: Login with empty username and empty password field
    Given I can open the Quota Management Tool
    When the user leaves the username field empty
    And the user leaves the password field empty
    And click on the login button
    Then the user should not be logged in
    And a proper error message should be displayed