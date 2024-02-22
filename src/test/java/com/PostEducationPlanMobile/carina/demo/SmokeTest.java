package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest implements IAbstractTest {

    @Test
    public void smokeTest() {
        HomeScreenBase catalogueScreen = initPage(getDriver(), HomeScreenBase.class);
        Assert.assertTrue(catalogueScreen.isPageOpened(), "The catalogue app screen was not displayed");
    }
}
