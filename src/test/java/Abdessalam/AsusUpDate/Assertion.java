package Abdessalam.AsusUpDate;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AsusHomePage;

public class Assertion extends CommonAPI {

    @Test
    public void Assertion(){
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        Assert.assertEquals(getPageTitle(),"ASUS USA");

        waitFor(2);

        Assert.assertEquals(AsusHomePage.getDealsText(),"Deals");

        waitFor(2);


    }
}
