package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import AbdessalamPages.ArmouryCratePage;
import AbdessalamPages.RepublicOfGamersHomePage;

public class PlusIConDeviceConfigurationArmoryCrate extends CommonAPI {
    @Test
    public void PlusIcon(){
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ArmouryCratePage ArmouryCratePage = new ArmouryCratePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        RepublicOfGamers.hoverOverInnovationMenu(getDriver());
        RepublicOfGamers.clickArmoryBtn();
        String Title = getPageTitle();
        Assert.assertEquals(Title, "Armoury-Crate | US | For Those Who Dare");
        waitFor(1);
        ArmouryCratePage.clickLaptopPlusIcon();
        waitFor(1);
        ArmouryCratePage.clickMousePlusIcon();
        waitFor(1);
        ArmouryCratePage.clickMonitorPlusIcon();
        waitFor(1);
        ArmouryCratePage.clickHeadSetPlusIcon();
        waitFor(1);
        ArmouryCratePage.clickKeyboardPlusIcon();
        waitFor(1);
        ArmouryCratePage.clickMousePadPlusIcon();
        waitFor(1);
        ArmouryCratePage.clickMotherBoardPlusIcon();
        waitFor(1);
        ArmouryCratePage.clickCPULiquidCoolerPlusIcon();
        waitFor(1);
        ArmouryCratePage.clickVGAPlusIcon();

    }
}
