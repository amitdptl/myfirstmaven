package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by User on 14/04/2017.
 */
public class Computers extends Utils
{
    public void clickOnNoteBook()
    {
        //click on NoteBooks
        clickOnElement(By.linkText("Notebooks"));
        Assert.assertTrue(getText(By.tagName("body")).contains("Notebooks"),"Fail");
    }
}
