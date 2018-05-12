package com.fast.pages;

import com.fast.Constants;
import com.fast.Random;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddToWishlistPage extends PageObject{

    @FindBy(css = ".wishlist")
    private List<WebElementFacade> addToWishlist;

    @FindBy(css = ".fancybox-outer")
    private WebElementFacade addedToYourWishlist;


    public void clickOnAddToWishlist(){
        addToWishlist.get(Random.randomNumbers(0, addToWishlist.size()-1)).click();
    }

    public void appearAddedToYourWishlistMessage(){
        addedToYourWishlist.shouldContainText(Constants.ADDED_TO_YOUR_WISHLIST_MESSAGE);
    }
}
