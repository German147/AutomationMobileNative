package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.CartScreen;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.HomeScreen;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class Footer extends AbstractUIObject {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Catalog-tab-item\"`]")
    private ExtendedWebElement catalogueBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Cart-tab-item\"`]")
    private ExtendedWebElement cartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"More-tab-item\"`]")
    private ExtendedWebElement menuBurgerBtn;

    public Footer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomeScreenBase clickOnCatalogue(){
        catalogueBtn.click();
        return new HomeScreen(getDriver());
    }

    public CartScreenBase clickOnCartBtn(){
        cartBtn.click();
        return new CartScreen(getDriver());
    }
    public HomeScreenBase clickOnMenu(){
        menuBurgerBtn.click();
        return new HomeScreen(getDriver());
    }



}
