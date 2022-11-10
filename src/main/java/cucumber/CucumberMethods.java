package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HouseAndGardenPage;


public class CucumberMethods extends CucumberRunner{
    @Given("I am on the House and Garden Page")
    public void iAmOnTheHouseAndGardenPage(){
        new HouseAndGardenPage(driver, true).go();
    }

    @When("^I search ([^\"]*)$")
    public void iFillSearchFieldWith(String query) {
        new HouseAndGardenPage(driver, true).putValueIntoSearchField(query);
    }

}
