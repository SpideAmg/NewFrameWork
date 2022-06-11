package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleItemspage {

    public AppleItemspage(WebDriver driver) {

        PageFactory.initElements(driver, this);


    }
}