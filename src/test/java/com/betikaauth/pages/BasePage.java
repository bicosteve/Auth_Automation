package com.betikaauth.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void getURL(String url){
        this.driver.get(url);
    }
}
