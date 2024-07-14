package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetCarWorkPage extends BasePage{
    public LetCarWorkPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "pickUpPlace")
    WebElement locationInput;

    public LetCarWorkPage enterLocation(String city) {
        locationInput.sendKeys(city);
        pause(2000);
        locationInput.sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement manufactureInput;

    public LetCarWorkPage enterCarManufacture(String manufacture) {
        type(manufactureInput, manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement modelInput;

    public LetCarWorkPage enterCarModel(String model) {
        type(modelInput, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement yearInput;

    public LetCarWorkPage enterCarYear(String year) {
        type(yearInput, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement fuelInput;

    public LetCarWorkPage enterCarFuel() {
        click(fuelInput);
        fuelInput.sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }

    @FindBy(id = "seats")
    WebElement seatsInput;

    public LetCarWorkPage enterCarSeats(String seats) {
        seatsInput.sendKeys(seats);
        return this;
    }

    @FindBy(id = "class")
    WebElement classInput;

    public LetCarWorkPage enterCarClass(String carClass) {
        classInput.sendKeys(carClass);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement serialNumberInput;

    public LetCarWorkPage enterCarNumber(String number) {
        serialNumberInput.sendKeys(number);
        return this;
    }

    @FindBy(id = "price")
    WebElement priceInput;

    public LetCarWorkPage enterCarPrice(String price) {
        priceInput.sendKeys(price);
        return this;
    }

    @FindBy(id = "about")
    WebElement aboutInput;

    public LetCarWorkPage fillTextBox(String text) {
        aboutInput.sendKeys(text);
        aboutInput.sendKeys(Keys.PAGE_DOWN);
        return this;
    }

    @FindBy(css = "[for='photos']")
    WebElement photosLabel;

    @FindBy(id = "photos")
    WebElement photosInput;

    @FindBy(css = ".icon-cancel-circled")
    WebElement cancelIcon;

    public LetCarWorkPage uploadPhotos(String path) {
        pause(2000);
        click(photosLabel);
        pause(2000);
        photosInput.sendKeys(path);
        pause(2000);
        click(cancelIcon);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;

    public LetCarWorkPage clickOnSubmitButton() {
        submitButton.click();
        return this;
    }

    @FindBy(css = ".dialog-container>h2")
    WebElement successMessage;

    public LetCarWorkPage isMessageTextPresent(String message) {
        pause(1000);
        assert successMessage.getText().contains(message);
        return this;
    }
}
