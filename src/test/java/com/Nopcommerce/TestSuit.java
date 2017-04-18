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
    GiftCard giftCard = new GiftCard();
    $25VirtualGiftCard virtualGiftCard=new $25VirtualGiftCard();
    EmailFriend emailFriend= new EmailFriend();
    Clothing clothing=new Clothing();
    CompareProductsApparel compareProductsApparel=new CompareProductsApparel();

    @Test
    public void userShouldRegisterSuccessfully()
    {
        homepage.clickOnRegistration();
        registrationPage.registrationPageFilling();
        //Assertion
        utils.assertByGetText(By.className("result"),"Your registration completed","Assert Fail");

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
        utils.assertByGetText(By.className("topic-block-title"),
                Utils.getText(By.className("Welcome to our store")),"");
    }

    @Test
    public void userSouldElectronicsSuccessfully()
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
    @Test
    public void userShouldSendGiftCardSucessfully()
    {
        homepage.clickOnRegistration();
        registrationPage.registrationPageFilling();
        giftCard.selectGiftCard();
        virtualGiftCard.virtualGiftCard$25();
        emailFriend.sendEmailFriendGiftCards();

        utils.assertByGetText(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[2]/div[2]"),
                "Your message has been sent.","Assert Fail");
    }
    @Test
    public void userShouldBuyClothingSuccessfully()

    {
        homepage.clickOnApparel();
        clothing.clothingApparel();
        compareProductsApparel.compareProductsApparelPage();
        utils.assertByGetText(By.xpath("//div[@class='center-2']/div/div[2]/a"),"You have no items to compare.","Assert Fail");

    }


}
