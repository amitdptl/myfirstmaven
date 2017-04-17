package com.Nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.Nopcommerce.BasePage.driver;

/**
 * Created by User on 13/04/2017.
 */
public class Electronics extends Utils
{
    public void cellPhone()
    {
        //clicking on electronics on top line
        clickOnElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a"));

        //clicking on cell phone at left side
        clickOnElement(By.linkText("/cell-phones"));
     //   clickOnElement(By.xpath("//div[@class='listbox']/ul/li/ul/li/a"));

        //add to cart 1st phone
        clickOnElement(By.xpath("//div[@class='item-grid']/div/div/div[2]/div[3]/div/input"));
    //    sleep(2);
        //closing tab on the top right hand side green
        //clickOnElement(By.cssSelector("span.close"));
        //Refresh page until Page load
        Utils.refresh();

        //add to cart 2nd phone
        clickOnElement(By.xpath("//div[@class='product-grid']/div/div[2]/div/div[2]/div[3]/div[2]/input"));
        clickOnElement(By.cssSelector("span.close"));//closing tab on the top right hand
        Utils.refresh();
        clickOnElement(By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input"));
        clickOnElement(By.cssSelector("span.close"));//closing tab on the top right hand side
        Utils.refresh();
        clickOnElement(By.xpath("//div[@class='header']/div/div[2]/div/ul/li[4]"));

    }
}
