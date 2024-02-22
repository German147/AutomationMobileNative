package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.AndroidHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Footer;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomeScreenBase extends AbstractPage {
    public HomeScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract iOSHeader getIOSHeader();
    public abstract AndroidHeader getAndroidHeader();
    public abstract Footer getFooter();

    public abstract ProductScreenBase clickOnBackPack();

    public abstract MenuScreenBase clickOnMenuBurgerBtn();

}
