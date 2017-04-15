package com.Nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 15/04/2017.
 */
public class GiftCard extends Utils
{
    public void selectGiftCard()
    {
//        RegistrationPage registrationPage=new RegistrationPage();
//        registrationPage.registrationPageFilling();

        clickOnElement(By.cssSelector("img[alt='nopCommerce demo store"));
        clickOnElement(By.xpath("//div[@class='page-body']/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[2]/input"));
        clickOnElement(By.xpath("//div[@class='giftcard']/div/input"));
        typeText(By.xpath("//div[@class='giftcard']/div/input"),"Yatin Raja");
        clickOnElement(By.xpath("//div[@class='giftcard']/div[2]/input"));
        typeText(By.xpath("//div[@class='giftcard']/div[2]/input"),"abcde11@ymail.com");
        clickOnElement(By.xpath("//div[@class='giftcard']/div[3]/input"));
        typeText(By.xpath("//div[@class='giftcard']/div[3]/input"),"Amit Patel");
        clickOnElement(By.xpath("//div[@class='giftcard']/div[4]/input"));
        typeText(By.xpath("//div[@class='giftcard']/div[4]/input"),"fjaksjask@gmail.com");



    }
}
