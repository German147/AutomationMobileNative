package com.PostEducationPlanMobile.carina.demo.mobile.ios;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomePageBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.LoginPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == \"test-Username\"`]")
    private ExtendedWebElement username;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSecureTextField[`name == \"test-Password\"`]")
    private ExtendedWebElement password;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"LOGIN\"`][2]")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePageBase ClickLoginButton() {
        loginBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }
    @Override
    public void typeIntoInput() {
    username.type(R.TESTDATA.get("user"));
    password.type(R.TESTDATA.get("password"));
    }

}
