Feature: Vehicle Info search
 
 Scenario: I should be able to check vehicle information
 	Given I visit the dvla site
    And I start the process
    And User enters the registration of the vehicle for test data
    Then User confirms the basic details of the vehicle
    Then User sees the full vehicle details

