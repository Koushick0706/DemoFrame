@All
Feature: To verify the negative login
  
 @Invalid_Login
 Scenario: To verify the invalid login cerdentails
    Given The user is able to login with valid "username" and with valid "password"
    And click on login button
    Then validate error message is displayed
    And Logout of The application
    

 @Invalid_purchase
 Scenario: Perform cart for unregistered user
    Given the user search for a product
    Then verify product is displayed
    And click on the product
    When user perfroms cart operation
    Then Application should navigate to user registration
    
 @Invalid_Registration
  Scenario: Register a user without providing address details
    Given user is able to click on sign in option
    Then Verify the user info page is displayed
    And  click on register
    Then Error message should be displayed

    
