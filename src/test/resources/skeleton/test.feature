 Feature: Validation of Login Functionality
	
	@SmokeTest
  Scenario: Verification of Login Functionality for Authenticated User
    Given I login with userid as "user-id" and password as "user-password".
    When I am redirected to Home page
    Then I see my image and Logout button.
    
	Scenario: Verification of Login Functionality for Non-Authenticated User
    Given I login with userid as "test-user-id" and password as "password".
    When I am redirected to Home page
    Then I see my image and Logout button.
  
  @RegressionTest  
  Scenario Outline: Verification of Login Functionality for Multiple Authenticated Users
    Given I login with userid as <userId> and password as <Password>.
    When I am redirected to Home page
    Then I see my image and Logout button.
    
    Examples: 
    |userId | Password |
    |test-1		|	password|
		|tst-2|	password|
