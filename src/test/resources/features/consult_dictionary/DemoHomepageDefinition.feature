Feature: Register my email address for Guru Banking
  In order to accessing Guru Banking page
  I access the Demo Homepage for registering my email address

  @Homepage
  Scenario: Register Email Address 'abc@gmail.com' at Demo Homepage
    Given I open the Demo Homepage
    When I enter my email address 'abc@gmail.com'
    When I click on Submit button
    Then I get the User ID '<userID>' 
    Then I get the User Password '<userPassword>'