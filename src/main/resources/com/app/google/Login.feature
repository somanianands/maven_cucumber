Feature: Login Functionlity 

@Regression 
Scenario: Invalid login test 

	Given I go to "http://www.yahoo.co.in" 
	And I enter username as "Regression" 
	And I enter password as "Regression" 
	When I click on Login button 
	Then I should get error message 
	
@Smoke 
Scenario: Invalid login test 

	Given I go to "http://www.google.co.in" 
	And I enter username as "Smoke" 
	And I enter password as "Smoke" 
	When I click on Login button 
	Then I should get error message 
	
	
	
	
	
	
	
	
