package com.fast.features.search;

import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.SignOutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SignOutTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    SignOutSteps signOutSteps;

    @Test
    public void signOut(){
        loginSteps.loginPage();
        signOutSteps.clickOnSignOutButton();
        signOutSteps.appearSignInButton();
    }
}
