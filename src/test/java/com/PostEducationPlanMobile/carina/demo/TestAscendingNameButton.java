package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.Header;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.annotations.Test;

public class TestAscendingNameButton implements IAbstractTest {

    @Test
    public void testHeader() {
        HomeScreenBase home = initPage(getDriver(), HomeScreenBase.class);
        Header header = home.getHeader();
        SortingScreenBase sortBtn = header.clickOnSortingBtn();
        sortBtn.clickNameAscending();

    }
}
