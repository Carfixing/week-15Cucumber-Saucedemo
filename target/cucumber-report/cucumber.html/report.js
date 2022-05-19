$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5517999700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by Price \"high to low\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"Palak\", lastName \"Shah\" and zipPostalCode \"Ub87LD\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \"Thank you for your order\"",
  "keyword": "Then "
});
formatter.match({
  "location": "searchfunctionalitySteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 286965800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "searchfunctionalitySteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 481251900,
  "status": "passed"
});
formatter.match({
  "location": "searchfunctionalitySteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 347162700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "high to low",
      "offset": 32
    }
  ],
  "location": "searchfunctionalitySteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 402344300,
  "status": "passed"
});
formatter.match({
  "location": "searchfunctionalitySteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 210973300,
  "status": "passed"
});
formatter.match({
  "location": "searchfunctionalitySteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 136375900,
  "status": "passed"
});
formatter.match({
  "location": "searchfunctionalitySteps.iGoToCheckout()"
});
formatter.result({
  "duration": 107273800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Palak",
      "offset": 27
    },
    {
      "val": "Shah",
      "offset": 45
    },
    {
      "val": "Ub87LD",
      "offset": 70
    }
  ],
  "location": "searchfunctionalitySteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 531187500,
  "status": "passed"
});
formatter.match({
  "location": "searchfunctionalitySteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 131022500,
  "status": "passed"
});
formatter.match({
  "location": "searchfunctionalitySteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 99074300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you for your order",
      "offset": 33
    }
  ],
  "location": "searchfunctionalitySteps.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 40523700,
  "error_message": "org.junit.ComparisonFailure: Error message not display expected:\u003cT[hank you for your order]\u003e but was:\u003cT[HANK YOU FOR YOUR ORDER]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.saucedemo.steps.searchfunctionalitySteps.iShouldBeAbleToSeeMessage(searchfunctionalitySteps.java:68)\r\n\tat ✽.Then I should be able to see message \"Thank you for your order\"(purchase.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1126783200,
  "status": "passed"
});
});