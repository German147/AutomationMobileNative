package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private ExtendedWebElement product;

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent() {
        return product.isElementPresent();
    }
}
