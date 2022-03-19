@regression
Feature: Policy
  Story example

  Background:
    Given I have logged in to the application

  @regression
  Scenario: Create policy
    Given I create a policy
      | Product |Multi |
      | Brand   |a     |

  @regression
  Scenario: Create driver
    Given I create a driver
      | firstName | lastName | birthDate  |
      | ash       | k        | 1911-03-20 |
      | ashok     | k        | 1916-09-13 |

  @regression
  Scenario Outline: Create more policies
    Given I create more policies
      | Options | Values    |
      | Product | <Product> |
      | Brand   | <Brand>   |

    Examples:
      | Product | Brand |
      | Multi   | a     |
      | Single  | a     |