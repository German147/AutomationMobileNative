package com.PostEducationPlanMobile.carina.demo.mobile.ios.component;

import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.SortingScreen;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class iOSHeader extends AbstractUIObject {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Button\"`]")
    private ExtendedWebElement sortingBtn;
    public iOSHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SortingScreenBase clickOnSortingBtn(){
        sortingBtn.click();
        return new SortingScreen(getDriver());
    }

}
