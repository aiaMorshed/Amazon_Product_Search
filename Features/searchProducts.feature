Feature: searching products

Scenario Outline: Searching products on amazon

Given I am on the amazon homepage

When I enter the "<products_name>" in the search bar

And I click on the search bar

Then I can see the search result successfully 

Examples:

| products_name|
| computer     |
| Pen          |
| Mouse        |