package com.betikaauth;

import com.betikaauth.base.BaseTest;

import com.betikaauth.pages.RegisterPage;
import com.betikaauth.pages.VerificationPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestCase extends BaseTest {

    @Test
    public void register() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.loadRegisterPage();
        registerPage.register("0703445566","xyz","xyz");
        registerPage.clickRegister();

        Thread.sleep(4000);

        Assert.assertEquals(registerPage.confirmRegister(),"Verify and Log In");

//        VerificationPage verificationPage = registerPage.clickRegister();

        VerificationPage verificationPage = new VerificationPage(driver);
        verificationPage.loadVerificationPage();
        verificationPage.verifyAccount("0703445566","1234");

        Thread.sleep(3000);

        Assert.assertTrue(verificationPage.confirmVerification());
    }






}