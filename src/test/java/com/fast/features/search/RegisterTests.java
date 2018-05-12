package com.fast.features.search;

import com.fast.Random;
import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class  RegisterTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void createAccount(){
        registerSteps.createEmail(Random.randomEmail());
        registerSteps.clickCreateAccountButton();
        registerSteps.authenticationPage();
        registerSteps.firstName(Random.randomTextNine());
        registerSteps.lastName(Random.randomTextNine());
        registerSteps.password(Random.randomTextNine());
        registerSteps.address(Random.randomTextNine());
        registerSteps.city(Random.randomTextNine());
        registerSteps.selectState();
        registerSteps.zip(Random.randomNumbers(10000,99999));
        registerSteps.country();
        registerSteps.mobile(Random.randomNumbers(100000000, 999999999));
        registerSteps.assignAddress(Random.randomTextNine());
        registerSteps.registerButton();
        registerSteps.myAccountPage();
    }

    @Test
    public void requiredFields(){
        registerSteps.createEmail(Random.randomEmail());
        registerSteps.clickCreateAccountButton();
        registerSteps.registerButton();
        registerSteps.alertMessage();
    }
}
