package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductScreenBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddAProductToCart implements IAbstractTest {

    @Test
    public void testAddAProductToCart() {
        HomeScreenBase home = initPage(getDriver(), HomeScreenBase.class);
        ProductScreenBase product = home.clickOnBackPack();
        product.addToChartBtn();
        CartScreenBase cart = home.getFooter().clickOnCartBtn();

        Assert.assertTrue(cart.isProductPresent(),"The product was not added");

    }
}
