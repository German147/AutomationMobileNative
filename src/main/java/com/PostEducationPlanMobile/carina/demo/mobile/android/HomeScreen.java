package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Header;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = HomeScreenBase.class)
public class HomeScreen extends HomeScreenBase {

    @FindBy(className = "android.widget.ImageView")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backpack;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")

    private ExtendedWebElement menuBtn;

    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
    }

    @Override
    public Header getHeader() {
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
