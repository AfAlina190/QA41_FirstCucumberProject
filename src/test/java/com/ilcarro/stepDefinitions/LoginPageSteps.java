package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginPageSteps {

    @And("User clicks on Log in Link")
    public void click_on_login_link(){

        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enters_valid_data(){

        new LoginPage(driver)
                .enterData("afali24@gmail.com","123456Qwe@");
    }

    @And("User clicks on Yalla button")
    public void clicks_on_Yalla_button(){

        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success Message is displayed")
    public void verify_Success_Message(){

        new LoginPage(driver)
                .isMessageTextPresent("Logged in success");
    }

    @And("User enters valid email and invalid password")
    public void enter_valid_email_invalid_password(DataTable table){
        new LoginPage(driver)
                .enterInvalidPassword(table);
    }

    @Then("User verifies Error Message is displayed")
    public void verify_Error(){
        new LoginPage(driver)
                .isMessageTextPresent("\"Login or Password incorrect\"");

    }









}
