package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ILogIn;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestAddProductToCart implements IAbstractTest, ILogIn {

    @Test
    public void testAddProductToCart() {
        HomePageBase homePage = loginApp();
        //First I click on a product because a value can't be reached.
        homePage.clickOnToggleBtn().clickOnAddBtn(0);

        int initialItemCount = homePage.getCartValue(homePage.getHeader().getCartItems());
        homePage.clickOnAddBtn(1);
        int updatedItemAmount = homePage.getCartValue(homePage.getHeader().getCartItems());

        Assert.assertTrue(initialItemCount < updatedItemAmount, "The product was NOT added to cart");
    }
}
