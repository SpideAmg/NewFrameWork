package microcenter;

import Pages.HomePage;
import base.CommonAPI;

import org.testng.annotations.Test;

public class TopDealsItemsTest extends CommonAPI {

    @Test
    public void AllTopDeals() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        waitFor(3);


    }

    @Test
    public void monitors() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        waitFor(3);
    }

    @Test
    public void Television() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnStorePopUp();
        homePage.clickOnTopDealsItems();
        homePage.clickOnviewAllTopDeal();
        waitFor(3);

    }
}