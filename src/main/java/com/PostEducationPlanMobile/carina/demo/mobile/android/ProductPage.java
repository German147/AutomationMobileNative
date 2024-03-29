package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private ExtendedWebElement addToCartBtn;
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addToCartBtn() {
        addToCartBtn.click();
    }

    @Override
    public void minusBtnClick() {

    }

    @Override
    public void plusBtnClick() {

    }
}
