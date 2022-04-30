package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By logOutText = By.xpath("//a[contains(text(),'Log out')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
         sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLogInButton(){
        clickOnElement(loginButton);
    }

    public String getLogOutText(){
        return getTextFromElement(logOutText);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);

    }
}


