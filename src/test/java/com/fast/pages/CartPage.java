package com.fast.pages;

import com.fast.Constants;
import com.fast.Random;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class CartPage extends PageObject{

    @FindBy(css = "li.ajax_block_product div .left-block")
    private List<WebElementFacade> productList;

    @FindBy(css = "#bigpic")
    private WebElementFacade selectedProductPage;

    @FindBy(css = ".form-control.attribute_select.no-print")
    private WebElementFacade sizeField;

    @FindBy(css = ".attribute_list #color_to_pick_list")
    private WebElementFacade colorField;

    @FindBy(css = "#color_to_pick_list")
    private List<WebElementFacade> colorListField;

    @FindBy(css = "button.exclusive")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".btn.btn-default.button.button-medium")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = ".breadcrumb")
    private WebElementFacade shoppingCartPage;

    @FindBy(css = ".icon-trash")
    private WebElementFacade trashIcon;

    @FindBy(css = ".alert")
    private WebElementFacade emptyCartPage;

    @FindBy(css = ".cart_unit span .price")
    private WebElementFacade unitPrice;

    @FindBy(css = ".cart_quantity_up.btn.btn-default.button-plus")
    private WebElementFacade plusIcon;

    @FindBy(css = "#total_product")
    private WebElementFacade totalPrice;


    public void clickRandomProduct(){
        productList.get(RandomUtils.nextInt(0, productList.size()-1)).click();
    }

    public void selectedProductPage() {
        selectedProductPage.isPresent();
    }

    public void ifSizeEnabled(){
        if(sizeField.isPresent()){
            Select sizeDropDown = new Select(sizeField);
            List<WebElement> sizeList = sizeDropDown.getOptions();
            int randomSize = Random.randomNumbers(0, sizeList.size()-1);
            sizeDropDown.selectByIndex(randomSize);
        }else System.out.println(Constants.SIZE_NOT_PRESENT_MESSAGE);
    }

    public void ifColorEnabled(){
        if(colorField.isPresent()){
            colorListField.get(Random.randomNumbers(0, colorListField.size()-1)).click();
        }else System.out.println(Constants.COLOR_NOT_PRESENT_MESSAGE);
    }

    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }

    public void clickOnProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }

    public void appearShoppingCartPage(){
        shoppingCartPage.shouldContainText(Constants.SHOPPING_CART_PAGE_MESSAGE);
    }

    public void clickOnTrashIcon(){ trashIcon.click(); waitABit(3000);}

    public void emptyCartPageMessage(){ emptyCartPage.shouldContainText(Constants.EMPTY_SHOPPING_CART_MESSAGE); }

    private double getUnitPriceValue(){
        String unitPriceValueString = unitPrice.getText();
        String unitPriceValueStringWithoutDollar = unitPriceValueString.substring(1);
        double unitPriceValueDouble = Double.valueOf(unitPriceValueStringWithoutDollar);
        return unitPriceValueDouble;
    }

    private void clickOnPlusIcon(){
        plusIcon.click();
    }

    private double getDoublePriceValue(){
        String doublePriceValueString = totalPrice.getText();
        String doublePriceValueStringWithoutDollar = doublePriceValueString.substring(1);
        double doublePriceValueDouble = Double.valueOf(doublePriceValueStringWithoutDollar);
        return doublePriceValueDouble;
    }

    public boolean doublePriceIsCorrect(){
        double oldValue = getUnitPriceValue();
        clickOnPlusIcon();
        waitABit(2000);
        double increaseValue = getDoublePriceValue();
        return increaseValue == oldValue * 2;
    }

    }


