package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.AndroidHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Footer;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = HomeScreenBase.class)
public class HomeScreen extends HomeScreenBase {

    @FindBy(className = "android.widget.ImageView")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backpack;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuBtn;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/header")
    private AndroidHeader androidHeader;

    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
    }

    @Override
    public iOSHeader getIOSHeader() {
        return null;
    }

    @Override
    public AndroidHeader getAndroidHeader() {
        return androidHeader;
    }

    @Override
    public Footer getFooter() {
        return null;
    }

    @Override
    public ProductScreenBase clickOnBackPack() {
       backpack.click();
        return initPage(getDriver(), ProductScreenBase.class);
    }

    @Override
    public MenuScreenBase clickOnMenuBurgerBtn() {
       menuBtn.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }
}
