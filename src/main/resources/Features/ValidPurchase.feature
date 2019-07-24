@All
Feature: Login into filpkart.com and search for an item and add it to cart

@Login_to_application
Scenario: Checking The Login of The application
Given The user is able to login with valid "username" and with valid "password"
And   i verify the title and url of the page
Then  Logout of The application 
@Search_Filter
Scenario: Search for product in the site
Given The user is able to login with valid "username" and with valid "password"
And  Click on the search icon and Search for a product
Then filter the searched product in the application
And add it to favorites section
Then Logout of The application

@Add_to_Cart
Scenario: Add The product to cart from Favorites
Given The user is able to login with valid "username" and with valid "password"
And Goto favorites section in the application
Then Click on The Product and add it to cart
And Logout of The application

   
      




    