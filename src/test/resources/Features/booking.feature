
@tag
Feature: Validating Adactin login functionality
Background:
    Given Launch the Browser
    And open the adactin page

  @tag1
  Scenario: Validating Adactin login with valid credential
   
    When Enter the "<username>" and "<password>"
    And click the login button
    Then I validate the outcomes
    And close the browser
    
    Examples:
    |username|password|
    |RavikumarNataraj|123456|
    |admin|admin123|
    |admin|admin123|
    |ravikumar|ravi123|
 