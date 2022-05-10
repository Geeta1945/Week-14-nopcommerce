package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends Utility {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String actualText =registerPage.registrationText();
        String expectedText = "Register";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(groups = {"sanity","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegistration();

        String expectedFirstNameMessage = "First name is required.";
        String actualFirstnameMessage = registerPage.firstNameRequireText();
        Assert.assertEquals(actualFirstnameMessage,expectedFirstNameMessage);

        String expextedLastNameMessage="Last name is required.";
        String actualLastNameMessage= registerPage.lastNameRequireText();
        Assert.assertEquals(expextedLastNameMessage,actualLastNameMessage);

        String expectedEmailMessage ="Email is required.";
        String actualEmailMessage = registerPage.emailRequireText();
        Assert.assertEquals(expectedEmailMessage,actualEmailMessage);

        String expectedPasswordMessage = "Password is required.";
        String actualPasswordMessage = registerPage.passwordRequireText();
        Assert.assertEquals(expectedPasswordMessage,actualPasswordMessage);

        String expectedConfirmPasswordMessage = "Password is required.";
        String actualConfirmPasswordMessage = registerPage.confirmPasswordRequireText();
        Assert.assertEquals(expectedConfirmPasswordMessage,actualConfirmPasswordMessage);


    }
    @Test(groups = {"regression"})
    public void averifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.gender();
        registerPage.enterFirstName("Praful");
        registerPage.enterLastName("patel");
        registerPage.selectDay("29");
        registerPage.selectMonth("May");
        registerPage.selectYear("1987");
        registerPage.enterEmail("6prafulpatel20@gmail.com");
        registerPage.enterPassword("12345678");
        registerPage.enterConfirmPassword("12345678");
        registerPage.clickOnRegistration();
        String actualText =registerPage.registrationCompliton();
        String expectedText = "Your registration completed";
        Assert.assertEquals(actualText,expectedText);
    }

}
