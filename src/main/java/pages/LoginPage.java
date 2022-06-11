package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"ctl00_ContentLeftSide_ucLogin_txtEmailAddress\"]")
    private WebElement enterEmailAdress;

    @FindBy(xpath = "//*[@id=\"ctl00_ContentLeftSide_ucLogin_txtPassword\"]")
    private WebElement enterpassWord;
    @FindBy(css = "#ctl00_ContentLeftSide_ucLogin_btnSignIn")
    private WebElement singIn;

    @FindBy(css = "#ctl00_ContentLeftSide_hlRegistration > span")
    private WebElement CreatAccountBtn;
    @FindBy(css = "#ctl00_ContentLeftSide_ucLogin_vsRegister > ul > li > a")

    private WebElement PasswordisRequired;


    @FindBy(xpath = "//*[@id=\"ctl00_ContentLeftSide_ucLogin_vsRegister\"]/ul/li")
    private WebElement InvalidusernamOrPassWord;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void typeOnEmailAdressField(String Text) {

        type(enterEmailAdress, Text);
    }

    public void typeOnPassWordField(String Text) {

        type(enterpassWord, Text);
    }

    public void clickSigninBtn() {

        click(singIn);

    }

    public String getPasswordisRequiredText() {
        return getElementText(PasswordisRequired);

    }

    public String getInvalidusernamOrPassWordText() {
        return getElementText(InvalidusernamOrPassWord);

    }
}