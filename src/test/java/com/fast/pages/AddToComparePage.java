package com.fast.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddToComparePage extends PageObject{

    @FindBy(css = ".compare")
    private List<WebElementFacade> addToCompare;

    @FindBy(css = ".top-pagination-content.clearfix :first-child.compare-form")
    private WebElementFacade compareButton;

    public void clickOnAddToCompare(){
        addToCompare.get(com.fast.Random.randomNumbers(0, addToCompare.size()-1)).click();
    }
}
