package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = MenuScreenBase.class)
public class MenuScreen extends MenuScreenBase {

    @FindBy(xpath = "//android.widget.TextView[2]")
    private ExtendedWebElement catalogBtn;

    public MenuScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomeScreenBase clickOnCatalogue() {
       catalogBtn.click();
        return initPage(getDriver(), HomeScreenBase.class);
    }
}
