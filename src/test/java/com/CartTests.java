package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    CartSteps cartSteps;


    @Test
    public void addToCart() {
        loginSteps.loginPage();
        searchSteps.searchOnSite(Constants.SEARCH_TEXT);
        cartSteps.clickOnRandomProduct();
        cartSteps.selectedProductPage();
        cartSteps.ifSizeEnabled();
        cartSteps.ifColorEnabled();
        cartSteps.clickOnAddToCartButton();
        cartSteps.clickOnProceedToCheckout();
        cartSteps.shoppingCartPage();
    }

    @Test
    public void deleteProduct(){
        loginSteps.loginPage();
        searchSteps.searchOnSite(Constants.SEARCH_TEXT);
        cartSteps.addToCart();
        cartSteps.clickOnTrashIcon();
        cartSteps.emptyCartPageMessage();
    }

    @Test
    public void addOneQuantity(){
        loginSteps.loginPage();
        searchSteps.searchOnSite(Constants.SEARCH_TEXT);
        cartSteps.addToCart();
        cartSteps.doublePriceIsCorrect();
    }

}
