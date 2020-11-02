package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.KaolaPalace02Pages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class KoalaPalace01StepDefinitions {
    KaolaPalace02Pages roomCreation = new KaolaPalace02Pages();

    @Given("user is on the Koalapalace page")
    public void user_is_on_the_koalapalace_page() {
        roomCreation.hotelManagement.sendKeys(ConfigReader.getProperty("koala_url"));
    }

    @Given("user clicks on the first log in button")
    public void user_clicks_on_the_first_log_in_button() {

    }
    @When("user enter username")
    public void user_enter_username() {

    }
    @When("user enter password")
    public void user_enter_password() {

    }
    @When("user clicks on log in button")
    public void user_clicks_on_log_in_button() {

    }
    @When("user clicks on Hotel Management button")
    public void user_clicks_on_hotel_management_button() {

    }
    @When("user clicks on Hotel Rooms")
    public void user_clicks_on_hotel_rooms() {

    }
    @When("user clicks on Add Hotel Room button")
    public void user_clicks_on_add_hotel_room_button() {

    }
    @When("user select hotel on the page")
    public void user_select_hotel_on_the_page() {

    }
    @When("user enter code")
    public void user_enter_code() {

    }
    @When("user enter name")
    public void user_enter_name() {

    }
    @When("user enter location")
    public void user_enter_location() {

    }
    @When("user enter description")
    public void user_enter_description() {

    }
    @When("user enter price")
    public void user_enter_price() {

    }
    @When("user enter room type")
    public void user_enter_room_type() {

    }
    @When("user enter max Adult count")
    public void user_enter_max_adult_count() {

    }
    @When("user enter max Children count")
    public void user_enter_max_children_count() {

    }
    @When("user click approved button")
    public void user_click_approved_button() {

    }
    @When("user clicks save button")
    public void user_clicks_save_button() {

    }
    @Then("verify the message")
    public void verify_the_message() {

    }

}
