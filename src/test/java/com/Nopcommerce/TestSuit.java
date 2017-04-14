package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by amit on 08/04/2017.
 */
public class TestSuit extends BaseTest
{
    HomePage homepage = new HomePage();
    LogInPage logInPage= new LogInPage();
    BookePage bookePage=new BookePage();
    RegistrationPage registrationPage = new RegistrationPage();
    ApparelCloth apparelCloth=new ApparelCloth();
    Electronics electronic=new Electronics();
    Utils utils=new Utils();
    Computers computers =new Computers();
    NoteBook noteBook= new NoteBook();

    @Test
    public void userShouldRegisterSuccessfully()
    {
        homepage.clickOnRegistration();
        registrationPage.registrationPageFilling();
        Assert.assertEquals("Your registration completed",Utils.getText(By.className("result")));
      //  homepage.logOut();

    }

    @Test
    public void userShouldLogInSuccessfully()
    {
        homepage.clickOnRegistration();
        registrationPage.registrationPageFilling();
        homepage.logOut();
        homepage.clickOnLogInPage();
        logInPage.logInPagefilling();
        Utils.assertByGetText(By.className("topic-block-title"),
                Utils.getText(By.className("Welcome to our store")),"");

    }

    @Test

    public void userShouldCompareClothingSuccessfully()
    {
        homepage.clickOnApparel();
        apparelCloth.selectClothngComparision();
    }
    @Test
    public void userSouldCompareClothingSuccessfully()
    {
        homepage.clickOnElectronics();
        electronic.cellPhone();
    }
    @Test
    public void userShouldSortNoteBookPageAtoZ()
    {
        homepage.clickOnComputers();
        computers.clickOnNoteBook();
        noteBook.sortNoteBookPageProductAtoZ();
        //
        Assert.assertTrue(utils.ascendingOrLowToHigher(By.xpath("//h2")),"Fail sorting order");
    }

}
