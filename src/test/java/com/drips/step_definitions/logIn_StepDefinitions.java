package com.drips.step_definitions;

import com.drips.pages.DripsBasePage;
import com.drips.pages.logInPage;
import com.drips.pages.loggedUsersPage;
import com.drips.utilities.utilities.BrowserUtils;
import com.drips.utilities.utilities.ConfigurationReader;
import com.drips.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logIn_StepDefinitions {
    DripsBasePage dripsBasePage=new DripsBasePage();
logInPage logInPage=new logInPage();
    loggedUsersPage loggedUsersPage=new loggedUsersPage();

    @Given("user is on the base page")
    public void userIsOnTheBasePage() {
        String url= ConfigurationReader.getProperty("signInLinkPage");
        Driver.getDriver().get(url);

    }

    @When("user clicks on sign in link")
    public void user_clicks_on_sign_in_link() {
        dripsBasePage.SignInLink.click();


    }




    @Then("user is on the log in page")
    public void user_is_on_the_log_in_page() {

    }
    @Then("type the email")
    public void type_the_email() {
       logInPage.EmailTextbox.sendKeys(ConfigurationReader.getProperty("EmailTextBox"));
        BrowserUtils.sleep(2);
    }
    @Then("type the password")
    public void type_the_password() {
        logInPage.PasswordTextbox.sendKeys(ConfigurationReader.getProperty("PasswordTextBox"));
    }
    @Then("click on sign In button")
    public void click_on_sign_in_button() {
        BrowserUtils.sleep(2);
        logInPage.SignInButton.click();
    }
    @Then("user is logged in")
    public void user_is_logged_in() {
        System.out.println("user is logged in");
        BrowserUtils.sleep(5);
        Assert.assertTrue(loggedUsersPage.DemoStatement.isDisplayed());
        
    }


}
