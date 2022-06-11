package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

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





















}






