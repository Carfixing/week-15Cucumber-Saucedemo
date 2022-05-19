package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    List<WebElement> selectProduct;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement selectProductandAddToCart;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement openShoppingCart;

    public void sortproductbyHighToLow(String sort) {
    log.info("select from dropdown list" + selectProduct.toString());
    for (WebElement List : selectProduct) {
        if (List.getText().contains(sort))
            clickOnElement(List);
        break;
    }
}
    public void selectTheProductAndAddToCart(){
        log.info("select the product and add to cart"+ selectProductandAddToCart.getText());
        clickOnElement(selectProductandAddToCart);
    }
    public void openTheShoppingCart(){
        log.info("open shopping cart"+openShoppingCart.getText());
        clickOnElement(openShoppingCart);
    }
}
