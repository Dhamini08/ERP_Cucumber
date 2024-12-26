package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupplierTest {
   public static WebDriver driver;
    @Given("Launch browser")
    public void launch_browser() throws Throwable
    {
       driver = FunctionLibrary.startBrowser();
    }

    @When("Launch url {string}")
    public void launch_url(String url) {
        FunctionLibrary.openUrl();
    }

    @When("wait for username with {string} and {string}")
    public void wait_for_username_with_and(String LocatorType, String LocatorValue) {
       FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
    }

    @When("enter username with {string} and {string} and {string}")
    public void enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData) {
       FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
    }

    @When("enter password with {string} and {string} and {string}")
    public void enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData) {
        FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
    }

    @When("click login button with {string} and {string}")
    public void click_login_button_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.clickAction(LocatorType, LocatorValue);
    }

    @When("wait for supplier link with {string}and {string}")
    public void wait_for_supplier_link_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
    }

    @When("click on supplier link with {string} and {string}")
    public void click_on_supplier_link_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.clickAction(LocatorType, LocatorValue);
    }

    @When("wait for add icon with {string} and {string}")
    public void wait_for_add_icon_with_and(String LocatorType, String LocatorValue, String TestData) {
        FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
    }

    @When("clickon add icon with {string} and {string}")
    public void clickon_add_icon_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.clickAction(LocatorType, LocatorValue);
    }

    @When("wait for supplier number with {string} and {string}")
    public void wait_for_supplier_number_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
    }

    @When("capture supplier number with {string} and {string}")
    public void capture_supplier_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
        FunctionLibrary.captureSupplier(LocatorType, LocatorValue);
    }

    @When("enter in {string} with {string} and {string}")
    public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue) {
        FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
    }

    @When("click add button with {string} and {string}")
    public void click_add_button_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.clickAction(LocatorType, LocatorValue);
    }

    @When("wait for confirm ok button with {string} and {string}")
    public void wait_for_confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
    }

    @When("click confirm ok button with {string} and {string}")
    public void click_confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.clickAction(LocatorType, LocatorValue);
    }

    @When("wait for alert ok button with {string} and {string}")
    public void wait_for_alert_ok_button_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
    }

    @When("click alert ok button with {string} and {string}")
    public void click_alert_ok_button_with_and(String LocatorType, String LocatorValue) {
        FunctionLibrary.clickAction(LocatorType, LocatorValue);
    }

    @Then("verify supplier table")
    public void verify_supplier_table() throws Throwable {
       FunctionLibrary.supplierTable();
    }

    @When("close browser")
    public void close_browser() {
        FunctionLibrary.closeBrowser();
    }
}
