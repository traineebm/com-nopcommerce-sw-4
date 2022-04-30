package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("alpha789@gmail.com");
        loginPage.enterPassword("Abc8909");
        loginPage.clickOnLogInButton();

        String expectedMessage = "Log out";
        String actualMessage = loginPage.getLogOutText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login unsuccessful");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123@");
        loginPage.clickOnLogInButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");

    }

}
