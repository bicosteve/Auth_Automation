package com.betikaauth.base;

import com.betikaauth.driver.DriverManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startDriver(){
        this.driver = new DriverManager().initializeDriver();
    }

    @AfterMethod
    public void quitDriver(){
        this.driver.quit();
    }

}
