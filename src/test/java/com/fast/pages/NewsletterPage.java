package com.fast.pages;

import com.fast.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")
public class NewsletterPage extends PageObject{

    @FindBy (css = "#newsletter-input")
    private WebElementFacade newsletterField;

    @FindBy (css = "button.btn.btn-default.button.button-small")
    private WebElementFacade newsletterButton;

    @FindBy (css = ".alert.alert-success")
    private WebElementFacade newsletterSuccessMessage;


    public void setNewsletterField(String email){
        typeInto(newsletterField, email);
    }

    public void clickOnNewsletterButton(){
        newsletterButton.click();
    }

    public void appearnewsletterSuccessMessage(){
        newsletterSuccessMessage.shouldContainText(Constants.NEWSLETTER_SUCCESS_MESSAGE);
    }
}
