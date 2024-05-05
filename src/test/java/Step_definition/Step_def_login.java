package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.internal.Throwables;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
public class Step_def_login {

    @Given("^Customer is in login page$")
    public void Customer_is_in_login_page() throws Throwable
    {
        System.out.println("Customer logged in succesfully");
    }
    @When("^Customer login with username and password$")
    public void Customer_login_with_username_and_password() throws Throwable
    {
        System.out.println("customer login succesfully with username and password");
    }

    @Then("^Customer will see the home page$")
    public void customer_will_see_the_home_page() throws Throwable
    {
        System.out.println("customer is seeing the home page");
    }
    @And("Customer name with card details are shown")
    public void Customer_name_with_card_details_are_shown() throws Throwable
    {

    }

}
