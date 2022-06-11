package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenSectionPage extends CommonAPI {

    public WomenSectionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#navigation > div > ul > li:nth-child(1) > label")
    WebElement WomenSection;

    @FindBy(css = "#flyout-women-featured_best_sellers")
    WebElement BestSellers;

    @FindBy(css = "#flyout-nav_featured_forever_la_womens")
    WebElement ForeverLA;

    @FindBy(css = "body > div.page > header > div.header--mainbar > div > label > span.hamburger")
    WebElement ShopByCategoryBtn;


    @FindBy(css = "#flyout-Sale_Womens")
    WebElement Sale;



    public void ClickOnShopByCategory() {
        click(ShopByCategoryBtn);
    }

    public void ClickOnWomenSection() {
        click(WomenSection);

    }

        public void AccessWomenSection () {

            click(ShopByCategoryBtn);
            waitFor(2);
            click(WomenSection);

        }

        public void ClickOnForeverLAinWomenSection () {

            click(ForeverLA);
        }

        public void AccessBestSellersInWomenSection () {

            click(BestSellers);


        }


        public void AccessSaleSection(){

        click(Sale);
        }
    }












