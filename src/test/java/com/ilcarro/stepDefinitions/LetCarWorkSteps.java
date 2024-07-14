package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetCarWorkPage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;

import static com.ilcarro.pages.BasePage.driver;

public class LetCarWorkSteps {

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    LetCarWorkPage letCarWork = new LetCarWorkPage(driver);


    @And("User clicks on OK button")
    public void clicks_on_OK_button() {
        login.clickOnOKButton();
    }

    @And("User clicks on Let the car work link")
    public void clicks_on_Let_car_work_link() {
        home.clickOnLetCarWorkLink();
    }

    @And("User enters Location")
    public void enters_Location() {
        letCarWork.enterLocation("Haifa");
    }

    @And("User enters Car Manufacture")
    public void enters_Car_Manufacture(){
        letCarWork.enterCarManufacture("BMW");
    }

    @And("User enters Car Model")
    public void enters_Car_Model(){
        letCarWork.enterCarModel("X6");
    }

    @And("User enters Car Year")
    public void enters_Car_Year(){
        letCarWork.enterCarYear("2023");
    }

    @And("User enters Car Fuel")
    public void enters_Car_Fuel(){
        letCarWork.enterCarFuel();
    }

    @And("User enters Car Seats")
    public void enters_Car_Seats(){
        letCarWork.enterCarSeats("5");
    }

    @And("User enters Car class")
    public void enters_Car_class(){
        letCarWork.enterCarClass("compact");
    }

    @And("User enters Car registration number")
    public void enters_Car_registration_number(){
        letCarWork.enterCarNumber("332AL");
    }

    @And("User enters Car Price")
    public void enters_Car_Price(){
        letCarWork.enterCarPrice("52");
    }

    @And("User fills the text box About")
    public void fills_text_box_About(){
        letCarWork.fillTextBox("No smoking!");
    }

    @And("User clicks Add photos of your car and uploads photo")
    public void clicks_Add_photos_and_uploads_photo(){
        letCarWork.uploadPhotos("C:/Users/afali/1.jpg");
    }

    @And("User clicks Submit button")
    public void clicks_Submit_button(){
        letCarWork.clickOnSubmitButton();
    }

    @And("User verifies Success Message appears")
    public void verifies_Success_Message_appears(){
        letCarWork.isMessageTextPresent("BMW X6 added successful");
    }
}
