package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.android.component.AndroidHeader;
import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.MenuPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.ProductPageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class IOSHomePage extends HomePageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Username Password LOGIN\"`]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    private ExtendedWebElement logoIcon;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][1]/XCUIElementTypeImage")
    private ExtendedWebElement backpack;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Menu\"`]")
    private ExtendedWebElement menuBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"headerContainer\"`]")
    private iOSHeader header;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/header")
    private AndroidHeader androidHeader;

    @FindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[12]")
    private ExtendedWebElement loginBtn;
//    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Toggle\"`]")
//    private ExtendedWebElement toggle;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"PRODUCTS\"`]")
    private ExtendedWebElement productTitle;
    public IOSHomePage(WebDriver driver) {
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
    public ProductPageBase clickOnBackPack() {
        backpack.click();
        return initPage(getDriver(), ProductPageBase.class);
    }

    @Override
    public MenuPageBase clickOnMenuBurgerBtn() {
        menuBtn.click();
        return initPage(getDriver(), MenuPageBase.class);
    }

    @Override
    public LoginPageBase clickLogin() {
        loginBtn.click();
        return initPage(getDriver(), LoginPageBase.class);
    }
    @Override
    public String isProductTitlePresent() {
        return productTitle.getText();
    }
}
