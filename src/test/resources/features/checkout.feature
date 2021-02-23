Feature: checkout
Scenario: the user wants to place the order 
Given the user is in shopping cart 
When the user checkout
Then the system displays order placed
