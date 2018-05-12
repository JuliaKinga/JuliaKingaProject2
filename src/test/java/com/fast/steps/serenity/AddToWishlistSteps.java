package com.fast.steps.serenity;

import com.fast.pages.AddToWishlistPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddToWishlistSteps extends ScenarioSteps{

    AddToWishlistPage addToWishlistPage;

    @Step
    public void clickOnAddToWishlist(){
        addToWishlistPage.clickOnAddToWishlist();
    }

    @Step
    public void appearAddedToYourWishlistMessage(){
        addToWishlistPage.appearAddedToYourWishlistMessage();
    }
}
