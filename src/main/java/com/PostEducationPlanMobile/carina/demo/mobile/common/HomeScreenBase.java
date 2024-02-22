package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Footer;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Header;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomeScreenBase extends AbstractPage {
    public HomeScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract Header getHeader();
    public abstract Footer getFooter();

    public abstract ProductScreenBase clickOnBackPack();

    public abstract MenuScreenBase clickOnMenuBurgerBtn();

}
