package pages;

import base.CommonAPI;

=======
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends CommonAPI {


import java.util.ArrayList;
import java.util.List;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#quickLinksDesktop > div > a")
    WebElement GiftCardBtn;

    @FindBy(css = "body > div.page.page--homepage > header > div.header--mainbar > div > div.header__utility-items" +
            " > div.header__account.header__utility-item > a > svg")
    WebElement LoginBtn;

    @FindBy(css = "body > div.page > header > div.header--mainbar > div > label > span.hamburger")
    WebElement ShopByCategoryBtn;




    public void ClickOnShopByCategory() {

        click(ShopByCategoryBtn);
    }


    public void ClickOnGiftCardBtn(){
        click(GiftCardBtn);
    }



    public void ClickOnLoginBtn() {
        click(LoginBtn);

    }























    @FindBy(css = "#gh-ac")
    private WebElement searchField;

    @FindBy(css = "#gh-btn")
    private WebElement searchBtn;
    @FindBy(css = "#gh-eb-My > div > a.gh-eb-li-a.gh-rvi-menu")
    WebElement MyeBayfloatingMenu;

    @FindBy(css = "#s0-50-12-5-3\\[1\\] > div.srp-controls--responsive.srp-controls__row-cells.left > div.srp-controls__control--responsive > div > ul > li:nth-child(2) > a > span")
    WebElement AccpetsOffers;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > a")
    WebElement Motor;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement Motorcycles;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(7) > a")
    WebElement Boat;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__title")
    WebElement FishingBoat;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(7) > a")
    WebElement MyGarage;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(6)")
    WebElement HomeGarden;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(6) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement toolspower;
    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-0-12-list > li:nth-child(1) > a > p")
    WebElement Dewalt;
    @FindBy(css = "#gh-ug > a")
    WebElement Longin;
    @FindBy(css = "#userid")
    WebElement Longinemail;
    @FindBy(css = "#signin-continue-btn")
    WebElement Continue;
    @FindBy(css = "#gh-cat")
    WebElement DropDown;
    @FindBy(css = "#gh-cat")
    WebElement menuDropdown;
    @FindBy(css = "#s0-0-32-4-0-0\\[3\\]-4-match-media-0-ebay-carousel-list > li:nth-child(3) > a > div:nth-child(3) > span")
    WebElement buybtn;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(1) > div > div.s-item__image-section > div > a > div > img")
    WebElement Milwaukee;
    @FindBy(css = "#vi-viewInCartBtn")
    WebElement AddtoCard;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > a")
    WebElement toys;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(8) > a")
    WebElement toysDeal;
    @FindBy(css = " ")
    WebElement asraraal;
    @FindBy(css = "#binBtn_btn")
    WebElement buyasraraal;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > a")
    WebElement jewerly;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement Findjewerly;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(3) > div > div.s-item__image-section > div > a > div > img")
    WebElement wachman;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(2) > div > div.s-item__info.clearfix > div.s-item__details.clearfix > div:nth-child(1) > span")
    WebElement womenwach;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(3) > div > div.s-item__image-section > div > a > div > img")
    WebElement kidsshose;


    ;

    //    //reusable steps
    public void searchElement(String item) {
        type(searchField, item);
    }

    //
    public void clickSearchBtn() {
        click(searchBtn);
        waitFor(5);
    }


    public void hoveroverMyeBayfloatingMenu(WebDriver driver) {

        hoverOver(driver, MyeBayfloatingMenu);

    }

    public void optionMenu() {
        click(AccpetsOffers);


    }

    public void TypeIphoneInSearchBar() {


        type(searchField, "Iphone");
        click(searchBtn);

//
//    }


    }

    public void hoverOverMotor(WebDriver driver) {

        hoverOver(driver, Motor);

    }

    public void clickOnMotorcycles() {
        click(Motorcycles);
    }

    public void clickOnBoat() {
        click(Boat);
    }

    public void clickonFishingBeat() {

        click(FishingBoat);
    }

    public void clickOnMyGarage() {

        click(MyGarage);
    }

    public void hoverOverhomegarden(WebDriver driver) {

        hoverOver(driver, HomeGarden);


    }

    public void clickOntoolspower() {

        click(toolspower);

    }

    public void clickOnDewalt() {

        click(Dewalt);
    }

    public void clickOnLogin() {

        click(Longin);
    }

    public void typeOnloginEmailField(String Text) {

        type(Longinemail, Text);
    }

    public void clickcOncontueptn() {

        click(Continue);
    }

    public void typeOnloginUserName(String Text) {

        type(Longinemail, Text);
    }

    public void typeOnlogin(String Text) {

        type(Longinemail, Text);
    }

    public void clickDropdownbtn() {
        click(DropDown);
    }

    public void selectOptionFromDropDown(String option) {
        selectFromDropdown(menuDropdown, option);


    }

    public void clickOnMilwaukee() {

        click(Milwaukee);
    }

    public void clickOnAddCard() {

        click(AddtoCard);
    }

    public void hoverOverToys(WebDriver driver) {

        hoverOver(driver, toys);

    }

    public void clickOnToysDeal() {

        click(toysDeal);

    }

    public void clickOnAstrial() {

        click(asraraal);
    }

    public void clickOnbuyAstrial() {

        click(buyasraraal);
    }

    public void hoverOverJewerly(WebDriver driver) {

        hoverOver(driver, jewerly);
    }

    public void clickOnFindjewerly() {

        click(Findjewerly);
    }

    public void clickOnWachMan() {

        click(wachman);

    }
    public void clickOnWomenWach() {

        click(womenwach);
    }
    public void clickOnKidsshose() {

        click(kidsshose);
    }

}













