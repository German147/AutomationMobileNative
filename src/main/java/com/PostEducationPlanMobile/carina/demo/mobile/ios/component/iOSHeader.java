package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.CartPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.CartPage;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.IOSHomePage;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.SortingPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class iOSHeader extends AbstractUIObject {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Button\"`]")
    private ExtendedWebElement sortingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]")
    private ExtendedWebElement cartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Menu\"`]")
    private ExtendedWebElement menuBurgerBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"ALL ITEMS\"`]")
    private ExtendedWebElement catalogueBtn;
    public iOSHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SortingPageBase clickOnSortingBtn(){
        sortingBtn.click();
        return new SortingPage(getDriver());
    }
    public CartPageBase clickOnCartBtn(){
        cartBtn.click();
        return new CartPage(getDriver());
    }
    public HomePageBase clickOnMenu(){
        menuBurgerBtn.click();
        return new IOSHomePage(getDriver());
    }
    public HomePageBase clickOnCatalogue(){
        catalogueBtn.click();
        return new IOSHomePage(getDriver());
    }

}
