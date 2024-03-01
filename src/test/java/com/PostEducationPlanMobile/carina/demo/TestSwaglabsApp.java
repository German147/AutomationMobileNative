package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HeaderBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ILogIn;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSwaglabsApp implements IAbstractTest, ILogIn {


    @Test(description = "[TC002]-testAddProductToCart")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testValidLogin() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
    }


    @Test(description = "[TC004]-testAddProductToCart")
    @MethodOwner(owner = "barrreraGerman")
    @TestLabel(name = "feature", value = {"mobile", "functionality"})
    public void testAddProductToCart() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        HomePageBase homePage = loginPageBase.login();

        Assert.assertTrue(homePage.isPageOpened(), "The page was not opened");
        HeaderBase header = homePage.getHeader();
        Assert.assertTrue(header.isUIObjectPresent(), "Header menu was not found");

        //First I click on a product because a value can't be reached.
        homePage.clickOnToggleBtn().clickOnAddBtn(0);
        int initialItemCount = homePage.getCartValue(header.getCartItems());
        homePage.clickOnAddBtn(1);
        int updatedItemAmount = homePage.getCartValue(header.getCartItems());

        Assert.assertTrue(initialItemCount < updatedItemAmount, "The product was NOT added to cart");
    }
}
