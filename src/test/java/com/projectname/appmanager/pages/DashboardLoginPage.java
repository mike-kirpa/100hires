package com.projectname.appmanager.pages;

import org.openqa.selenium.WebDriver;

public class DashboardLoginPage extends AbstractPage {

    public DashboardLoginPage(WebDriver driver) {
        super(driver);
        waitForPageLoad("DashboardLoginPage.SignInButton");
    }
}
