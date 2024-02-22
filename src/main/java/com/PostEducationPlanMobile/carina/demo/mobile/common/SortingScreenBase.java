package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SortingScreenBase extends AbstractPage {
    public SortingScreenBase(WebDriver driver) {
        super(driver);
    }
    public abstract HomeScreenBase clickNameAscending();
    public abstract HomeScreenBase clickNameDescending();
    public abstract HomeScreenBase clickPriceAscending();
    public abstract HomeScreenBase clickPriceDescending();
}
