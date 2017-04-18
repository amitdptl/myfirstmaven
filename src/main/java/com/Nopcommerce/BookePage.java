package com.Nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 08/04/2017.
 */
public class BookePage extends Utils
{
    public void Books()
    {
       getText(By.linkText("Books"));
       getText(By.xpath("//div[@class='product-grid']/div/div/div/div[2]/h2"));
       typeText(By.id("addtocart_37_EnteredQuantity"),"4");
       clickOnElement(By.id("add-to-wishlist-button-37"));
       clickOnElement(By.id("add-to-cart-button-37"));

        //click on shopping cart in green bar
        clickOnElement(By.xpath("//body/div[5]/p/a"));

        //click on agree

        driver.findElement(By.id("termsofservice")).isSelected();
        driver.findElement(By.id("CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("//div[@class='page-body']/div/form/div/input[2]"));
    }
}
