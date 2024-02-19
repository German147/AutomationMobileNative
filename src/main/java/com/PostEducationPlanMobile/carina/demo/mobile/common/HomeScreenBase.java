package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomeScreenBase extends AbstractPage {
    public HomeScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

}
