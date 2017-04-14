package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by User on 14/04/2017.
 */
public class NoteBook extends Utils
{
    public void sortNoteBookPageProductAtoZ()
    {
        selectSortByPosition("Name: Z to A");
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='products-orderby']/option[2]")).isSelected(),
                "Position A to Z is not selected");
    }
}
