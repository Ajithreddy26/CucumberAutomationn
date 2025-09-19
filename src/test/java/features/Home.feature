@HomePage
Feature: Verifying Demo blaze homepage

  Background: 
    Given user  open the application url
   @smoke
  Scenario: Check whether user is able to accces the demoblaze application
    Then user should able to find the page title
  @smoke
  Scenario: Check whether user is able to add a product into the cart
    When user clicks on any product in the homepage
    And navigates to respective  page
    And click on add cart
    Then product should add to the cart successfully
@sanity
  Scenario: Verify the links or contents displaying in the navigation section
    When access the homepage
    Then display the below contents  or links
      | Home  | Contact | About us | Cart | Log in | Sign up |
@regression
  Scenario Outline: Check whether user is able to login to the application
    # Given user  open the application url
    When user clicks on login link
    And enters "<username>" "<password>" into the input fields
    Then user should logged in succcesfully

    Examples: 
      | username | password |
      | demo     | demo     |
      | test     | demo     |
