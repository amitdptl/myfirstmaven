package com.Nopcommerce;

import org.openqa.selenium.By;

/**
 * Created by User on 15/04/2017.
 */
public class EmailFriend extends Utils
{
    public void sendEmailFriendGiftCards()
    {
        typeText(By.id("FriendEmail"),"abcde11@ymail.com");

        //driver.findElement(By.id("YourEmailAddress")).sendKeys("fjaksjask@gmail.com");
        typeText(By.id("PersonalMessage"),"Enjoy your new giftcard");
        clickOnElement(By.name("send-email"));
        //verify email has been to friend
        assertByGetText(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[2]/div[2]"),"Your message has been sent.","Assert Fail");

    }
}
