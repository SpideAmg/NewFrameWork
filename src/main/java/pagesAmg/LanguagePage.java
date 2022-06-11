package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguagePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div/div/div/div[2]/div/div[4]/div/div[2]/a[7]")
    private WebElement FranceBtn;

    @FindBy(xpath = "//*[@class='Region__yesButton__3aPHT']")
    private WebElement YesBtn;



    public LanguagePage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    public void clickFranceBnt(){
        click(FranceBtn);
    }

    public void clickYesBtn(){
        click(YesBtn);
    }




}
