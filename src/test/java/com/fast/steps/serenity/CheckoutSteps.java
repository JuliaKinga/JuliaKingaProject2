package com.fast.steps.serenity;

import com.fast.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps{

    CheckoutPage checkoutPage;

    @Step
    public void clickOnProceedToCheckoutButton(){
        checkoutPage.clickOnProceedToCheckoutButton();
    }

    @Step
    public void clickOnProceedToCheckoutButtonFromAddress(){
        checkoutPage.clickOnProceedToCheckoutButtonFromAddress();
    }

    @Step
    public void clickOnAgreeField(){
        checkoutPage.clickOnAgreeField();
    }

    @Step
    public void clickOnProceedToCheckoutFromShipping(){
        checkoutPage.clickOnProceedToCheckoutFromShipping();
    }

    @Step
    public void clickOnBankWire(){
        checkoutPage.clickOnBankWire();
    }

    @Step
    public void clickOnConfirmOrderButton(){
        checkoutPage.clickOnConfirmOrderButton();
    }

    @Step
    public void appearOrderConfirmationMessage(){
        checkoutPage.appearOrderConfirmationMessage();
    }
}
