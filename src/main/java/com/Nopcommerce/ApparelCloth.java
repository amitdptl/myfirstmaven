package com.Nopcommerce;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 08/04/2017.
 */
public class ApparelCloth extends Utils
{
    public  void selectClothngComparision()
    {
        Utils.assertByGetText(By.className("topic-block-title"),
                Utils.getText(By.className("Welcome to our store")),"");


    }
}
