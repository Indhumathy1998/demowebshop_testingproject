Feature: Registering new user 
Scenario: Register users
Given the user is in registration page
When the user wants to register using his credentials
Then the user register account successfully

Scenario: Registering users  using invalid credentials 
Given the user is in register page
When the user wants to register using his invalid credentials
Then the system display error message