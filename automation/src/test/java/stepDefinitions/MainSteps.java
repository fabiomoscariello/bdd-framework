package stepDefinitions;

import java.util.Iterator;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
    @Given("User is on NetBanking landing Page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on NetBanking landing Page");
    }
    @When("^User login into Application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User login into Application with " + username +" and password " + password);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home Page is displayed");

    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");

    }

    @Given("User is on Practice landing Page")
public void user_is_on_practice_landing_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Practice landing Page");
}
@When("User Signup into Application")
public void user_signup_into_application(List<String> data) {
    Iterator<String> iterator = data.iterator();
    int index = 0;
    while(iterator.hasNext()){
        System.out.println("data i: " + index + " value: " + iterator.next());
        index++;
    }

}
}
