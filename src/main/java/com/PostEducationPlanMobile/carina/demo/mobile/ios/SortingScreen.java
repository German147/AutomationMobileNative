package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingScreenBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

public class SortingScreen extends SortingScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Name - Ascending\"`]")
    private ExtendedWebElement nameAscendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Name - Descending\"`]")
    private ExtendedWebElement nameDescendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Price - Ascending\"`]")
    private ExtendedWebElement priceAscendingBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Price - Descending\"`]")
    private ExtendedWebElement priceDescendingBtn;


    public SortingScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomeScreenBase clickNameAscending() {
       nameAscendingBtn.click();
        return initPage(getDriver(), HomeScreenBase.class);
    }

    @Override
    public HomeScreenBase clickNameDescending() {
       nameDescendingBtn.click();
        return initPage(getDriver(), HomeScreenBase.class);
    }

    @Override
    public HomeScreenBase clickPriceAscending() {
       priceAscendingBtn.click();
        return initPage(getDriver(), HomeScreenBase.class);
    }

    @Override
    public HomeScreenBase clickPriceDescending() {
        priceDescendingBtn.click();
        return initPage(getDriver(), HomeScreenBase.class);
    }
}
