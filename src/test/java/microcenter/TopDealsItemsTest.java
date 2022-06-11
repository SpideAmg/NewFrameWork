package microcenter;

import base.CommonAPI;

import org.testng.annotations.Test;

public class TopDealsItemsTest extends CommonAPI {

    @Test
    public void AllTopDeals() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        waitFor(3);


    }

    @Test
    public void monitors() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        waitFor(3);
    }

    @Test
    public void Television() {
        Pages.HomePage homePage = new Pages.HomePage(getDriver());
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        waitFor(3);

    }
}