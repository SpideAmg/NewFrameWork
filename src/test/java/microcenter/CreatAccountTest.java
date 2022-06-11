package microcenter;

import Pages.CreatAcountPage;
import Pages.HomePage;
import Pages.LoginPage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreatAccountTest extends CommonAPI {


    @Test
    public void missigFirstNameField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("");
        CreatAcountPage.TypeLastName("rayan");
        CreatAcountPage.TypeEmailAdress("adam.90@gmail.com");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("1234Abcd");
        CreatAcountPage.TypeConfirmPassWord("1234Abcd");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        waitFor(3);
        String text = CreatAcountPage.getFirstNameisRequiredText();
        Assert.assertEquals("First Name is Required", text);
    }
    @Test
    public void missingEmailAdressField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("Fettah");
        CreatAcountPage.TypeLastName("rayan");
        CreatAcountPage.TypeEmailAdress("");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("1234Abcd");
        CreatAcountPage.TypeConfirmPassWord("1234Abcd");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        waitFor(3);
        String text = CreatAcountPage.getmissingEmailAdressFieldText();
        Assert.assertEquals("Please enter valid Email.", text);
    }
    //@Test
    public void missigPassWordField() {
        HomePage homePage = new HomePage(getDriver());
        CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnAcountBtn();
        homePage.clickCreatAccountBtn();
        CreatAcountPage.TypeInFirstNameFld("Fettah");
        CreatAcountPage.TypeLastName("rayan");
        CreatAcountPage.TypeEmailAdress("adam.90@gmail.com");
        CreatAcountPage.TypeMobilePhone("");
        CreatAcountPage.TypePassWord("");
        CreatAcountPage.TypeConfirmPassWord("1234Abcd");
        CreatAcountPage.clickCheckBox();
        CreatAcountPage.clickcreatMyProfileBtn();
        waitFor(3);

    }

       // @Test
        public void missigPhoneNumberField() {
            HomePage homePage = new HomePage(getDriver());
            CreatAcountPage CreatAcountPage = new CreatAcountPage(getDriver());
            homePage.hoverOverFloatingMenu(getDriver());
            homePage.clickOnAcountBtn();
            homePage.clickCreatAccountBtn();
            CreatAcountPage.TypeInFirstNameFld("Fettah");
            CreatAcountPage.TypeLastName("rayan");
            CreatAcountPage.TypeEmailAdress("adam.90@gmail.com");
            CreatAcountPage.TypeMobilePhone("");
            CreatAcountPage.TypePassWord("1234Abcd");
            CreatAcountPage.TypeConfirmPassWord("1234Abcd");
            CreatAcountPage.clickCheckBox();
            CreatAcountPage.clickcreatMyProfileBtn();
            waitFor(3);
        }
    }
