package Steps;

import BaseLayer.BaseClass;
import PageLayer.SaucedemoLoginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinitionclass extends BaseClass{
	
	public SaucedemoLoginpage sauce;

	@Given("User open the Saucedemo application URL")
	public void user_open_the_saucedemo_application_url() {
		BaseClass.Initiaization();
	  
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		sauce = new SaucedemoLoginpage();
		sauce.userEntersUsernameandpassword("standard_user","secret_sauce");
	}

	@Then("user sorts from and adds three products")
	public void user_sorts_from_and_adds_three_products() {
		sauce.userSortsfromaAddsthreeProducts("Price (low to high)");
	}

	@Then("user clicks on finish")
	public void user_clicks_on_finish() {
		sauce.userClicksOnFinish();
	    
	}

	@Then("user gives the details and confirm the order")
	public void user_gives_the_details_and_confirm_the_order() {
		sauce.userDetailsConfirmorder("harini","vahini","345678");
	   
}




}
