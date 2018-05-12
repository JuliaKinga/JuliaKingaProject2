package com.fast.features.search;

import com.fast.Constants;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void login(){
        loginSteps.navigateToLoginPage();
        loginSteps.emailField(Constants.LOGIN_EMAIL);
        loginSteps.passwordField(Constants.LOGIN_PASSWORD);
        loginSteps.loginButton();
        loginSteps.myAccountPage();
    }

    @Test
    public void loginWithBlankField(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginButton();
        loginSteps.appearLoginErrorMessage();
    }
}
