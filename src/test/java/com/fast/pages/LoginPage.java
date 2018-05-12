package com.fast.pages;

import com.fast.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject{

    @FindBy(css = "#email")
    private WebElementFacade emailField;

    @FindBy(css = "#passwd")
    private WebElementFacade passwordField;

    @FindBy(css = "#SubmitLogin")
    private WebElementFacade loginButton;

    @FindBy(css = ".breadcrumb")
    private WebElementFacade myAccountPage;

    @FindBy (css = ".alert-danger p")
    private WebElementFacade loginErrorMessage;


    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void appearMyAccountPage(){
       myAccountPage.shouldContainText(Constants.MY_ACCOUNT_TEXT);
    }

    public void appearLoginErrorMessage(){
        loginErrorMessage.shouldContainText(Constants.LOGIN_ERROR_MESSAGE);
    }
}
