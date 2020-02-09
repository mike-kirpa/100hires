package com.onehundredhires.appmanager.pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage{

    public MainPage(WebDriver driver) {
        super(driver);
        waitForPageLoad("MainPage.FirstLastNames");
    }
}
