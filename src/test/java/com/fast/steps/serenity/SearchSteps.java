package com.fast.steps.serenity;

import com.fast.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {

    SearchPage searchPage;

    @Step
    public void navigateToSearchPage(){
        searchPage.open();
    }

    @Step
    public void searchBox(String text){
        searchPage.setSearchBox(text);
    }

    @Step
    public void searchIcon(){
        searchPage.clickSearchIcon();
    }

    @Step
    public void appearSearchResultPage(){
        searchPage.appearSearchResultPage();
    }

    @Step
    public void appearEnterSearchKeywordMessage(){
        searchPage.appearEnterSearchKeywordMessage();
    }


    @StepGroup
    public void searchOnSite(String text) {
        searchBox(text);
        searchIcon();
        appearSearchResultPage();
    }
}
