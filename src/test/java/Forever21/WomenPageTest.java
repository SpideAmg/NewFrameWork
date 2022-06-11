package Forever21;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.WomenSectionPage;

public class WomenPageTest extends CommonAPI {


      @Test
    public void AccessWomenSectionTest () {

        WomenSectionPage womenpage = new WomenSectionPage(getDriver());

        womenpage.AccessWomenSection();
    }


        @Test

        public void AccessBestSellersInWomenSectionTest (){

      WomenSectionPage womenPage = new WomenSectionPage(getDriver());

        womenPage.AccessWomenSection();
        womenPage.AccessBestSellersInWomenSection();
        waitFor(10);


    }

   @Test
    public void AccessForeverLAInWomenSectionTest (){

        WomenSectionPage womenpage = new WomenSectionPage(getDriver());
        womenpage.AccessWomenSection();
        womenpage.ClickOnForeverLAinWomenSection();
        waitFor(10);

    }

    @Test
    public void AccessSaleInWomenSectionTest(){
        WomenSectionPage womenpage = new WomenSectionPage(getDriver());
        womenpage.AccessWomenSection();
        womenpage.AccessSaleSection();
        waitFor(5);
    }


    }

