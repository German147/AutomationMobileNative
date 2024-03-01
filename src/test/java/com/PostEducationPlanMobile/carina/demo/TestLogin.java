package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ILogIn;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin implements IAbstractTest, ILogIn {
    @Test
    public void testLoginUser() {
        HomePageBase  home = loginApp();
        Assert.assertTrue(home.isProductTitlePresent().contains("PRODUCTS"),"The login was not successful");
    }
}
