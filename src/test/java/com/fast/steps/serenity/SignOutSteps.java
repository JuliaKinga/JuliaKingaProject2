package com.fast.steps.serenity;

import com.fast.pages.SignOutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignOutSteps extends ScenarioSteps{

    SignOutPage signOutPage;

    @Step
    public void clickOnSignOutButton(){
        signOutPage.clickOnSignOutButton();
    }

    @Step
    public void appearSignInButton(){
        signOutPage.appearSignInButton();
    }
}
