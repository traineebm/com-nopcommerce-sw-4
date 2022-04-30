package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ApparelPage;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApparelTabTest extends TestBase {

    HomePage homepage = new HomePage();
    ApparelPage apparelpage = new ApparelPage();

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homepage.clickOnApparelTab();
        String expectedMessage = "Apparel";
        String actualMessage = apparelpage.getApparelTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }
}
