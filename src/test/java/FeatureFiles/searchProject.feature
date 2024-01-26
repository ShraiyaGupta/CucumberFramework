Feature: GreenKart Step Definition

Scenario: Validate Greenkart and offers page
Given I go to Greenkart Landing page 
And I enter "tom" on greenkart Landing page search filter
Then I click on Top Deals and go to offers page
Then I enter "tom" on greenkart offers page search filter
Then I validate that Top Deals and offers page shows same result