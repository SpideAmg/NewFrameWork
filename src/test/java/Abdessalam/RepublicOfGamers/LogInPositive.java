package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import AbdessalamPages.ROGLogInPage;
import AbdessalamPages.RepublicOfGamersHomePage;

public class LogInPositive extends CommonAPI {
    @Test
    public void LogIn() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ROGLogInPage ROGLogInPage = new ROGLogInPage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        Assert.assertEquals(getPageTitle(),"ROG - Republic of Gamers｜USA | The Choice of Champions");
        waitFor(1);
        RepublicOfGamers.clickLogInBtn();
        RepublicOfGamers.clickLogInFromDropDown();
        waitFor(2);
        Assert.assertEquals("Account Login",ROGLogInPage.getLogInPageText());
        ROGLogInPage.typeEmail();
        ROGLogInPage.typePassWord();
        ROGLogInPage.clickLogInBtn();
        waitFor(2);




    }
}
