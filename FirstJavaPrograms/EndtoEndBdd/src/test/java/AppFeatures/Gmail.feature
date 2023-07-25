Feature: Title of your feature
I want to use this template for my feature file

Background:
Given I am on Gmail login page
When I specify Username and Password
And Click on SignIn button

Scenario: Create new message from data table
When I am on New Email Page
And I specify the following details
| To1 | Subject |
| Person1@email.com | Person1 subject |
| Person2@email.com | Person2 subject |