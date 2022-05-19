package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;



public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passWordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginbutton;

    public void enterUserName(String username){
        log.info("enter username " + userNameField.getText());
        sendTextToElement(userNameField,username);
    }
    public void enterPassword(String password){
        log.info("enter password " + passWordField.getText());
        sendTextToElement(passWordField,password);
    }

    public void loginApplication(String username,String password){
        enterUserName(username);
        enterPassword(password);
    }
    public void clickonloginbutton(){
        log.info("click on login button "+ loginbutton.getText());
        clickOnElement(loginbutton);
    }
}
