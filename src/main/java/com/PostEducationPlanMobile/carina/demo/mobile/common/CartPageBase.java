package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage {
    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresent();

    public abstract HomePageBase clickOnGoShopping();

    public abstract HomePageBase clickContinueShopping();

    public abstract CartPageBase clickRemoveButton();
}
