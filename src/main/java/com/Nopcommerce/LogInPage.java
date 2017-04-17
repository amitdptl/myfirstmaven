package com.Nopcommerce;

import org.openqa.selenium.By;

import javax.security.auth.login.FailedLoginException;

import static com.Nopcommerce.Utils.clickOnElement;
import static com.Nopcommerce.Utils.typeText;

/**
 * Created by User on 13/04/2017.
 */
public class LogInPage extends Utils {

    public void logInPagefilling()

    {

        typeText(By.cssSelector("#Email"),RegistrationPage.email);
        typeText(By.name("Password"),"abcd123");
        //clicking on LOG IN button
        clickOnElement(By.xpath("//div[@class='page-body']/div/div[2]/form/div[3]/input"));
        assertByGetText(By.xpath("//div[@class='center-1']/div/div/h1"),"Welcome, Please Sign In!", "Fail");
    }
}
