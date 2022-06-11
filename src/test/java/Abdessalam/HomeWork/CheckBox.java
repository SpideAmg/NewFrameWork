package Abdessalam.HomeWork;

import base.CommonAPI;
import org.testng.annotations.Test;
import AbdessalamPages.ShittyPage;

public class CheckBox extends CommonAPI {
    @Test
    public void checkBox(){

        ShittyPage ShittyPage = new ShittyPage(getDriver());


        ShittyPage.CheckBoxOption1();
        waitFor(2);
        ShittyPage.CheckBoxOption2();
        waitFor(2);
        ShittyPage.CheckBoxOption3();
        waitFor(2);








    }
}
