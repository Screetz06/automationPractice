package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginUserLocators {
    @FindBy(xpath = "//h2[@class=\"title text-center\"]")
    public WebElement featureItems;

    @FindBy(xpath = "(//li[4]//a)[1]")
    public WebElement signUpLoginButton;

    @FindBy(xpath = "//*[contains(text(),'Login to your account')]")
    public WebElement loginToYourAccount;

    @FindBy(xpath = "//input[@data-qa=\"login-email\"]")
    public WebElement emailInputLogin;

    @FindBy(xpath = "//input[@data-qa=\"login-password\"]")
    public WebElement passwordInputLogin;

    @FindBy(xpath = "//button[@data-qa=\"login-button\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//b[contains(text(),'06murat')]")
    public WebElement loggedInAS;

    @FindBy(xpath = "(//a[@style=color:brown;])[2]")
    public WebElement deleteAccount;
}
