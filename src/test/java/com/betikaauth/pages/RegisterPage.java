package com.betikaauth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{


    private final By phoneNumber = By.xpath("");
    private final By password = By.xpath("");
    private final By confirmPassword = By.xpath("");
    private final By terms = By.xpath("");
    private final By registerButton = By.xpath("//*[text()='Register']");



    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage loadRegisterPage(){
        driver.findElement(registerButton).click();
        return this;
    }

    private void addPhone(String phoneNumber){
        driver.findElement(this.phoneNumber).clear();
        driver.findElement(this.phoneNumber).sendKeys(phoneNumber);

    }

    private void addPassword(String password){
        driver.findElement(this.password).clear();
        driver.findElement(this.password).sendKeys(password);

    }

    private void confirmPassword(String password){
        driver.findElement(this.confirmPassword).clear();
        driver.findElement(this.confirmPassword).sendKeys(password);
    }

    public void register(String phoneNumber,String password, String confirmPassword){
        addPhone(phoneNumber);
        addPassword(password);
        confirmPassword(confirmPassword);
    }
}
