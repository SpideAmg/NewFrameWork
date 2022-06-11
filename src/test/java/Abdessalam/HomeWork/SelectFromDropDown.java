package Abdessalam.HomeWork;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ShittyPage;


    public class SelectFromDropDown extends CommonAPI {
        @Test
        public void SelectFromDropDown() {
            ShittyPage ShittyPage = new ShittyPage(getDriver());


            ShittyPage.SelectDropDown1();
            waitFor(1);
            ShittyPage.SelectDropDown2();
            waitFor(1);
            ShittyPage.SelectDropDown3();
            waitFor(1);
        }
    }