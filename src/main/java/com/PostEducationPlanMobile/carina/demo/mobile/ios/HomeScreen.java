package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.AndroidHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Footer;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenBase.class)
public class HomeScreen extends HomeScreenBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeImage[`name == \"AppTitle Icons\"`]")
    private ExtendedWebElement logoIcon;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][1]/XCUIElementTypeImage")
    private ExtendedWebElement backpack;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"More-tab-item\"`]")
    private ExtendedWebElement menuBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"Catalog-screen\"`]/XCUIElementTypeOther[1]")
    private iOSHeader header;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/header")
    private AndroidHeader androidHeader;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductDetails-screen\"`]/XCUIElementTypeOther[4]/XCUIElementTypeOther")
    private Footer footer;

    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logoIcon.isElementPresent();
    }

    @Override
    public iOSHeader getIOSHeader() {
        return header;
    }

    @Override
    public AndroidHeader getAndroidHeader() {
        return androidHeader;
    }

    @Override
    public Footer getFooter() {
        return footer;
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
