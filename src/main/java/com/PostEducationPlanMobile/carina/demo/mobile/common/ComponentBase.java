package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class ComponentBase extends AbstractUIObject {
    public ComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public abstract ComponentBase getHeader();
}
