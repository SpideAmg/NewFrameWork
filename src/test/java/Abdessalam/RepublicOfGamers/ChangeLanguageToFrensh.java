package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import AbdessalamPages.LanguagePage;
import AbdessalamPages.RepublicOfGamersHomePage;

public class ChangeLanguageToFrensh extends CommonAPI {
    @Test
            public void ChangeLanguage() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        LanguagePage LanguagePage = new LanguagePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        //scrollDown
        String text= getPageTitle();
        Assert.assertEquals(text,"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.clickLanguageBtn();
        String Title = getPageTitle();
        Assert.assertEquals(Title,"Choose your language | ROG - Republic of Gamers | Global");
        LanguagePage.clickFranceBnt();
        waitFor(1);
        LanguagePage.clickYesBtn();

    }
}
