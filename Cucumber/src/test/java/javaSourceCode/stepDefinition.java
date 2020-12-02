package javaSourceCode;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.*;
import resources.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends baseClass{
	public WebDriver driver;	
	@Given("^User is on ClearTrip website$")
	public void user_is_on_ClearTrip_website() throws IOException {
		driver=initialiseDriver();
		driver.get("https://www.cleartrip.com");
	}

	@When("^User enters Three words of desired FROM City name$")
	public void user_enters_Three_words_of_desired_FROM_City_name() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		fromCity fc = new fromCity(driver);
		fc.SrcFinder().click();
		fc.SrcFinder().sendKeys(fc.threeWordSource());
	}

	@Then("^All the city names which were starting with those three letters should get displayed$")
	public void all_the_city_names_which_were_starting_with_those_three_letters_should_get_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^It should allow user to select desired From city from the dropdown$")
	public void it_should_allow_user_to_select_desired_From_city_from_the_dropdown() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		fromCity fc = new fromCity(driver);
		fc.SrcSelection();
	}
	
	@When("^User enters Three words of desired TO City name$")
	public void user_enters_Three_words_of_desired_TO_City_name() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		toCity tc = new toCity(driver);
		tc.destFinder().sendKeys(tc.destiThreeWords());
	}
	
	@Then("^It should allow user to select desired To city from the dropdown$")
	public void it_should_allow_user_to_select_desired_To_city_from_the_dropdown() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		toCity tc = new toCity(driver);
		tc.desiredDesti();
	}
}
