package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private ExtendedWebElement product;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent() {
        return product.isElementPresent();
    }

    @Override
    public HomePageBase clickOnGoShopping() {
        return null;
    }
}
