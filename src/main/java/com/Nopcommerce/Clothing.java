package com.Nopcommerce;

import org.openqa.selenium.By;

/**
 * Created by User on 17/04/2017.
 */
public class Clothing extends Utils
{
    public void clothingApparel()
    {
        clickOnElement(By.xpath("(//a[contains(text(),'Clothing')])[3]"));
        //clickOnElement(By.xpath("//a[contains(@href, '/clothing')])[3]"));

        //click on list right hand side
        clickOnElement(By.linkText("List"));

        //click on order list LOW-HIGH
        selectText(By.id("products-orderby"), "Price: Low to High");

        clickOnElement(By.xpath("(//input[@value='Add to compare list'])[2]"));
        clickOnElement(By.xpath("(//input[@value='Add to compare list'])[3]"));
        //taking screenshot
        Utils.browserScreenShot("./ScreenShot/cloth" + randomNumber(100) + ".jpg");


        sleep(2);
        clickOnElement(By.linkText("product comparison"));
    }
}
