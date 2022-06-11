package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArticlesPage;
import pages.RepublicOfGamersHomePage;

public class MoreArticlesBtn extends CommonAPI {

    @Test
    public void MoreArticlesBtn(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ArticlesPage ArticlesPage = new ArticlesPage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        String text2= getPageTitle();
        Assert.assertEquals(text2,"ROG - Republic of Gamers｜USA | The Choice of Champions");
        RepublicOfGamers.hoverOverCommunityMenu(getDriver());
        RepublicOfGamers.clickNewsAndArticles();
        String Text = "ARTICLES";
        Assert.assertEquals(Text,ArticlesPage.getArticleText());
        waitFor(2);
        ArticlesPage.clickMoreArticlesBtn();




    }
}
