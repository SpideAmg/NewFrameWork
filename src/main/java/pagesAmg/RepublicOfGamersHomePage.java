package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepublicOfGamersHomePage extends CommonAPI {

    @FindBy(xpath = "//*[@class='btn-asus btn-ok btn-read-ck']")
    private WebElement CookiesAcceptBtn;

    @FindBy(xpath = "//*[@id=\"rogMenu\"]/span")
    private WebElement Products;

    @FindBy(xpath = "//*[@class='SlideShow__rightButton__3C9zJ']")
    private WebElement ExploreOurProductsSlideRightBtn;

    @FindBy(xpath = "//*[@class='SlideShow__leftButton__2Rc32']")
    private WebElement ExploreOurProductsSlideLeftBtn;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > div.Header__iconBlock__339d9 > button")
    private WebElement SearchBtn;

    @FindBy(css = "#search")
    private WebElement SearchBar;

    @FindBy(xpath = "//*[@class='SearchExplore__title__3e_kG']")
    private WebElement ProductText;

    @FindBy(css = "#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > nav > div > ul.Header__headerMenuList__3_iXV > li:nth-child(1) > div.headerDropDownMenuList__dropDownMenuContainer__38IYs > div:nth-child(1) > ul:nth-child(3) > li > ul > li:nth-child(1) > a")
    private WebElement ExternalGraphicsDocks2022;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div/main/div[1]/div/div[2]/div[1]/div[3]/div[1]/h3/a/span[1]")
    private WebElement RogXgMobile2022;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div/main/div[1]/div/div[1]/div[1]/h1")
    private WebElement EXTERNALGRAPHICDOCKSText;

    @FindBy(css = "#rogProduct > div > div > div > div.productTabBarContainer.ProductTabBar__productTabBarContainer__1e5nP > div.productTabBarWrapper.ProductTabBar__productTabBarWrapper__1Mza_ > div.ProductTabBar__productInfo__3Gw2U > a > h1")
    private WebElement ROGXGMobile2022Text;

    @FindBy(xpath = "//*[@class='Footer__socialItem__3v6_U']")
    private WebElement FacebookPage;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/footer/div/div[2]/ul[2]/li[2]/a/svg")
    private WebElement TwitterPage;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[1]/div[2]/div[1]/ul[2]/li/ul/li[1]/a")
    private WebElement MotherboardsFromMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div/div[4]/div[2]/div[1]/div/div/div[4]/div/a")
    private WebElement RogZenith;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div[4]/div[6]/div/div[2]/div/a")
    private WebElement NotifyMeBtn;

    @FindBy(xpath = "//*[@id=\"rogMenu2\"]")
    private WebElement DownloadMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[3]/div[2]/div/ul/li/ul/li[1]/a")
    private WebElement WallPapersFromMenu;

    @FindBy(xpath = "//*[@id=\\\"rogProduct\\\"]/div/div/div/footer/div/img")
    private WebElement FaceBookIcon;

    @FindBy(css = "#rogMenu3 > span")
    private WebElement CommunityMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[4]/div[2]/div/ul/li/ul/li[1]/a")
    private WebElement NewsAndArticles;

    @FindBy(xpath = "//*[@class='Footer__language__Xv6jK Footer__footerItemName__3SrWr']")
    private WebElement LanguageBtn;

    @FindBy(css = "#rogMenu1")
    private WebElement InnovationMenu;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/nav/div/ul[2]/li[2]/div[2]/div/ul/li/ul/li[2]/a")
    private WebElement ArmoryBtn;

    @FindBy(xpath = "//*[@class='userButton headerPersonalBlock__accountButton__dnqUZ headerPersonalBlock__isLogin__17fMM']")
    private WebElement LogInBtn;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[1]/div[2]/header/div[2]/div[2]/ul/li/ul/li[6]/div[1]/span")
    private WebElement LogInFromBtn;

    @FindBy(css = "#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS")
    private WebElement RecentRelease;

    @FindBy(css ="#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(1)")
    private WebElement Image1;

    @FindBy(css ="#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(2)")
    private WebElement Image2;

    @FindBy(css ="#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(3)")
    private WebElement Image3;

    @FindBy(css ="#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(4)")
    private WebElement Image4;

    @FindBy(css ="#rogProduct > div > div > div > main > div.Actions__actionsContainer__3fXsG > div > div.Actions__actionScrollBar__2tyCS > div > a:nth-child(5)")
    private WebElement Image5;

    @FindBy(xpath = "//*[@class='Header__asusLogo__30CFg']")
    private WebElement AsusLogo;







    public RepublicOfGamersHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickCookiesAcceptBtn() {
        click(CookiesAcceptBtn);
    }

    public void hoverOverProducts(WebDriver driver) {
        hoverOver(driver, Products);
    }

    public void clickSlideRightBtn() {
        click(ExploreOurProductsSlideRightBtn);
    }

    public void clickSlideLeftBtn() {
        click(ExploreOurProductsSlideLeftBtn);
    }

    public void clickSearchBtn() {
        click(SearchBtn);
    }

    public void TypeSearchBar() {
        type(SearchBar, "SSD");
    }

    public void ClearSearchBar() {
        clear(SearchBar);
    }

    public void TypeAndEnterSearchBarr() {
        typeAndEnter(SearchBar, "KeyBoard");
    }

    public String getTextProduct() {
        return getElementText(ProductText);
    }

    public void clickExternalGraphicsDocks2022() {
        click(ExternalGraphicsDocks2022);
    }

    public void clickRogXgMobile2022() {
        click(RogXgMobile2022);
    }

    public void hoverOverRogXgMobile2022(WebDriver driver) {
        hoverOver(driver, RogXgMobile2022);
    }

    public String getEXTERNALGRAPHICDOCKSText() {
        return getElementText(EXTERNALGRAPHICDOCKSText);
    }

    public String getROGXGMobile2022Text() {
        return getElementText(EXTERNALGRAPHICDOCKSText);
    }


//   public void scroollToVieuFb(WebDriver element){
//        scrollToView(FacebookPage);
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        element.
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//    }


    public void ClickFacebookPage() {
        click(FacebookPage);
    }

    public void ClickTwitterPage() {
        click(TwitterPage);
    }

    public void clickMotherboardsFromMenu() {
        click(MotherboardsFromMenu);
    }

    public void clickRogZenith() {
        click(RogZenith);
    }

    public void clickNotifyMeBtn() {
        click(NotifyMeBtn);
    }

    public void hoverOverDownloadMenu(WebDriver driver) {
        hoverOver(driver, DownloadMenu);
    }

    public void clickWallPapersFromMenu() {
        click(WallPapersFromMenu);
    }

    public void hoverOverCommunityMenu(WebDriver driver) {
        hoverOver(driver, CommunityMenu);
    }

    public void clickNewsAndArticles() {
        click(NewsAndArticles);
    }

    public void clickLanguageBtn() {
        click(LanguageBtn);
    }

    public void hoverOverInnovationMenu(WebDriver driver) {
        hoverOver(driver, InnovationMenu);
    }

    public void clickArmoryBtn() {
        click(ArmoryBtn);
    }

    public void clickLogInBtn() {
        click(LogInBtn);
    }

    public void clickLogInFromDropDown() {
        click(LogInFromBtn);
    }


    public void ScrollDownToRecentReleases(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", RecentRelease);

    }


    public void hoverOver5Image(WebDriver driver){
        hoverOver(driver,Image1);
        hoverOver(driver,Image2);
        hoverOver(driver,Image3);
        hoverOver(driver,Image4);
        hoverOver(driver,Image5);
    }

    public void GoBack(WebDriver driver){
        click(AsusLogo);
        driver.navigate().back();
        waitFor(2);
        driver.navigate().forward();
        waitFor(2);

    }


}