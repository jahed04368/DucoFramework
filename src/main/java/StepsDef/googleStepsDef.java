package StepsDef;

import Utilities.basePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleStepsDef {

    @Given("user is on Google homepage")
    public void user_is_on_Google_homepage() {

        basePage openBrowser = new basePage();
        openBrowser.openGoogleBrowser();
    }

    @When("the user enters {string}")
    public void the_user_enters(String string) {
        basePage openBrowser = new basePage();
        openBrowser.userSearches();

    }

    @When("User asserts google logo")
    public void user_asserts_google_logo() {
        basePage openBrowser = new basePage();
        openBrowser.assertsLogo();

    }

    @When("user clicks search")
    public void user_clicks_search() {
        basePage openBrowser = new basePage();
        openBrowser.searchLink();
    }

    @When("User is shown their search")
    public void user_is_shown_their_search() {
        basePage openBrowser = new basePage();
        openBrowser.dukoPage();

    }

    @Then("user clicks on their desired site")
    public void user_clicks_on_their_desired_site() {
//        basePage openBrowser =new basePage();
//        openBrowser.openGoogleBrowser();

    }

    @Then("user deletes last 1 hour activity")
    public void deletesCookies() {
        basePage openBrowser =new basePage();
        openBrowser.deletesCookies();

    }
}
