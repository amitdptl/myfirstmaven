package com.Nopcommerce;

import org.openqa.selenium.By;

/**
 * Created by amit on 08/04/2017.
 */
public class HomePage extends Utils {

    //click on registration button on nop-commerce home page
    public  void clickOnRegistration()
    {
        clickOnElement(By.className("ico-register"));
      //  assertByGetText(By.className(""),"",",");
    }
    public  void logOut()

    {
     clickOnElement(By.className("ico-logout"));
    }


    //click on Login page
    public  void clickOnLogInPage()
    {
        clickOnElement(By.className("ico-login"));
    }
    //click on Electronics
    public  void clickOnElectronics()
    {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul/li/a"));

    }
    //click on Apparel
    public  void clickOnApparel()
    {
        clickOnElement(By.linkText("Apparel"));
    }
    //click on Books
    public void clickOnBooks()
    {
        clickOnElement(By.linkText("Books"));
    }
    //click on GiftCards
    public void clickOnGiftCards()
    {
        clickOnElement(By.linkText("Gift Cards"));
    }

    //click

    public void clickOnComputers()
    {
        clickOnElement(By.linkText("Computers"));
        assertByGetText(By.xpath("//div/div[1]/h1"),"Computers","Not nevigate to Computer Page");
    }



}

