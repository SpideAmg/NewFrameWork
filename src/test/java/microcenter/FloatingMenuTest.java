package microcenter;


import Pages.HomePage;
import Pages.LoginPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FloatingMenuTest extends CommonAPI {

    @Test//(enabled = false)
    public void missingPassWordField() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test2gmail.com");
        loginPage.clickSigninBtn();
        waitFor(3);
        String text = loginPage.getPasswordisRequiredText();
        Assert.assertEquals("Password is Required", text);
        waitFor(2);
    }

    @Test//(enabled = false)
    public void invalidPassWord() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test2gmail.com");
        loginPage.typeOnPassWordField("1234abcD");
        loginPage.clickSigninBtn();
        waitFor(3);
//        String text = loginPage.getInvalidusernamOrPassWordText();
//        Assert.assertEquals("nvalid username or password.", text);

    }

    @Test//(enabled = false)
    public void invalidEmailAdress() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test2gmail.");
        loginPage.typeOnPassWordField("1234abcD");
        loginPage.clickSigninBtn();
        waitFor(3);


    }

    @Test//(enabled = false)
    public void missingEmailAdressField() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnPassWordField("1234abcD");
        loginPage.clickSigninBtn();
        waitFor(3);
    }

    @Test//(enabled = false)
    public void missingPssWordField() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        loginPage.typeOnEmailAdressField("test2gmail.");
       // homePage.typeOnPassWordField("1234abcD");
        loginPage.clickSigninBtn();
        waitFor(3);
    }
}