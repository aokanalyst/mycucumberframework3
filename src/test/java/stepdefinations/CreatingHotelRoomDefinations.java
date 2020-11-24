package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CreatingHotelRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class CreatingHotelRoomDefinations {


    CreatingHotelRoomPage creatingHotelRoomPage = new CreatingHotelRoomPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
    }

    @Given("user clicks login button")
    public void user_clicks_login_button() {
        creatingHotelRoomPage.loginButton.click();
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        creatingHotelRoomPage.usernameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        creatingHotelRoomPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("user clicks login")
    public void user_clicks_login() {
        creatingHotelRoomPage.loginClick.click();
    }


    @When("user clicks hotel management")
    public void user_clicks_hotel_management() {
        creatingHotelRoomPage.hotelManagement.click();
    }

    @When("user clicks hotel rooms")
    public void user_clicks_hotel_rooms() {
        creatingHotelRoomPage.hotelRooms.click();
    }

    @When("user clicks add hotelroom button")

    public void user_clicks_add_hotelroom_button() throws InterruptedException {

        Thread.sleep(3000);
       // Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        creatingHotelRoomPage.addHotelRoomButton.click();
    }

    @When("user selects idhotel")
    public void user_selects_idhotel() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(creatingHotelRoomPage.idHotelDropdown);
        select.selectByIndex(1);
    }

    @When("user enters the code")
    public void user_enters_the_code() {
        creatingHotelRoomPage.code.sendKeys(ConfigReader.getProperty("code"));
    }

    @When("user enters the name")
    public void user_enters_the_name() {
        creatingHotelRoomPage.name.sendKeys(ConfigReader.getProperty("name"));
    }

    @When("user enters the location")
    public void user_enters_the_location() {
        creatingHotelRoomPage.location.sendKeys(ConfigReader.getProperty("location"));
    }

    @When("user enters description")
    public void user_enters_description() {
        creatingHotelRoomPage.description.sendKeys(ConfigReader.getProperty("description"));
    }

    @When("user enter the price")
    public void user_enter_the_price() {
        creatingHotelRoomPage.priceBox.sendKeys(ConfigReader.getProperty("price"));
    }

    @When("user selects the room type")
    public void user_selects_the_room_type() {
        Select select1 = new Select(creatingHotelRoomPage.roomTypeDropdown);
        select1.selectByVisibleText("King");
    }

    @When("user enters the max adult count")
    public void user_enters_the_max_adult_count() {
        creatingHotelRoomPage.maxAdultCount.sendKeys(ConfigReader.getProperty("maxAdultCount"));
    }

    @When("user enters the max children count")
    public void user_enters_the_max_children_count() {
        creatingHotelRoomPage.maxChildrenCount.sendKeys(ConfigReader.getProperty("maxChildrenCount"));
    }

    @When("user clicks approved button")
    public void user_clicks_approved_button() {
        creatingHotelRoomPage.approvedCheckbox.click();
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        creatingHotelRoomPage.saveButton.click();
    }

    @When("user verifys the alert has successfully")
    public void user_verifys_the_alert_has_successfully() throws InterruptedException {
        Thread.sleep(5000);
        String successMessageText = creatingHotelRoomPage.successMessage.getText();
      //  Assert.assertTrue(successMessageText.contains("HotelRoom was inserted successfully"));
        Assert.assertEquals(successMessageText, "HotelRoom was inserted successfully");

    }

    @When("user clicks ok button")
    public void user_clicks_ok_button() {
        creatingHotelRoomPage.okButton.click();
        Driver.closeDriver();
    }

    @When("user input the code to the code box")
    public void user_input_the_code_to_the_code_box() throws InterruptedException {
        Thread.sleep(5000);
        creatingHotelRoomPage.searchBox.sendKeys(ConfigReader.getProperty("hotel_id"));
    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        creatingHotelRoomPage.searchButton.click();
    }

    @Then("verify name field with your hotel name")
    public void verify_name_field_with_your_hotel_name() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(ConfigReader.getProperty("hotel_id"),creatingHotelRoomPage.nameField.getText());
        Driver.closeDriver();

    }
}