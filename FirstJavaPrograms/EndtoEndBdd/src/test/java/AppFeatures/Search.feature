Feature: Amazon search
@SmokeTest
Scenario: Search a product
Given I have a search field on amazon page
When I search for a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed

@~Regression
Scenario: Search a product
Given I have a search field on amazon page
When I search for a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed

@~Regression
Scenario: Search a product
Given I have a search field on amazon page
When I search for a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed

@~Sanity
Scenario: Search a product
Given I have a search field on amazon page
When I search for a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed