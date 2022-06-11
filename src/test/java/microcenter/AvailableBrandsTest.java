package microcenter;

import Pages.AppleItemspage;
import Pages.BrandsPage;
import Pages.HomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AvailableBrandsTest extends CommonAPI {

    @Test
    public void ViewAllAvailableBrands() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        //homePage.clickOnLGBrand();
        waitFor(3);

    }
    @Test
    public void search_Acer_Brand() {
        HomePage homePage = new HomePage(getDriver());
         BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnAcer();

    }
     @Test
    public void search_HP_Brand() {
        HomePage homePage = new HomePage(getDriver());
         BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnHP();
        waitFor(3);

    }
     @Test
    public void search_Samsung_Brand() {
        HomePage homePage = new HomePage(getDriver());
        BrandsPage BrandPage = new BrandsPage (getDriver());
        homePage.clickOnStorePopUp();
        homePage.hoverOverOroducts(getDriver());
        homePage.clickOnBrands();
        homePage.clickOnSamsung();
        waitFor(3);
    }
}