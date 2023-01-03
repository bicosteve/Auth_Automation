package com.betikaauth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage {

    private final By phoneNumber = By.xpath("(//input[@class='input'])[1]");
    private final By verificationCode = By.xpath("(//input[@class='input'])[2]");
    private final By verificationButton = By.xpath("//span[text()='Verify and Log In']");
    private final By depositButton = By.xpath("//*[@class='top-session-button button button__primary']");
    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    public VerificationPage loadVerificationPage(){
        String url = "https://www.betika.com/en-ke/register?next=%2F#/register?next=%2F&canVerify=true";
        getURL(url);
        return this;
    }

    private void loadNumber(String phoneNumber){
        driver.findElement(this.phoneNumber).clear();
        driver.findElement(this.phoneNumber).sendKeys((phoneNumber));
    }

    private void loadVerificationCode(String code){
        driver.findElement(this.verificationCode).clear();
        driver.findElement(this.verificationCode).sendKeys(code);
    }

    public void verifyAccount(String phoneNumber,String code){
        loadNumber(phoneNumber);
        loadVerificationCode(code);
        driver.findElement(verificationButton).click();
    }

    public Boolean confirmVerification(){
        return driver.findElement(depositButton).isDisplayed();
    }

}
