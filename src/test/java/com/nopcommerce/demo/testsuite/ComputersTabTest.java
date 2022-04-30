package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTabTest extends TestBase {

    HomePage homepage = new HomePage();
    ComputerPage computerpage = new ComputerPage();

    @Test
    public void userShouldNavigateToComputersPageSuccessfully(){
        homepage.clickOnComputersTab();
        String expectedMessage = "Computers";
        String actualMessage = computerpage.getComputersTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");


    }
}
