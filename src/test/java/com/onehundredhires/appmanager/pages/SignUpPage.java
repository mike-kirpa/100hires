package com.onehundredhires.appmanager.pages;

import com.onehundredhires.appmanager.helpers.Locators;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends AbstractPage{

    public SignUpPage(WebDriver driver) {
        super(driver);
        waitForPageLoad("SignUpPage.FirstNameField");
    }

    public void enterInFirstNameField(String firstname) throws InterruptedException {
        Thread.sleep(1000);
        waitForPageLoad("SignUpPage.FirstNameField");
        driver.findElement(Locators.get("SignUpPage.FirstNameField")).click();
        driver.findElement(Locators.get("SignUpPage.FirstNameField")).sendKeys(firstname);
    }

    public void enterInLastNameField(String lastname) throws InterruptedException {
        Thread.sleep(1000);
        waitForPageLoad("SignUpPage.LastNameField");
        driver.findElement(Locators.get("SignUpPage.LastNameField")).click();
        driver.findElement(Locators.get("SignUpPage.LastNameField")).sendKeys(lastname);
    }

    public void enterInCompanyNameField(String companyname) throws InterruptedException {
        Thread.sleep(1000);
        waitForPageLoad("SignUpPage.CompanyNameField");
        driver.findElement(Locators.get("SignUpPage.CompanyNameField")).click();
        driver.findElement(Locators.get("SignUpPage.CompanyNameField")).sendKeys(companyname);
    }

    public void enterInPhoneField(String phone){
        waitForPageLoad("SignUpPage.PhoneField");
        driver.findElement(Locators.get("SignUpPage.PhoneField")).sendKeys(phone);
    }

    public void enterInCountOfEmployeesField(String count){
        waitForPageLoad("SignUpPage.CountOfEmployeesField");
        driver.findElement(Locators.get("SignUpPage.CountOfEmployeesField")).sendKeys(count);
    }

    public void enterInLocationField(String location){
        waitForPageLoad("SignUpPage.LocationField");
        driver.findElement(Locators.get("SignUpPage.LocationField")).sendKeys(location);
    }

    public void enterInSiteUrlField(String siteurl){
        waitForPageLoad("SignUpPage.SiteUrlField");
        driver.findElement(Locators.get("SignUpPage.SiteUrlField")).sendKeys(siteurl);
    }

    public void enterInPasswordField(String password){
        waitForPageLoad("SignUpPage.PasswordField");
        driver.findElement(Locators.get("SignUpPage.PasswordField")).sendKeys(password);
    }

    public void clickOnNextQuestion() throws InterruptedException {
        Thread.sleep(1000);
        waitForPageLoad("SignUpPage.NextQuestionButton");
        driver.findElement(Locators.get("SignUpPage.NextQuestionButton")).click();
    }
}
