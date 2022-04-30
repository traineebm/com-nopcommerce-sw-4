package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerCompletionText = By.xpath("//div[contains(text(),'Your registration completed')]");

    public String getRegisterTab(){
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField, firstName);
    }
    public void enterLastName(String LastName){
        sendTextToElement(lastNameField, LastName);
    }
    public void enterEmailField(String email){
        sendTextToElement(emailField, email);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField, password);
    }
    public void enterConfirmPasswordField(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    public String getRegisterCompletionMessage(){
        return getTextFromElement(registerCompletionText);
    }
}
