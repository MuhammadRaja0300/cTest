package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/input[1]")
    WebElement txt_Name;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/input[1]")
    WebElement txt_Email;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/input[1]")
    WebElement txt_Password;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/span[1]/a[1]/span[1]")
    WebElement txt_back_To_Login;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);

        //		if(!driver.getTitle().equals("Login to your Business Account")) {
        //			throw new IllegalPathStateException("This is not login page" + driver.getCurrentUrl());
        //		}
    }
    public void checkBackToLoginShown() {
        txt_back_To_Login.isDisplayed();
    }
}
