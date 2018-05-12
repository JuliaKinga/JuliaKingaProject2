package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.AddToWishlistSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddToWishlistTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    AddToWishlistSteps addToWishlistSteps;

    @Test
    public void addToWishlist(){
        loginSteps.loginPage();
        searchSteps.searchOnSite(Constants.SEARCH_TEXT);
        addToWishlistSteps.clickOnAddToWishlist();
        addToWishlistSteps.appearAddedToYourWishlistMessage();
    }
}
