package com.onehundredhires.appmanager.pages;

import com.onehundredhires.appmanager.helpers.Locators;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends AbstractPage{

    public SignUpPage(WebDriver driver) {
        super(driver);
        waitForPageLoad("SignUpPage.FirstNameField");
    }

    public void enterInFirstNameField(String firstname){
        driver.findElement(Locators.get("SignUpPage.FirstNameField")).clear();
        driver.findElement(Locators.get("SignUpPage.FirstNameField")).sendKeys(firstname);
    }

    public void clickOnNextQuestion(){
        driver.findElement(Locators.get("SignUpPage.NextQuestionButton")).click();
    }
}
