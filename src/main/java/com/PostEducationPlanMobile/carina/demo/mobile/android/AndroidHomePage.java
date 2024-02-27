package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.AndroidHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.ExtendedDigest;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = HomePageBase.class)
public class AndroidHomePage extends HomePageBase {

    @FindBy(xpath = "//android.widget.ImageView")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]")
    private ExtendedWebElement backpack;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]")
    private ExtendedWebElement menuBtn;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/header")
    private AndroidHeader androidHeader;

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
    private ExtendedWebElement productTitle;

    public AndroidHomePage(WebDriver driver) {
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
    public ProductPageBase clickOnBackPack() {
       backpack.click();
        return initPage(getDriver(), ProductPageBase.class);
    }

    @Override
    public MenuPageBase clickOnMenuBurgerBtn() {
       menuBtn.click();
        return initPage(getDriver(), MenuPageBase.class);
    }

    @Override
    public LoginPageBase clickLogin() {
        return null;
    }

    @Override
    public String isProductTitlePresent() {
        return productTitle.getText();
    }


}
