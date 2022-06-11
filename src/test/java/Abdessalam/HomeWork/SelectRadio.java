package Abdessalam.HomeWork;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ShittyPage;

    public class SelectRadio extends CommonAPI {
        @Test
        public void SelectRadio() {
            ShittyPage ShittyPage = new ShittyPage(getDriver());

            ShittyPage.selectRadio1();
            waitFor(2);
            ShittyPage.selectRadio2();
            waitFor(2);
            ShittyPage.selectRadio3();
            waitFor(2);




        }
    }