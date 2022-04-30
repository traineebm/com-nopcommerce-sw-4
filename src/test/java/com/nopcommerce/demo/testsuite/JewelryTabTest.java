package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.JewelryPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelryTabTest extends TestBase {

    HomePage homepage = new HomePage();
    JewelryPage jewelrypage = new JewelryPage();

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homepage.clickOnJewelryTab();
        String expectedMessage = "Jewelry";
        String actualMessage = jewelrypage.getJewelryTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }
}
