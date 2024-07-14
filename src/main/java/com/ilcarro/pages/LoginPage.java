package com.ilcarro.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;
    public LoginPage enterData(String email, String password) {
        type(emailInput,email);
        type(passwordInput,password);

        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;
    public LoginPage clickOnYallaButton() {
        click(submitButton);

        return this;
    }

    @FindBy(css = ".message")
    WebElement successMessage;
    public LoginPage isMessageTextPresent(String message) {

        pause(1000);
        assert successMessage.getText().contains(message);

        return this;
    }

    public LoginPage enterInvalidPassword(DataTable table) {

        List<Map<String,String>> dataTable = table.asMaps();

        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        enterData(email,password);

        return this;
    }

    @FindBy(css = ".positive-button")
    WebElement okButton;
    public HomePage clickOnOKButton() {
        click(okButton);
        return new HomePage(driver);
    }
}
