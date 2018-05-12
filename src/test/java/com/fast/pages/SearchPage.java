package com.fast.pages;

import com.fast.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://automationpractice.com/index.php")
public class SearchPage extends PageObject{


    @FindBy(css = "#search_query_top")
    private WebElementFacade searchBox;

    @FindBy(css = ".button-search")
    private WebElementFacade searchIcon;

    @FindBy(css = ".breadcrumb")
    private WebElementFacade searchPage;

    @FindBy(css = ".product-name")
    private WebElementFacade productName;

    @FindBy (css = ".alert-warning")
    private WebElementFacade enterSearchKeywordMessage;


    public void setSearchBox(String text){
        typeInto(searchBox, text);
    }

    public void clickSearchIcon(){
        searchIcon.click();
    }

    public void appearSearchResultPage(){
        searchPage.shouldContainText(Constants.SEARCH_RESULTS);
    }

    public void appearEnterSearchKeywordMessage(){
        enterSearchKeywordMessage.shouldContainText(Constants.ENTER_SEARCH_KEYWORD_MESSAGE);
    }
}
