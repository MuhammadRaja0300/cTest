package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SignUpPage;

import java.util.concurrent.TimeUnit;

public class Login_SD {
    WebDriver driver = null;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    SignUpPage signupPage;

    @Before
    public void setup() {
        System.getProperty("webdriver.chrome.driver", "/Users/muhammad/eclipse-workspace/CucumberTest/drivers/chromedriver");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://web.metricapp.co/login");
        loginPage = new LoginPage(driver);
        signupPage = new SignUpPage(driver);
        dashboardPage = new DashboardPage(driver);

    }

    @After
    public void kill() {
        driver.close();
        driver.quit();
    }

    @Given("open metric app login page")
    public void open_metric_app() throws InterruptedException {
//		driver.get("https://web.metricapp.co/login");
        Thread.sleep(2000);
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() throws InterruptedException {
        String eMail = "diyake1351@eixdeal.com";

        loginPage.enterEmal(eMail);
        loginPage.enterPassword("112233");
        Thread.sleep(2000);

    }

    @And("click on login button")
    public void click_on_login_button() {

        loginPage.clickLogin();
    }

    @Then("verify that user is on dashboard")
    public void verifyDashboardPage() {
        dashboardPage.checkAddTransactionButtonVisibility();
    }

    @When("click on signup button")
    public void click_on_signup_button() {
        loginPage.clickSignUp();
    }

    @Then("verify this is signup page")
    public void verify_this_is_signup_page() {
        signupPage.checkBackToLoginShown();
    }

    @When("click on terms")
    public void click_on_terms() {
        loginPage.clickTermsCondition();
    }

    @Then("verify that this is terms page")
    public void verify_that_this_is_terms_page() throws InterruptedException {
        Thread.sleep(4000);
        String currntUrl = driver.getCurrentUrl();
        String expectedUrl = "https://metricapp.co/terms-of-service/";
        if (currntUrl.equals(expectedUrl)) {
            System.out.print("url match");
        } else {
            System.out.print("url not match");
        }

    }

    @When("click on policy")
    public void click_on_policy() {
        loginPage.clickPolicy();
    }

    @Then("verify that this is policy page")
    public void verify_that_this_is_policy_page() throws InterruptedException {
        Thread.sleep(4000);
        String currntUrl = driver.getCurrentUrl();
        String expectedUrl = "https://metricapp.co/privacy-policy/";
        if (currntUrl.equals(expectedUrl)) {
            System.out.print("url match");
        } else {
            System.out.print("url not match");
        }

    }

    @When("add email and password")
    public void add_email_and_password() {
        loginPage.enterEmal("abcd@gmail.com");
        loginPage.enterPassword("112233");
    }

    @And("press login")
    public void press_login() {
        loginPage.clickLogin();
    }

    @Then("verify login page")
    public void verify_login_page() {
        loginPage.verifyLoginPage();
    }
}
