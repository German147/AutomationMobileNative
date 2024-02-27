package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest implements IAbstractTest {

    @Test
    public void smokeTest() {
        HomePageBase catalogueScreen = initPage(getDriver(), HomePageBase.class);
        Assert.assertTrue(catalogueScreen.isPageOpened(), "The catalogue app screen was not displayed");
    }
}
