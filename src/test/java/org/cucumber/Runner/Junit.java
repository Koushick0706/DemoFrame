package org.cucumber.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/ValidPurchase.feature",glue= {"org.cucumber.Stepdef"},dryRun=false,tags="@Login_to_application")
public class Junit {
	
public void setup()
{
	System.out.println("Starting the test");
}

}
