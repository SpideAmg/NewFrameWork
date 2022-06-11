package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GiftCardPage extends CommonAPI{


    public GiftCardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    @FindBy(css = "#toggleID-1296 > strong")
//    WebElement DepartmentBtn;

    @FindBy(css = "#quickLinksDesktop > div > a")
    WebElement GiftCardBtn;

    @FindBy(css = "#toggleID-1363")
    WebElement ShortBy;


    public void ClickOnGiftCardBtn(){
        click(GiftCardBtn);
        waitFor(3);
    }

    public void ClickOnShortByBtn(){
        ClickOnGiftCardBtn();
        waitFor(3);
        click(ShortBy);
        waitFor(3);

    }
}











































