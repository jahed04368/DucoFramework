package StepsDef;

import Locators.Locators;
import Locators.LocatorsUtility;
import Utilities.basePage;
import Utilities.waitFunction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class feelingLucky {


    @When("user clicks on feeling lucky")
    public void user_clicks_on_feeling_lucky() {

        basePage openBrowser =new basePage();
        openBrowser.feelingLucky();
    }

    @Then("user asserts intro text")
    public void user_asserts_intro_text() {
        basePage openBrowser =new basePage();
        openBrowser.feelingLuckyAssert();

    }


}
