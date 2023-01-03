package com.betikaauth.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void loadURL(String url,String page){
        this.driver.get(url + page);
    }
}
