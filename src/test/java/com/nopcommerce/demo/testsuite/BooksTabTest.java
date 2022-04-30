package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTabTest extends TestBase {

    HomePage homepage = new HomePage();
    BooksPage bookspage = new BooksPage();

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homepage.clickOnBooksTab();
        String expectedMessage = "Books";
        String actualMessage = bookspage.getBooksTab();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }

}
