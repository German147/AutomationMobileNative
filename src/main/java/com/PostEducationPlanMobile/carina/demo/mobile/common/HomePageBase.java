package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.AndroidHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract iOSHeader getIOSHeader();

    public abstract AndroidHeader getAndroidHeader();

    public abstract ProductPageBase clickOnBackPack();

    public abstract MenuPageBase clickOnMenuBurgerBtn();

    public abstract LoginPageBase clickLogin();
    public abstract String isProductTitlePresent();

}
