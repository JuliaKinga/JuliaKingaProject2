package com.fast.steps.serenity;

import com.fast.pages.AddToComparePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddToCompareSteps extends ScenarioSteps{

    AddToComparePage addToComparePage;

    @Step
    public void clickOnAddToCompare(){
        addToComparePage.clickOnAddToCompare();
    }
}
