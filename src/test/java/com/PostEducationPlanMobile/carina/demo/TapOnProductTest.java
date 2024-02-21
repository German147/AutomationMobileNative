package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuScreenBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TapOnProductTest implements IAbstractTest {
    @Test
    public void tapOnProducts() {
        HomeScreenBase home = initPage(getDriver(), HomeScreenBase.class);
        home.clickOnBackPack();
        MenuScreenBase menu = home.clickOnMenuBurgerBtn();
        menu.clickOnCatalogue();

        Assert.assertTrue(home.isPageOpened(),"The catalogue screen was not opened");
    }
}
