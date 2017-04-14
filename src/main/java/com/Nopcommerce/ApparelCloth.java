package com.Nopcommerce;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

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
    {   //click on Apparel
        driver.findElement(By.linkText("Apparel")).click();
        //click on Clothing letf hand side
        driver.findElement(By.xpath("(//a[contains(text(),'Clothing')])[3]")).click();
        //click on list right hand side
        driver.findElement(By.linkText("List")).click();
        //click on order list LOW-HIGH
        driver.findElement(By.id("products-orderby")).sendKeys("Price");
        //clicking on compare button
        driver.findElement(By.xpath("//div[@class='add-info']/div[2]/input[2]")).click();
        //taking screenshot
        Utils.browserScreenShot("./ScreenShot/cloth"+randomNumber(100)+".jpg");

        driver.findElement(By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input[2]")).click();

        System.out.println("Screenshot taken");
        driver.findElement(By.xpath("//div[@id='bar-notification']/p/a")).click();
        System.out.println("Click on compareprice");
        //Assert
        Utils.assertByGetText(By.linkText("Oversized Women T-Shirt"),"Oversized Women T-Shirt","Assert Fail");
        System.out.println("1st cloth message asserted");
        Utils.assertByGetText(By.xpath("//tbody/tr[3]/td[3]/a"),"Custom T-Shirt","Assert Fail");
        System.out.println("2nd cloth message asserted");
        //clicking on clear list
        driver.findElement(By.xpath("//div[@class='center-2']/div/div[2]/a")).click();

        Utils.assertByGetText(By.xpath("//div[@class='center-2']/div/div[2]/div"),"You have no items to compare.",
                "Asset Fail");
        System.out.println("3rd cloth message asserted");


    }
}
