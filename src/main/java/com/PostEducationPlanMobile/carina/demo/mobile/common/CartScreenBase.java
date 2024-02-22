package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends AbstractPage {
    public CartScreenBase(WebDriver driver) {
        super(driver);
    }


    public abstract boolean isProductPresent();
}
