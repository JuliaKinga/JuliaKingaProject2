package com.fast.steps.serenity;

import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps{

    RegisterPage registerPage;

    @Step
    public void createEmail(String email){
        registerPage.open();
        registerPage.setCreateEmailField(email);
    }

    @Step
    public void clickCreateAccountButton(){
        registerPage.clickCreateAccountButton();
    }

    @Step
    public void authenticationPage(){
        registerPage.appearAuthenticationPage();
    }

    @Step
    public void firstName(String text){
        registerPage.setFirstNameField(text);
    }

    @Step
    public void lastName(String text){
        registerPage.setLastNameField(text);
    }

    @Step
    public void password(String text){
        registerPage.setPasswordField(text);
    }

    @Step
    public void address(String text){
        registerPage.setAddressField(text);
    }

    @Step
    public void city(String text){
        registerPage.setCityField(text);
    }

    @Step
    public void selectState(){
        registerPage.selectStateField();
    }

    @Step
    public void zip(int numbers){
        registerPage.setZipField(numbers);
    }

    @Step
    public void country(){
        registerPage.selectCountryField();
    }

    @Step
    public void mobile(int numbers){ registerPage.setMobileField(numbers); }

    @Step
    public void assignAddress(String text){
        registerPage.setAssignAddressField(text);
    }

    @Step
    public void registerButton(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void myAccountPage(){
        registerPage.myAccountPage();
    }

    @Step
    public void alertMessage(){
        registerPage.appearAlertMessage();
    }
}
