package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.swing.*;

public class HomePage extends CommonAPI {

    @FindBy(css = "#hypSignInWrapper > div.unameContainer > div.uname")
    private WebElement floatingMenu;

    @FindBy(css = "#topLvl17133")
    private WebElement AcountBtn;

    @FindBy(css = "#ctl00_ContentLeftSide_hlRegistration > span")
    private WebElement CreatAccountBtn;

    @FindBy(css = "#storeInfo > ul > li.close > button > img")
    private WebElement StoreLocatorPopUp;

    @FindBy(css = "#midLvl18549")
    private WebElement AppleItemsBtn;

    @FindBy(css = "#midLvl18550")
    private WebElement macbookItemBtn;

    @FindBy(css = "#midLvl18551")
    private WebElement macDeskToptsItems;

    @FindBy(css = "#midLvl18552")
    private WebElement ipadItems;

    @FindBy(css = "#midLvl18554")
    private WebElement AirPodItems;

    @FindBy(css = "#midLvl18553")
    private WebElement AppleWatchItems;


    @FindBy(xpath = "//*[@id=\"byProd\"]")
    private WebElement Products;

    @FindBy(xpath = "//*[@id=\"topLvl519\"]")
    private WebElement TopDealsItems;


    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-610 > ul > li:nth-child(2) > a")
    private WebElement allTelevision;

    @FindBy(css = "#mID519 > ul > li.tertiaryLvl.navarrow.MnID-610 > ul > li:nth-child(1) > a")
    private WebElement monitors;

    @FindBy(css = "  #mID519 > ul > li.tertiaryLvl.navarrow.MnID-6849 > ul > li > a")
    private WebElement AllTopDeal;

    @FindBy(css = " #topLvl18512")
    private WebElement AvailableBrands;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(1) > a")
    private WebElement Search_Acer_Brand;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18513 > ul > li:nth-child(10) > a")
    private WebElement Search_HP_Brand;

    @FindBy(css = "#mID18512 > ul > li.tertiaryLvl.navarrow.MnID-18526 > ul > li:nth-child(4) > a")
    private WebElement Search_Samsung_Brand;


    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //reusable steps
    public void hoverOverFloatingMenu(WebDriver driver) {

        hoverOver(driver, floatingMenu);

    }

    public void clickOnAcountBtn() {

        click(AcountBtn);
    }


    public void clickCreatAccountBtn() {

        click(CreatAccountBtn);
    }


    public void clickOnStorePopUp() {

        click(StoreLocatorPopUp);
    }

    public void hoverOverAplleItemsBtn(WebDriver driver) {

        hoverOver(driver, AppleItemsBtn);
    }

    public void clickOnmacbookBtn() {

        click(macbookItemBtn);
    }

    public void clickOnmacDesktopsItems() {

        click(macDeskToptsItems);

    }

    public void clickOnipadItems() {

        click(ipadItems);
    }

    public void clickOnAirPodItems() {

        click(AirPodItems);
    }

    public void clickOnAppleWatchItems() {

        click(AppleWatchItems);
    }

    public void hoverOverOroducts(WebDriver driver) {

        hoverOver(driver, Products);

    }

    public void clickOnTopDealsItems() {

        click(TopDealsItems);
    }

    public void clickOntelevisionItem() {

        click(allTelevision);
    }

    public void clickOnMonitors() {

        click(monitors);
    }

    public void clickOnviewAllTopDeal() {

        click(AllTopDeal);
    }

    public void clickOnBrands() {

        click(AvailableBrands);
    }

    public void clickOnAcer() {

        click(Search_Acer_Brand);
    }


    public void clickOnHP() {

        click(Search_HP_Brand);
    }

    public void clickOnSamsung() {

        click(Search_Samsung_Brand);
    }
}