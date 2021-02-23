Feature: search
Scenario: the user is searching product
Given the user is in main page
When the user wants to search product
Then the system displays the product

Scenario: the user is searching invalid product
Given the user is in main page 2
When the user wants to search invalid product
Then the system displays the error message1

Scenario: the user is searching empty product
Given the user is in main page 3
When the user wants to search empty product
Then the system displays the error message2





