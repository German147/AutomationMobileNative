package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = CartScreen.class)
public class CartScreen extends CartScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Sauce Labs Backpack\"`]")
    private ExtendedWebElement product;

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent() {
        return product.isElementPresent();
    }
}
