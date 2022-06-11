package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAcountPage extends CommonAPI {


    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtFirstName")
    private WebElement enterFirstNameAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtLastName")
    private WebElement enterLastNameAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtEmailAddress")
    private WebElement enterEmailAdressAcount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtPhoneNumber")
    private WebElement enterMobilePhoneAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtPassword")
    private WebElement enterPassWordAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_txtConfirmPassword")
    private WebElement ConfirmpPassWordAccount;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_ckbAcceptTerms")
    private WebElement checkBox;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_btnRegisterAccount")
    private WebElement creatMyProfileBtn;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_vsAccountInformation > ul > li")
    private WebElement FirstNameisRequired;

    @FindBy(css = "#ctl00_ContentLeftSide_ucRegistration_vsAccountInformation > ul > li")
    private WebElement missingEmailAdressField;

    public CreatAcountPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void TypeInFirstNameFld(String Text) {

        type(enterFirstNameAccount, Text);
    }

    public void TypeLastName(String Text) {

        type(enterLastNameAccount, Text);
    }

    public void TypeEmailAdress(String Text) {

        type(enterEmailAdressAcount, Text);
    }


    public void TypeMobilePhone(String Text) {

        type(enterMobilePhoneAccount, Text);
    }

    public void TypePassWord(String Text) {

        type(enterPassWordAccount, Text);
    }

    public void TypeConfirmPassWord(String Text) {

        type(ConfirmpPassWordAccount, Text);
    }

    public void clickCheckBox() {

        click(checkBox);

    }

    public void clickcreatMyProfileBtn() {

        click(creatMyProfileBtn);

    }

    public String getFirstNameisRequiredText() {
        return getElementText(FirstNameisRequired);

    }

    public String getmissingEmailAdressFieldText() {
        return getElementText(missingEmailAdressField);

    }
}




