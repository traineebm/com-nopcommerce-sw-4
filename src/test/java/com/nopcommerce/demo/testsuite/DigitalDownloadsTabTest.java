package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ApparelPage;
import com.nopcommerce.demo.pages.DigitalDownloadsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitalDownloadsTabTest extends TestBase {

    HomePage homepage = new HomePage();
    DigitalDownloadsPage digitaldownloadspage = new DigitalDownloadsPage();

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homepage.clickOnDigitalDownloadsTab();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitaldownloadspage.getDigitalDownloadsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }
}
