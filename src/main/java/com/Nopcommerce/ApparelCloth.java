package com.Nopcommerce;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 08/04/2017.
 */
public class ApparelCloth extends Utils
{
    public  void selectClothngComparision()
    {
        SoftAssert softAssert=new SoftAssert();

        //click on Apparel
        clickOnElement(By.linkText("Apparel"));
      //  clickOnElement(By.linkText("Apparel"));

        //click on Clothing letf hand side

       clickOnElement(By.xpath("(//a[contains(text(),'Clothing')])[3]"));
        //clickOnElement(By.xpath("//a[contains(@href, '/clothing')])[3]"));

        //click on list right hand side
        clickOnElement(By.linkText("List"));

        //click on order list LOW-HIGH
        selectText(By.id("products-orderby"),"Price: Low to High");

        clickOnElement(By.xpath("(//input[@value='Add to compare list'])[2]"));
        clickOnElement(By.xpath("(//input[@value='Add to compare list'])[3]"));
        //taking screenshot
    Utils.browserScreenShot("./ScreenShot/cloth"+randomNumber(100)+".jpg");


        sleep(2);
        clickOnElement(By.linkText("product comparison"));






    //Assert
        softAssert.assertEquals(getText(By.linkText("Oversized Women T-Shirt")),"Oversized Women T-Shirt","Assert Fail");
        System.out.println("1st cloth message asserted");
        softAssert.assertEquals(getText(By.xpath("(//a[contains(text(),'Custom T-Shirt')])[2]")),"Custom T-Shirt","Assert Fail");
        System.out.println("2nd cloth message asserted");
        //clicking on clear list

        //clickOnElement(By.xpath("//div[@class='center-2']/div/div[2]/a"));
       // softAssert.assertEquals(getText(By.xpath("//div[@class='center-2']/div/div[2]/div")),"You have no items to compare.",
                //"Asset Fail");

        System.out.println("3rd cloth message asserted");

        softAssert.assertAll();

    }
}
