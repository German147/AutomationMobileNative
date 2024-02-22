package com.PostEducationPlanMobile.carina.demo.mobile.android.component;

import com.PostEducationPlanMobile.carina.demo.mobile.android.CartScreen;
import com.PostEducationPlanMobile.carina.demo.mobile.common.CartScreenBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AndroidHeader extends AbstractUIObject {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private ExtendedWebElement cartBtn;

    public AndroidHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CartScreenBase clickCartBtb(){
        cartBtn.click();
        return new CartScreen(getDriver());
    }

}
