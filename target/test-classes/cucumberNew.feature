Feature: Search

  Scenario: Search a product
    Given I am on the House and Garden Page
    When I Search КАСТРЮЛЯ
    And I click on loop button
    Then The product with the name Printed Summer Dress is in the cart

