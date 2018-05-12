package com.fast.steps.serenity;

import com.fast.pages.NewsletterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewsletterSteps extends ScenarioSteps{

    NewsletterPage newsletterPage;

    @Step
    public void setNewsletterField(String email){
        newsletterPage.open();
        newsletterPage.setNewsletterField(email);
    }

    @Step
    public void clickOnNewsletterButton(){
        newsletterPage.clickOnNewsletterButton();
    }

    @Step
    public void appearnewsletterSuccessMessage(){
        newsletterPage.appearnewsletterSuccessMessage();
    }
}
