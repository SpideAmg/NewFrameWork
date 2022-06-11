package microcenter;

import Pages.AppleItemspage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class AppleItemsSearchTest extends CommonAPI {

    @Test
    public void macbookItems() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());

    }

    @Test
    public void macDesktopsItems() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnmacbookBtn();
        waitFor(3);
    }
     @Test
    public void ipadItems() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnipadItems();
        waitFor(3);

    }
    @Test
    public void AirPodItems() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnAirPodItems();
        waitFor(3);

    }
      @Test
    public void AppleWatchItems() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        AppleItemspage AppleItemspage = new AppleItemspage(getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverAplleItemsBtn(getDriver());
        homePage.clickOnAppleWatchItems();
        waitFor(3);

    }
}