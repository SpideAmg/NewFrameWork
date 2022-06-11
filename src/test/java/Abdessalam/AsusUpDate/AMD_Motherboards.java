package Abdessalam.AsusUpDate;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AsusHomePage;

public class AMD_Motherboards extends CommonAPI {
    @Test
    public void AMDMotherBoard() {
        AsusHomePage AsusHomePage = new AsusHomePage(getDriver());

        AsusHomePage.clickCookiesBtn();
        waitFor(1);
        AsusHomePage.hoverOverMotherBoardsAndComponentsMenu(getDriver());
        waitFor(1);
        AsusHomePage.hoverOverMotherBoardsFromMenu(getDriver());
        waitFor(1);
        AsusHomePage.clickAMDChipsetBrandFromMenu();
        String expectedPageTitle = "AMD｜Motherboards｜ASUS USA";
        waitFor(2);
        Assert.assertEquals(expectedPageTitle,AsusHomePage.getAMDMotherBoardsPageTitle());

    }


}