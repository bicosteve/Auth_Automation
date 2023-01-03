package com.betikaauth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    private final By phoneNumber = By.xpath("//input[@type='text']");
    private final By password = By.xpath("(//input[@class='input'])[2]");
    private final By confirmPassword = By.xpath("(//input[@class='input'])[3]");
    private final By termsCheckBox = By.xpath("//span[@class='checkmark']");
    private final By registerButton = By.xpath("//span[text()='Register']");
    private final By verificationButton = By.xpath("//span[text()='Verify and Log In']");


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void loadRegisterPage(){
        String registerURL = "https://www.betika.com/en-ke/register?next=%2F";
        getURL(registerURL);
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

    private void acceptTerms(){
        driver.findElement(this.termsCheckBox).click();
    }

    public void register(String phoneNumber,String password, String confirmPassword){
        addPhone(phoneNumber);
        addPassword(password);
        confirmPassword(confirmPassword);
        acceptTerms();
    }

//    public VerificationPage clickRegister(){
//        driver.findElement(this.registerButton).click();
//        return new VerificationPage(driver);
//    }

    public void clickRegister(){
        driver.findElement(this.registerButton).click();
    }

    public String confirmRegister(){
        return driver.findElement(verificationButton).getText();
    }
}
