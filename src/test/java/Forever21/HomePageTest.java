package Forever21;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WomenSectionPage;

public class HomePageTest extends CommonAPI {

//    @Test


public void AccessGiftCardPageTest (){

        HomePage homepage = new HomePage(getDriver());
    WomenSectionPage womenSectionPage = new WomenSectionPage(getDriver());
    womenSectionPage.ClickOnShopByCategory();
    waitFor(3);
    womenSectionPage.ClickOnWomenSection();
    waitFor(3);
//
//        homepage.ClickOnLoginBtn();
        homepage.ClickOnGiftCardBtn();
        womenSectionPage.ClickOnShopByCategory();
        waitFor(3);
        womenSectionPage.ClickOnWomenSection();
        waitFor(3);



    }

    @Test

    public  void    TestTestHomePage(){

    waitFor(5);

    }





}
