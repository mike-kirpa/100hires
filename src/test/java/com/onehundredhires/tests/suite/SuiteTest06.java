package com.onehundredhires.tests.suite;

import com.onehundredhires.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteTest06 extends TestBase {

    @Test
    public void test_06() throws Exception {
        app.driver.get("https://www.google.com/ncr");
        Thread.sleep(7000);
        WebElement element = app.driver.findElement(By.name("q"));
        element.sendKeys("BrowserStack Test 06");
        Thread.sleep(7000);
        element.submit();
        Thread.sleep(7000);

        Assert.assertEquals("BrowserStack Test 06 - Google Search", app.driver.getTitle());
    }
}
