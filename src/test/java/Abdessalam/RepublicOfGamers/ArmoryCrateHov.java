package Abdessalam.RepublicOfGamers;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import AbdessalamPages.ArmouryCratePage;
import AbdessalamPages.RepublicOfGamersHomePage;

public class ArmoryCrateHov extends CommonAPI {
    @Test
    public void ArmoryCrate() {
        RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());
        ArmouryCratePage ArmouryCratePage = new ArmouryCratePage(getDriver());

        RepublicOfGamers.clickCookiesAcceptBtn();
        RepublicOfGamers.hoverOverInnovationMenu(getDriver());
        RepublicOfGamers.clickArmoryBtn();
        String Title = getPageTitle();
        Assert.assertEquals(Title, "Armoury-Crate | US | For Those Who Dare");
        waitFor(2);
        ArmouryCratePage.hoverOverAuraSyncLogo(getDriver());
        waitFor(1);
        ArmouryCratePage.hoverOverEasyDeviceConfigurationLogo(getDriver());
        waitFor(1);
        ArmouryCratePage.hoverOverFastHelpUpDateLogo(getDriver());
        waitFor(1);
        ArmouryCratePage.hoverOverNewNInboxLogo(getDriver());
        waitFor(1);
        ArmouryCratePage.hoverOverSimpleAccountManagementLogo(getDriver());
        waitFor(2);


    }
}
