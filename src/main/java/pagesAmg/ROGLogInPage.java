package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ROGLogInPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div[2]/div/div/div/div/form/p[1]")
    private WebElement LogInPageText;

    @FindBy(css = "#txtMail")
    private WebElement Email;

    @FindBy(css ="#txtPassword")
    private WebElement PassWord;

    @FindBy(xpath = "//*[@id=\"rogProduct\"]/div[2]/div/div/div/div/form/div[4]/div/div/div[1]/span")
    private WebElement LogInBtn;





    public ROGLogInPage(WebDriver driver){
        PageFactory.initElements(driver, this);}






    public String getLogInPageText(){
        return getElementText(LogInPageText);
    }

    public void typeEmail(){
        type(Email,"amganas18@gmail.com");
    }

    public void typePassWord(){
        type(PassWord,"Anes2019");
    }

    public void clickLogInBtn(){
        click(LogInBtn);
    }
}
