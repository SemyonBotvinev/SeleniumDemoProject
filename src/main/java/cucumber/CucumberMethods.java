package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HouseAndGardenPage;
import pageobjects.old.HomePage;
import pageobjects.old.OrderPage;

public class CucumberMethods extends CucumberRunner{
    @Given("I am on the House and Garden Page")
    public void iAmOnTheHouseAndGardenPage(){
        new HouseAndGardenPage(driver, true).go();
    }

    @When("^I search ([^\"]*)$")
    public void iFillSearchFieldWith(String query) {
        new HouseAndGardenPage(driver, true).search(query);
    }

    @And("I click on loop button")
    public void iClickOnLoopButton() {
        new HomePage(driver, true).clickLoopButton();
    }

    @And("^I click the product with index ([^\"]*)$")
    public void iClickOnTheProductWithIndex(int index) {
        new HomePage(driver, true).clickLoopButton();
    }

    @And("I click the add to cart button")
    public void iClickAddToCartButton() {
        new HomePage(driver, true).clickLoopButton();
    }

    @And("I click Proceed to checkout button")
    public void iClickProceedToCheckoutButton() {
        new OrderPage(driver, true).proceedToCheckoutClick();
    }

    @Then("^The product with the name ([^\"]*) is in the cart$")
    public void  checkProductInCart(String productName){
        new HomePage(driver, true).go();
    }
}
