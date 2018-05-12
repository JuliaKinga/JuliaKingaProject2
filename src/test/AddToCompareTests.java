package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.AddToCompareSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddToCompareTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    AddToCompareSteps addToCompareSteps;

    @Test
    public void addToCompare(){
        loginSteps.loginPage();
        searchSteps.searchOnSite(Constants.SEARCH_TEXT);
        addToCompareSteps.clickOnAddToCompare();
    }
}
