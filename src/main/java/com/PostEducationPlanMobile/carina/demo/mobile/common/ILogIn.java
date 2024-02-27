package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

public interface ILogIn extends ICustomTypePageFactory {

    default HomePageBase loginApp() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);
        loginPageBase.typeIntoInput();
        loginPageBase.ClickLoginButton();
        return initPage(getDriver(), HomePageBase.class);
    }

}
