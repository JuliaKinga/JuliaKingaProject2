package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.CheckoutSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    CheckoutSteps checkoutSteps;

    @Test
    public void checkout(){
        loginSteps.loginPage();
        searchSteps.searchOnSite(Constants.SEARCH_TEXT);
        cartSteps.addToCart();
        checkoutSteps.clickOnProceedToCheckoutButton();
        checkoutSteps.clickOnProceedToCheckoutButtonFromAddress();
        checkoutSteps.clickOnAgreeField();
        checkoutSteps.clickOnProceedToCheckoutFromShipping();
        checkoutSteps.clickOnBankWire();
        checkoutSteps.clickOnConfirmOrderButton();
        checkoutSteps.appearOrderConfirmationMessage();
    }
}
