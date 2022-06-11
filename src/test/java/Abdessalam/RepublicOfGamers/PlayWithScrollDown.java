package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ArmouryCratePage;
import pages.RepublicOfGamersHomePage;

    public class PlayWithScrollDown extends CommonAPI {
        @Test
        public void ArmoryCrate() {
            RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

            RepublicOfGamers.clickCookiesAcceptBtn();


        }

    }