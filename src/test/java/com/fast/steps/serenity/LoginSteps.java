package com.fast.steps.serenity;

import com.fast.Constants;
import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps{

    LoginPage loginPage;

    @Step
    public void navigateToLoginPage(){ loginPage.open(); }

    @Step
    public void emailField(String email){
        loginPage.setEmailField(email);
    }

    @Step
    public void passwordField(String password){
        loginPage.setPasswordField(password);
    }

    @Step
    public void loginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void myAccountPage(){
        loginPage.appearMyAccountPage();
    }

    @Step
    public void appearLoginErrorMessage(){
        loginPage.appearLoginErrorMessage();
    }

    @StepGroup
    public void loginPage() {
        navigateToLoginPage();
        emailField(Constants.LOGIN_EMAIL);
        passwordField(Constants.LOGIN_PASSWORD);
        loginButton();
        myAccountPage();
    }
}
