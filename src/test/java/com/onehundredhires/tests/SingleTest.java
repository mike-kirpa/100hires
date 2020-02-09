package com.onehundredhires.tests;

import com.onehundredhires.appmanager.helpers.Locators;
import com.onehundredhires.appmanager.pages.HomePage;
import com.onehundredhires.appmanager.pages.MainPage;
import com.onehundredhires.appmanager.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SingleTest extends TestBase {

    @Test()
    public void test() throws InterruptedException {
        app.driver.get(app.getProperties.value("URL"));
        HomePage homePage = new HomePage(app.driver);
        SignUpPage signUpPage = homePage.signUp(String.valueOf(System.currentTimeMillis()/1000L) + app.getProperties.value( "ValidEmail"));
        signUpPage.enterInFirstNameField(app.getProperties.value("ValidFirstName"));
        signUpPage.clickOnNextQuestion();
        signUpPage.enterInLastNameField(app.getProperties.value("ValidLastName"));
        signUpPage.clickOnNextQuestion();
        signUpPage.enterInCompanyNameField(app.getProperties.value("ValidCompanyName"));
        signUpPage.clickOnNextQuestion();
        signUpPage.enterInPhoneField(app.getProperties.value("ValidPhone"));
        signUpPage.clickOnNextQuestion();
        signUpPage.enterInCountOfEmployeesField(app.getProperties.value("ValidCountOfEmployees"));
        signUpPage.clickOnNextQuestion();
        signUpPage.enterInLocationField(app.getProperties.value("ValidLocation"));
        signUpPage.clickOnNextQuestion();
        signUpPage.enterInSiteUrlField(app.getProperties.value("ValidUrlSite"));
        signUpPage.clickOnNextQuestion();
        signUpPage.enterInPasswordField(app.getProperties.value("ValidPassword"));
        signUpPage.clickOnCreateAccountButton();
        MainPage mainPage = new MainPage(app.driver);
        Assert.assertEquals(app.driver.findElement(Locators.get("MainPage.FirstLastNames")).getText(), app.getProperties.value("ValidFirstName") + " " + app.getProperties.value("ValidLastName"));
    }
}
