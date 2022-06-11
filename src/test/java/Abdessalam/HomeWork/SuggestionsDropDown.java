package Abdessalam.HomeWork;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ShittyPage;

public class SuggestionsDropDown extends CommonAPI {
        @Test
        public void SuggestionsDropDown() {
            ShittyPage ShittyPage = new ShittyPage(getDriver());

            ShittyPage.typeSuggestions();
            waitFor(2);
            ShittyPage.suggestDropDown(getDriver());
            waitFor(2);
        }
    }