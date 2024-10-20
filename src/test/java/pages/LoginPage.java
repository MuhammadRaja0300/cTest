package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/input[1]")
    WebElement txt_Email;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/input[1]")
    WebElement txt_Password;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/a[1]/div[1]")
    WebElement txt_ForgotPassword;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[4]/div[1]/button[1]")
    WebElement btn_Login;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]")
    WebElement btn_Google;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/a[1]/div[1]")
    WebElement txt_SignUp;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]/p[1]")
    WebElement txt_Policy;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/span[2]/p[1]")
    WebElement txt_TermsCondition;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        //		if(!driver.getTitle().equals("Login to your Business Account")) {
        //			throw new IllegalPathStateException("This is not login page" + driver.getCurrentUrl());
        //		}
    }

    public void enterEmal(String email) {
        txt_Email.sendKeys(email);
    }

    public void enterPassword(String password) {
        txt_Password.sendKeys(password);
    }

    public void clickLogin() {
        btn_Login.click();
    }

    public void clickForgotPassword() {
        txt_ForgotPassword.click();
    }

    public void clickSignUp() {
        txt_SignUp.click();
    }

    public void clickPolicy() {
        txt_Policy.click();
    }

    public void clickTermsCondition() {
        txt_TermsCondition.click();
    }


    public void clickGoogle() {
        btn_Google.click();
    }

    public void verifyLoginPage() {
        btn_Login.isDisplayed();
    }
}
