package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WallPapersPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div[2]/div/section/div/div[2]/div/h1")
    private WebElement WallPapersText;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div[2]/div/section/div/div[2]/div/div/ul/li[1]/div/div/a")
    private WebElement WallPapers2022;





    public WallPapersPage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    public String getWallPapersText(){
        return getElementText(WallPapersText);
    }

    public void clickWallPapers2022(){
        click(WallPapers2022);
    }

}


