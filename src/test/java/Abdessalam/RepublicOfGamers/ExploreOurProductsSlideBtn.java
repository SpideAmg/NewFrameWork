package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RepublicOfGamersHomePage;

public class ExploreOurProductsSlideBtn extends CommonAPI {

    @Test
    public void NewTest(){

        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        waitFor(1);
        RepublicOfGamers.clickCookiesAcceptBtn();
        waitFor(1);
        String text= getPageTitle();
        Assert.assertEquals(text,"ROG - Republic of Gamers｜USA | The Choice of Champions");
        waitFor(1);
        RepublicOfGamers.clickSlideRightBtn();
        waitFor(1);
        RepublicOfGamers.clickSlideLeftBtn();
        waitFor(1);








    }

}
