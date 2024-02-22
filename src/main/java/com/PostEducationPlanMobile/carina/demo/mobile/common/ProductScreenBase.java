package com.PostEducationPlanMobile.carina.demo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductScreenBase extends AbstractPage {
    public ProductScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void addToChartBtn();
    public abstract void minusBtnClick();
    public abstract void plusBtnClick();



}
