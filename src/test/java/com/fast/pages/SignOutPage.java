package com.fast.pages;

import com.fast.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SignOutPage extends PageObject{

    @FindBy (css = ".logout")
    private WebElementFacade signOutButton;

    @FindBy (css = ".login")
    private WebElementFacade signInButton;


    public void clickOnSignOutButton(){
        signOutButton.click();
    }

    public void appearSignInButton(){
        signInButton.shouldContainText(Constants.SIGN_IN_BUTTON);
    }
}
