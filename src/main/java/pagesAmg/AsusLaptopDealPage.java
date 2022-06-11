package AbdessalamPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AsusLaptopDealPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]/span")
    private WebElement addToCartBtn;



    public AsusLaptopDealPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartBtn(){
        click(addToCartBtn);
    }



}
