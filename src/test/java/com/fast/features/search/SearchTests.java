package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void search(){
        searchSteps.navigateToSearchPage();
        searchSteps.searchBox(Constants.SEARCH_TEXT);
        searchSteps.searchIcon();
        searchSteps.appearSearchResultPage();
    }

    @Test
    public void searchWithBlankField(){
        searchSteps.navigateToSearchPage();
        searchSteps.searchIcon();
        searchSteps.appearEnterSearchKeywordMessage();
    }
}
