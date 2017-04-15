package com.Nopcommerce;

import org.openqa.selenium.By;

/**
 * Created by User on 15/04/2017.
 */
public class $25VirtualGiftCard extends Utils
{
    public void virtualGiftCard$25()
    {
        // driver.findElement(By.id("giftcard_43_Message")).click();
        typeText(By.id("giftcard_43_Message"),"Hello world");
        clickOnElement(By.id("add-to-cart-button-43"));
        clickOnElement(By.className("close"));
        clickOnElement(By.cssSelector("input.button-2.email-a-friend-button"));
    }
}
