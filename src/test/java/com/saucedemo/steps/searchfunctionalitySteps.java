package com.saucedemo.steps;

import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class searchfunctionalitySteps {

    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password)  {
        new HomePage().loginApplication(username, password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickonloginbutton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String msg) {
        new ProductPage().sortproductbyHighToLow(msg);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
         new ProductPage().selectTheProductAndAddToCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().openTheShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckOutPage().goToCheckOutAndOpen();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String fName, String lName, String zipCode)  {
       new CheckOutPage().enterFirsatName(fName);
       new CheckOutPage().enterLastName(lName);
       new CheckOutPage().enterZipPostalCode(zipCode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickoncontinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickonFinishButton();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String  errorMsg)  {
        Assert.assertEquals("Error message not display",errorMsg,new CheckOutPage().getErrorMessage());
    }
}
