package com.Nopcommerce;

import org.openqa.selenium.By;

/**
 * Created by amit on 08/04/2017.
 */
public class RegistrationPage extends Utils
{
    public static String email;

    public  void registrationPageFilling()
    {
        clickOnElement(By.xpath("//div/div/div/span[@class='male']"));
        typeText(By.xpath("//*[text()='First name:']//following::" +
                "input[@id='FirstName' and @data-val='true']"),"amit");
        typeText(By.xpath("//input[@id='LastName' and @class='text-box single-line']"),
                "kathrotya");
        selectIndex(By.name("DateOfBirthDay"),12);
        selectText(By.name("DateOfBirthMonth"),"April");
        selectValue(By.name("DateOfBirthYear"),"1982");
        email="abcde"+dateStamp()+"@gmail.com";
        typeText(By.name("Email"),email);

        typeText(By.id("Company"),"alibaba ltd");
        typeText(By.id("Password"),"abcd123");
        typeText(By.id("ConfirmPassword"),"abcd123");
        clickOnElement(By.id("register-button"));

    }



}
