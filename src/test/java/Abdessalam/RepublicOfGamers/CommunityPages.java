package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import AbdessalamPages.RepublicOfGamersHomePage;

public class CommunityPages extends CommonAPI {
    @Test
    public void CommunityPages(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();

        String text= getPageTitle();
        Assert.assertEquals(text,"ROG - Republic of Gamers｜USA | The Choice of Champions");
       // RepublicOfGamers.scroollToVieuFb();
        waitFor(2);
        RepublicOfGamers.ClickFacebookPage();



    }
}
