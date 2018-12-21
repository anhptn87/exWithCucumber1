Feature: log in 

@loginlazada
Scenario: log in lazada with facebook
Given I am at lazada log in page
When I click on Facebook button and enter my credentail
Then I can log in successfully
