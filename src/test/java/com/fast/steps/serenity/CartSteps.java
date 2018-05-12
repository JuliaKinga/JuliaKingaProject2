package com.fast.steps.serenity;

import com.fast.Constants;
import com.fast.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps{

    CartPage cartPage;

    @Step
    public void clickOnRandomProduct(){
        cartPage.clickRandomProduct();
    }

    @Step
    public void selectedProductPage(){
        cartPage.selectedProductPage();
    }

    @Step
    public void ifSizeEnabled(){
        cartPage.ifSizeEnabled();
    }

    @Step
    public void ifColorEnabled(){
        cartPage.ifColorEnabled();
    }

    @Step
    public void clickOnAddToCartButton(){
        cartPage.clickOnAddToCartButton();
    }

    @Step
    public void clickOnProceedToCheckout(){ cartPage.clickOnProceedToCheckoutButton(); }

    @Step
    public void shoppingCartPage(){
        cartPage.appearShoppingCartPage();
    }

    @Step
    public void clickOnTrashIcon(){ cartPage.clickOnTrashIcon(); }

    @Step
    public void emptyCartPageMessage(){ cartPage.emptyCartPageMessage(); }

    @Step
    public void doublePriceIsCorrect(){
        Assert.assertTrue(Constants.VALUES_DO_NOT_MATCH,cartPage.doublePriceIsCorrect());
    }

    @StepGroup
    public void addToCart(){
        clickOnRandomProduct();
        selectedProductPage();
        ifSizeEnabled();
        ifColorEnabled();
        clickOnAddToCartButton();
        clickOnProceedToCheckout();
        shoppingCartPage();
    }
}
