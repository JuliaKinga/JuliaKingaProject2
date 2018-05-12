package com.fast.pages;

import com.fast.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject{

    @FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = "button.btn.btn-default.button-medium")
    private WebElementFacade proceedToCheckoutButtonFromAddress;

    @FindBy(css = ".checker")
    private WebElementFacade agreeField;

    @FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
    private WebElementFacade proceedToCheckoutFromShipping;

    @FindBy(css = ".bankwire")
    private WebElementFacade bankWire;

    @FindBy(css = "button.btn.btn-default.button-medium")
    private WebElementFacade confirmOrderButton;

    @FindBy(css = ".breadcrumb ")
    private WebElementFacade orderConfirmationPage;


    public void clickOnProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }

    public void clickOnProceedToCheckoutButtonFromAddress(){
        proceedToCheckoutButtonFromAddress.click();
    }

    public void clickOnAgreeField(){
        agreeField.click();
    }

    public void clickOnProceedToCheckoutFromShipping(){
        proceedToCheckoutFromShipping.click();
    }

    public void clickOnBankWire(){
        bankWire.click();
    }

    public void clickOnConfirmOrderButton(){
        confirmOrderButton.click();
    }

    public void appearOrderConfirmationMessage(){
        orderConfirmationPage.shouldContainText(Constants.ORDER_CONFIRMATION_MESSAGE);
    }
}
