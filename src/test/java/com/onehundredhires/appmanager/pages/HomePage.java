package com.onehundredhires.appmanager.pages;

import com.onehundredhires.appmanager.helpers.Locators;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
        waitForPageLoad("HomePage.GetStartedButton");
    }

    public void enterEmail(String email){
        driver.findElement(Locators.get("HomePage.EmailField")).sendKeys(email);
    }

    public void clickOnGetStartedButton(){
        driver.findElement(Locators.get("HomePage.EmailField"));
    }

    public SignUpPage signUp(String email){
        enterEmail(email);
        clickOnGetStartedButton();
        return new SignUpPage(driver);
    }
}
