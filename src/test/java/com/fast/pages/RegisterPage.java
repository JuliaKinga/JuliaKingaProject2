package com.fast.pages;

import com.fast.Constants;
import com.fast.Random;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class RegisterPage extends PageObject{

    @FindBy(css = "#email_create")
    private WebElementFacade createEmailField;

    @FindBy(css = "#SubmitCreate")
    private WebElementFacade createAccountButton;

    @FindBy(css = ".breadcrumb")
    private WebElementFacade authenticationPage;

    @FindBy(css = "#customer_firstname")
    private WebElementFacade firstNameField;

    @FindBy(css = "#customer_lastname")
    private WebElementFacade lastNameField;

    @FindBy(css = "#passwd")
    private WebElementFacade passwordField;

    @FindBy(css = "#address1")
    private WebElementFacade addressField;

    @FindBy(css = "#city")
    private WebElementFacade cityField;

    @FindBy(css = "#id_state")
    private WebElementFacade stateField;

    @FindBy(css = "#postcode")
    private WebElementFacade zipField;

    @FindBy(css = "#id_country")
    private WebElementFacade countryField;

    @FindBy(css = "#phone_mobile")
    private WebElementFacade mobileField;

    @FindBy(css = "#alias")
    private WebElementFacade assignAddressField;

    @FindBy(css = "#submitAccount")
    private WebElementFacade registerButton;

    @FindBy(css = ".alert")
    private WebElementFacade alertMessage;


    public void setCreateEmailField(String email){
        typeInto(createEmailField, email);
    }

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public void appearAuthenticationPage(){
        authenticationPage.shouldContainText(Constants.AUTHENTICATION_TEXT);
    }

    public void setFirstNameField(String text) {
        typeInto(firstNameField, text);
    }

    public void setLastNameField(String text){
        typeInto(lastNameField, text);
    }

    public void setPasswordField(String text){
        typeInto(passwordField, text);
    }

    public void setAddressField(String text){
        typeInto(addressField, text);
    }

    public void setCityField(String text){
        typeInto(cityField, text);
    }

    public void selectStateField() {
        Select statusDropDown = new Select(stateField);
        List<WebElement> stateList = statusDropDown.getOptions();
        int randomState = Random.randomNumbers(1,stateList.size() - 1);
        statusDropDown.selectByIndex(randomState);
    }

    public void setZipField(int numbers){
        typeInto(zipField, String.valueOf(numbers));
    }

    public void selectCountryField(){
        Select countryDropDown = new Select(countryField);
        List<WebElement> countryList = countryDropDown.getOptions();
        int randomCountry = Random.randomNumbers(1, countryList.size()-1);
        countryDropDown.selectByIndex(randomCountry);
    }

    public void setMobileField(int numbers){
        typeInto(mobileField, String.valueOf(numbers));
    }

    public void setAssignAddressField(String numbers){
        typeInto(assignAddressField, numbers);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void myAccountPage(){
        authenticationPage.shouldContainText(Constants.MY_ACCOUNT_TEXT);
    }

    public void appearAlertMessage(){
        alertMessage.shouldBeCurrentlyVisible();
    }
}
