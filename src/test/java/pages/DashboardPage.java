package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/header[1]/div[1]/div[2]/button[1]/span[1]")
    WebElement btn_Addtransaction;

    @FindBy(xpath = "//html/body/div/div/div[3]/main/div/div/div[2]/div/div/nav/div[1]/a/div")
    WebElement btn_AddIncome;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]/div[1]/span[1]")
    WebElement btn_AddExpense;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[3]/a[1]/div[1]/span[1]")
    WebElement btn_AddWithdrawal;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[3]/div[4]/ul[1]/a[1]/li[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
    WebElement container_payable;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[3]/div[4]/ul[1]/a[2]/li[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
    WebElement container_receivable;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);

        //		if(!driver.getTitle().equals("Login to your Business Account")) {
        //			throw new IllegalPathStateException("This is not login page" + driver.getCurrentUrl());
        //		}
    }

    public void checkAddTransactionButtonVisibility() {
        btn_Addtransaction.isDisplayed();
    }


    public void clickAddTransaction() {
        btn_Addtransaction.click();
    }
    public void checkAddIncomeIsVisible() {
        btn_AddIncome.isDisplayed();
    }

    public void clickAddIncomeBtn() {
        btn_AddIncome.click();
    }

    public void checkAddExpenseIsVisible() {
        btn_AddExpense.isDisplayed();
    }

    public void clickAddExpenseBtn() {
        btn_AddExpense.click();
    }
    public void checkAddWdIsVisible() {
        btn_AddWithdrawal.isDisplayed();
    }

    public void clickAddWithdrawalBtn() {
        btn_AddWithdrawal.click();
    }

    public void clickPayable() {
        container_payable.click();
    }

    public void clickReceivable() {
        container_receivable.click();
    }
}
