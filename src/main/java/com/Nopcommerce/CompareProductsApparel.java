package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

/**
 * Created by User on 17/04/2017.
 */
public class CompareProductsApparel extends Utils

{
    public void compareProductsApparelPage()
    {
        SoftAssert softAssert=new SoftAssert();

        //Assert
        softAssert.assertEquals(getText(By.linkText("Oversized Women T-Shirt")), "Oversized Women T-Shirt", "Assert Fail");
        System.out.println("1st cloth asserted");
        softAssert.assertEquals(getText(By.linkText("Oversized Women T-Shirt")), "Custom T-Shirt", "Assert Fail");
        System.out.println("2nd cloth asserted");
        clickOnElement(By.xpath("//div[@class='center-2']/div/div[2]/a"));

        softAssert.assertEquals(getText(By.xpath("//div[@class='center-2']/div/div[2]/a")), "You have no items to compare.", "Assert Fail");
        System.out.println("last message asserted");
        softAssert.assertAll();
    }
}
