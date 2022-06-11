package eaby;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebayHomePage;
import pages.SearchResultPage;

public class HomePageTest extends CommonAPI {


//    @Test

    public void iphone() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("iphone");
        homePage.clickSearchBtn();
        String expectedJavaPageTitle = "ebay.com : iphone";
//         Assert.assertEquals(expectedJavaPageTitle, searchResultPage.getSearchPageTitle());
        waitFor(3);
    }

    //    @Test
    public void ClickOnFloatingMenu() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.searchElement("iphone");
        homePage.clickSearchBtn();


        homePage.hoveroverMyeBayfloatingMenu(getDriver());

    }

    //@Test
    public void ClickOnAcceptOfferfromIphoneSearch() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.TypeIphoneInSearchBar();
        homePage.optionMenu();


    }

    //   @Test
    public void hoverOverMotor() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnMotorcycles();
    }

    //  @Test
    public void Beat() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnBoat();
    }

    //    @Test
    public void FishingBeat() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnBoat();
        homePage.clickonFishingBeat();
    }

    //       @Test
    public void MyGarage() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnMyGarage();
    }

    //  @Test
    public void homeGardan() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverhomegarden(getDriver());
        homePage.clickOntoolspower();
        waitFor(5);
    }

    //   @Test
    public void Dewalt() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverhomegarden(getDriver());
        homePage.clickOntoolspower();
        homePage.clickOnDewalt();
        waitFor(5);
    }

    //    @Test
    public void loginInvalidEmailk() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnLogin();
        homePage.typeOnloginEmailField("tex@gmail.");
        waitFor(6);
        homePage.clickcOncontueptn();
    }

    //    @Test
    public void loginInvalidUserName() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnLogin();
        homePage.typeOnloginEmailField("Jacob");
        waitFor(7);
        homePage.clickcOncontueptn();
    }

    //    @Test
    public void loginMissingEmailfikled() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnLogin();
        homePage.typeOnloginEmailField("");
        waitFor(10);
        homePage.clickcOncontueptn();
    }

    //    @Test
    public void selectBabyOption() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickDropdownbtn();
        waitFor(5);
//       homePage.searchElement("ART");
//       homePage.selectOptionFromMenuDropdownWithSelectOptions("art");
//       homePage.click();

    }

    //    @Test
    public void buyBtn() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Milwaukee 2401-22 M12 12V 1/4-Inch Hex Screwdriver Kit");
        homePage.clickSearchBtn();

        homePage.clickOnMilwaukee();
        homePage.clickOnAddCard();
    }

    @Test

    public void hoverovertoysr() {


        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverToys(getDriver());
        homePage.clickOnToysDeal();
        homePage.clickOnAstrial();
        homePage.clickOnbuyAstrial();
        waitFor(7);
    }

//    @Test

    public void hoveroverjewerly() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverJewerly(getDriver());
//        homePage.clickOnFindjewerly;
        waitFor(7);
    }

    @Test

    public void Electricaltools() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("elctrical tools");
        homePage.clickSearchBtn();
        waitFor(7);

    }
    @Test

    public void wachmen() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("wach men");
        homePage.clickSearchBtn();
        waitFor(7);
        homePage.clickOnWachMan();
    }
    @Test
    public void womenwach() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("womon wach");
        homePage.clickSearchBtn();
        waitFor(7);
        homePage.clickOnWomenWach();
    }
    @Test
    public void shose() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("wkids shose");
        homePage.clickSearchBtn();
        waitFor(7);
        homePage.clickOnKidsshose();
    }

}

