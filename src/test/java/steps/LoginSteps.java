package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        openBrowserAndLaunchApplication();
    }
    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        WebElement usernamefield = driver.findElement(By.id("txtUsername"));
//        usernamefield.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(usernamefield, ConfigReader.getPropertyValue("username"));
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        sendText(passwordField, ConfigReader.getPropertyValue("password"));
        // passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
    }
    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user see error message on the screen")
    public void user_see_error_message_on_the_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
