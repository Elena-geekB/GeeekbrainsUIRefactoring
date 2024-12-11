package com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class UITest extends com.BaseTest {

    @Test
    void testGBNotEmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.enterUsername("login");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();

        Assertions.assertTrue(loginPage.isUsernameErrorVisible(), "Username error should be visible");
    }

    @Test
    void testGBWithoutPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.enterUsername("login@login.ru");
        loginPage.clickLoginButton();

        Assertions.assertTrue(loginPage.isPasswordErrorVisible(), "Password error should be visible");
    }
}