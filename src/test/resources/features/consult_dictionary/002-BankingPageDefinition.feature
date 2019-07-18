Feature: Created new customer
  As the registered user
  I want to login successfully
	
	Background:
		Given I am on Login page
    When I enter my User ID as '<userID>'
    When I enter my Password as '<userPassword>'
    When I click on Login button
    Then I navigate to Manager Homepage with Welcome text '<Welcome To Manager's Page of Guru99 Bank>'

  Scenario: I can create new customer successfully
    Given I am on Manager Homepage
    When I click on New Customer menu
    Then I navigate to New Customer page
  	When I enter Customer Name as '<Name>'
  	When I select Customer Gender as '<Gender>'
  	When I enter Customer DOB as '<DOB>'
  	When I enter Customer Address as '<Address>'
  	When I enter Customer City as '<City>'
  	When I enter Customer State as '<State>'
  	When I enter Customer PIN as '<PIN>'
  	When I enter Customer Mobile number as '<Mobile number>'
  	When I enter Customer Email as '<Email>'
  	When I enter Customer Password as '<Password>'
  	When I click on Submit button
  	Then I should see Registered Customer page