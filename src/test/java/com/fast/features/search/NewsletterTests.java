package com.fast.features.search;

import com.fast.Random;
import com.fast.steps.serenity.NewsletterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class NewsletterTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    NewsletterSteps newsletterSteps;

    @Test
    public void newsletter(){
        newsletterSteps.setNewsletterField(Random.randomEmail());
        newsletterSteps.clickOnNewsletterButton();
        newsletterSteps.appearnewsletterSuccessMessage();
    }
}
