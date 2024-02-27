package com.PostEducationPlanMobile.carina.demo.mobile.android.component;

import com.PostEducationPlanMobile.carina.demo.mobile.android.CartPage;
import com.PostEducationPlanMobile.carina.demo.mobile.android.MenuPage;
import com.PostEducationPlanMobile.carina.demo.mobile.common.CartPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ComponentBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AndroidHeader extends ComponentBase {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private ExtendedWebElement cartBtn;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/sortIV")
    private ExtendedWebElement sortBtn;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private ExtendedWebElement menuBtn;

    public AndroidHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    public CartPageBase clickCartBtb(){
        cartBtn.click();
        return new CartPage(getDriver());
    }

    public MenuPageBase clickMenuBurgerBtn(){
        menuBtn.click();
        return new MenuPage(getDriver());
    }


    @Override
    public ComponentBase getHeader() {
        return null;
    }
}
