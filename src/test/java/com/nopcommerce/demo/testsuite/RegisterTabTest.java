package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTabTest extends TestBase {

    HomePage homepage = new HomePage();
    RegisterPage registerpage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homepage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerpage.getRegisterTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homepage.clickOnRegisterLink();
        registerpage.enterFirstName("Munira");
        registerpage.enterLastName("Shah");
        registerpage.enterEmailField("munsha123@gmail.com");
        registerpage.enterPasswordField("Abc8909");
        registerpage.enterConfirmPasswordField("Abc8909");
        registerpage.clickOnRegisterButton();
        String expectedMessage = "Your registration completed";
        String actualMessage = registerpage.getRegisterCompletionMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Registration unsuccessful");
    }
}
