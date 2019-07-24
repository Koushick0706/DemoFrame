package org.cucumber.Stepdef;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.cucumber.Browserconfig.Browserconfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Browserconfig {
	WebDriver driver;
	Properties prop;

	@Before
	public void startReport() throws IOException {	
		prop = new Properties();
		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\koushicks\\eclipse-workspace\\HybridFramework\\role.properties"));
		prop.load(reader);
		System.out.println(prop);
		driver = choosebrowser("Chrome", "https://github.com/login");
	}

	@Given("^The user is able to login with valid \"([^\"]*)\" and with valid \"([^\"]*)\"$")
	public void the_user_is_able_to_login_with_valid_and_with_valid(String arg1, String arg2) throws Throwable {
		
	//Please delete this below code and paste your code.	
		String us = prop.getProperty(arg1);
		String pwd = prop.getProperty(arg2);
		Thread.sleep(2000);
		WebElement usernamefield = driver.findElement(By.name("login"));
		if(usernamefield.isDisplayed())
		{	
		usernamefield.sendKeys(us);
		}
		else
		{
			System.out.println("No field found");
		}	
		WebElement passwordfield = driver.findElement(By.name("password"));
		passwordfield.sendKeys(pwd);
		WebElement loginbutton = driver.findElement(By.name("commit"));
		loginbutton.click();

	}

	@Given("^i verify the title and url of the page$")
	public void i_verify_the_title_and_url_of_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^Click on the search icon and Search for a product$")
	public void click_on_the_search_icon_and_Search_for_a_product() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^filter the searched product in the application$")
	public void filter_the_searched_product_in_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^add it to favorites section$")
	public void add_it_to_favorites_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^Goto favorites section in the application$")
	public void goto_favorites_section_in_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Click on The Product and add it to cart$")
	public void click_on_The_Product_and_add_it_to_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}
	
	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^validate error message is displayed$")
	public void validate_error_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@When("^user search for a product$")
	public void user_search_for_a_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^verify product is displayed$")
	public void verify_product_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^click on the product$")
	public void click_on_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user perfroms cart operation$")
	public void user_perfroms_cart_operation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Application should navigate to user registration$")
	public void application_should_navigate_to_user_registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("^click on sign in option$")
	public void click_on_sign_in_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Verify the user info page is displayed$")
	public void verify_the_user_info_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Addres of the user is missing$")
	public void addres_of_the_user_is_missing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^click on register$")
	public void click_on_register() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Error message should be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	@Then("^Logout of The application$")
	public void logout_of_The_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
