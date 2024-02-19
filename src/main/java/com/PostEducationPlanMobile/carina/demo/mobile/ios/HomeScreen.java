package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenBase.class)
public class HomeScreen extends HomeScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeImage[`name == \"AppTitle Icons\"`]")
    private ExtendedWebElement logoIcon;

    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logoIcon.isElementPresent();
    }
}
