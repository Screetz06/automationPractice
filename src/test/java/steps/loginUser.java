package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.loginUserLocators;
import utils.Common;

public class loginUser extends Common  {
    @Given("Verify that home page is visible")
    public void verifyThatHomePageIsVisible() throws InterruptedException {
        setUp();
        wait(2000);
       if (!loginUserLocators.featureItems.isDisplayed()){
           System.out.println("Main Page Is Not Loaded");
       }
    }
    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() throws InterruptedException {
        wait(1000);
        loginUserLocators.emailInputLogin.sendKeys("06murat71xz@gmail.com");
        wait(1000);
        loginUserLocators.passwordInputLogin.sendKeys("hastasiyizdede123.");
    }

    @And("Click login button")
    public void clickLoginButton() throws InterruptedException {
        wait(1000);
        loginUserLocators.loginButton.click();


    }

    

    @And("Click on SignUp-Login button")
    public void clickOnSignUpLoginButton() throws InterruptedException {
        wait(2000);
        loginUserLocators.signUpLoginButton.click();

    }

    @And("Click delete acount button")
    public void clickDeleteAcountButton() throws InterruptedException {
        wait(1000);
        loginUserLocators.deleteAccount.click();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        waitForVisibility(loginUserLocators.loggedInAS);
        if (!loginUserLocators.loggedInAS.isDisplayed()){
            System.out.println("Page did not loaded");
        }
    }

    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        waitForVisibility(loginUserLocators.loginToYourAccount);
        if (!loginUserLocators.loginToYourAccount.isDisplayed()){
            System.out.println("signUpLogin Page Is Not Loaded");
        }
    }

    @And("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
    }
}
