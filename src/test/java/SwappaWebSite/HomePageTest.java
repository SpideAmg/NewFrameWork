package SwappaWebSite;
import base.CommonAPI;
import SwaggaPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

//    @Test
//    public void TopMenuInRightHomePage() {
//
//        HomePage homepage = new HomePage(getDriver());
//
//        homepage.HoverOverTopRightMenu(getDriver());
//        waitFor(2);
//    }
//
//    @Test
//    public void TopMenuInLeftHomePage() {
//
//        HomePage homepage = new HomePage(getDriver());
//
//        homepage.HoverOverTopLeftMenu(getDriver());
//        waitFor(2);
//
//
//    }
//
//    @Test
//    public void MenuHomePage(){
//
//        HomePage homepage = new HomePage(getDriver());
//
//        homepage.HoverOverMenu(getDriver());
//        waitFor(2);
//
//    }
//
//    @Test
//
//    public void SelectItemsByImages(){
//
//        HomePage homepage = new HomePage(getDriver());
//        homepage.ClickOnImage(getDriver());
//    }
//
//
//    @Test
//
//    public void SearchBarTest(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.TypeInSearchBar("iphone 11");
//        waitFor(2);
//        homePage.TypeInSearchBar("PlayStation 5");
//        waitFor(2);
//        homePage.TypeInSearchBar("samsung galaxy s21");
//        waitFor(2);
//        homePage.TypeInSearchBar("$$$$$$$$$$$$$$$$$$$");
//
//    }
//
//    @Test
//    public void SwappaLocalBtnTest(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ClickOnSwappaLocal();
//
//    }
//
//   @Test
//    public  void ScrolldownAndClickOnTMobileLogo(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ScrollToViewShopPhonesByCarrier(getDriver());
//
//        waitFor(5);
//
//    }
//
//    @Test
//    public  void ScrolldownAndHoverOverCarriers(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ScrollToViewShopPhonesByCarrier(getDriver());
//        homePage.HoverOverElementInShopPhonesByCarriers(getDriver());
//
//        waitFor(5);
//
//    }
//
//   @Test
//    public  void ScrolldownAndHoverOverItemsOnFeaturedProducts(){
//
//        HomePage homePage = new HomePage(getDriver());
//
//        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
//        homePage.HoverOverItemsOnFeaturedProducts(getDriver());
//
//        waitFor(5);
//
//    }
//
//    @Test
//    public  void ClickOnItemsOnFeaturedProducts(){
//
//        HomePage homePage = new HomePage(getDriver());
//        homePage.ScrollToViewItemsInFeaturedProducts(getDriver());
//        homePage.ClickOnEachItemOnFeaturedProducts(getDriver());
//
//
//    }
//
//   @Test
//    public void LoginUsingEmptyValueInPassword(){
//
//        HomePage login = new HomePage(getDriver());
//
//        login.loginTesting("mo@gmail.com","");
//        waitFor(2);
//
//
//
//    }
//    @Test
//    public void LoginUsingInvalidPassword(){
//
//        HomePage login = new HomePage(getDriver());
//        login.loginTesting("sr@gmail.com","ggsgsgss");
//        waitFor(10);
//
//
//    }
//
//    @Test
//    public void LoginUsing$$$InPassword(){
//
//        HomePage login = new HomePage(getDriver());
//
//        login.loginTesting("sr@gmail.com","$$$$$$$$$$$$$");
//        waitFor(10);
//
//
//
//    }
    @Test

    public void AccessForumSectionFromDropDownMenu(){

        HomePage homePage = new HomePage(getDriver());
        homePage.AccessForumSection();
        String GetTitle = getPageTitle();
        Assert.assertEquals("Forums, Community Discussion - Swappa",GetTitle);


    }




}
