package com.PostEducationPlanMobile.carina.demo;

import com.PostEducationPlanMobile.carina.demo.mobile.common.HomeScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.common.SortingScreenBase;
import com.PostEducationPlanMobile.carina.demo.mobile.ios.component.iOSHeader;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.annotations.Test;

public class TestAscendingNameButton implements IAbstractTest {

    @Test
    public void testHeader() {
        HomeScreenBase home = initPage(getDriver(), HomeScreenBase.class);
        iOSHeader iOSHeader = home.getIOSHeader();
        SortingScreenBase sortBtn = iOSHeader.clickOnSortingBtn();
        sortBtn.clickNameAscending();

    }
}
