package StepDefinitation;

import io.cucumber.java.en.*;

public class Steps {
    @Given("The user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("the user enters valid credentials");
    }
    @And("hits the submit button")
    public void hits_the_submit_button() {
        System.out.println("hits the submit button");
    }
    @Then("The use should be logged in succesfully")
    public void the_use_should_be_logged_in_succesfully() {
        System.out.println("The use should be logged in succesfully");
    }

}
