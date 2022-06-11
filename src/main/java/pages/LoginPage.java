package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommonAPI {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "body > div.page > header > div.header--mainbar > div > div.header__utility-items > div.header__account.header__utility-item > a > svg")
    WebElement LoginPage;

    @FindBy(css = " LoginPage login = new LoginPage(getDriver());")
    WebElement CreateAccount;

    @FindBy(css = "#registration-form-fname")
            WebElement TypeFirstNameLastNameandValidInformation;


//   @FindBy(css = "#navigation > div > ul > li:nth-child(2) > label")
           WebElement Hoverover;

    //       @FindBy(css = "#login-form-email")
    WebElement ValidEmail;

    //       @FindBy(css = "#login-form-password")
    WebElement ValidPassword;


    public void ClickOnLoginBtn() {
        click(LoginPage);
        waitFor(3);
    }

    public void CreateAccount() {
        ClickOnLoginBtn();
        click(CreateAccount);
        waitFor(3);

    }



    }


