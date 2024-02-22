package com.PostEducationPlanMobile.carina.demo.mobile.android;

import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = ProductScreenBase.class)
public class ProductScreen extends ProductScreenBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private ExtendedWebElement addToCartBtn;
    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addToChartBtn() {
        addToCartBtn.click();
    }

    @Override
    public void minusBtnClick() {

    }

    @Override
    public void plusBtnClick() {

    }
}
