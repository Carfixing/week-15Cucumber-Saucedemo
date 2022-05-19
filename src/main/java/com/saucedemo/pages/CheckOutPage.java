package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement selectCheckOut;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement fNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement verifyText;

    public void goToCheckOutAndOpen(){
        log.info("go to check out and open "+selectCheckOut.getText());
        clickOnElement(selectCheckOut);
    }
    public void enterFirsatName(String name){
        log.info("enter first name"+fNameField.getText());
        sendTextToElement(fNameField,name);
    }
    public void enterLastName(String surname){
        log.info("enter first name"+lNameField.getText());
        sendTextToElement(lNameField,surname);
    }
    public void enterZipPostalCode(String postalCode){
        log.info("enter zipCode "+zipCode.getText());
        sendTextToElement(zipCode,postalCode);
    }
    public void clickoncontinueButton(){
        log.info("click on continue Button"+continueBtn);
        clickOnElement(continueBtn);
    }
    public void clickonFinishButton(){
        log.info(("Verify text for Thenkyou " + finishButton));
        clickOnElement(finishButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(verifyText);
    }
}