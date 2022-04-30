package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By JewelryTab = By.xpath("//h1[contains(text(),'Jewelry')]");


    public String getJewelryTab(){
        return  getTextFromElement(JewelryTab);
    }
}
