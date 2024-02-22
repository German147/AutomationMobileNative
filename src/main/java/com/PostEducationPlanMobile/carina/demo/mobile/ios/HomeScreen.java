package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Header;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenBase.class)
public class HomeScreen extends HomeScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeImage[`name == \"AppTitle Icons\"`]")
    private ExtendedWebElement logoIcon;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][1]/XCUIElementTypeImage")
    private ExtendedWebElement backpack;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"More-tab-item\"`]")
    private ExtendedWebElement menuBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"Catalog-screen\"`]/XCUIElementTypeOther[1]")
    private Header header;

    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logoIcon.isElementPresent();
    }

    @Override
    public Header getHeader() {
        return header;
    }

    @Override
    public ProductScreenBase clickOnBackPack() {
       backpack.click();
        return initPage(getDriver(),ProductScreenBase.class);
    }

    @Override
    public MenuScreenBase clickOnMenuBurgerBtn() {
        menuBtn.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }
}
