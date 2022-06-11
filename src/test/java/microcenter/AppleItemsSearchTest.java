package microcenter;

import Pages.AppleItemspage;
import Pages.HomePage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class AppleItemsSearchTest extends CommonAPI {

    @Test
    public void macbookItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());

    }

    @Test
    public void macDesktopsItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnmacbookBtn();
        waitFor(3);
    }
     @Test
    public void ipadItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnipadItems();
        waitFor(3);

    }
    @Test
    public void AirPodItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnAirPodItems();
        waitFor(3);

    }
      @Test
    public void AppleWatchItems() {
        HomePage homePage = new HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnAppleWatchItems();
        waitFor(3);

    }
}