package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriverInfo;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {
    public static void main(String[] args) {
        Chrome();
        Firefox();
        Safari();
    }

    public static void Chrome () {
        WebDriver driver = BrowserFactory.getdriver("chrome");
        driver.get("https://www.google.com");
        String title1= driver.getTitle();
        driver.get("https://etsy.com");
        String title2= driver.getTitle();
        driver.navigate().back();
        String title3= driver.getTitle();
        verifyEquals(title1, title3);
        driver.navigate().forward();
        String title4= driver.getTitle();
        verifyEquals(title2, title4);
        driver.quit();
    }
    public static void Firefox () {
        WebDriver driver = BrowserFactory.getdriver("firefox");
        driver.get("https://www.google.com");
        String title1= driver.getTitle();
        driver.get("https://etsy.com");
        String title2= driver.getTitle();
        driver.navigate().back();
        String title3= driver.getTitle();
        verifyEquals(title1, title3);
        driver.navigate().forward();
        String title4= driver.getTitle();
        verifyEquals(title2, title4);
        driver.quit();
    }
    public static void Safari () {
        WebDriver driver = BrowserFactory.getdriver("safari");
        driver.get("https://www.google.com");
        String title1= driver.getTitle();
        driver.get("https://etsy.com");
        String title2= driver.getTitle();
        driver.navigate().back();
        String title3= driver.getTitle();
        verifyEquals(title1, title3);
        driver.navigate().forward();
        String title4= driver.getTitle();
        verifyEquals(title2, title4);
        driver.quit();
    }
}
