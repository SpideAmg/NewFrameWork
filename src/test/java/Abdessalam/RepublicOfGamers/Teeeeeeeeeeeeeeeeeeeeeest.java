package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.RepublicOfGamersHomePage;

public class Teeeeeeeeeeeeeeeeeeeeeest extends CommonAPI {
    @Test
    public void Test(){
        RepublicOfGamersHomePage RepublicOGHM = new RepublicOfGamersHomePage(getDriver());

        RepublicOGHM.clickCookiesAcceptBtn();

        RepublicOGHM.GoBack(getDriver());

    }
}
