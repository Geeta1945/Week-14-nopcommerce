package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {

        public RegisterPage() {
                PageFactory.initElements(driver, this);
        }


        @FindBy(tagName = "h1")
        WebElement registrationTextField;
        @FindBy(xpath = "//label[contains(text(),'Female')]")
        WebElement genderField;
        @FindBy(id = "FirstName")
        WebElement firstNameField;
        @FindBy(id = "LastName")
        WebElement lastNameField;
        @FindBy(name = "DateOfBirthDay")
        WebElement dayField;
        @FindBy(name = "DateOfBirthMonth")
        WebElement monthField;
        @FindBy(name = "DateOfBirthYear")
        WebElement yearField;
        @FindBy(id = "Email")
        WebElement emailField;
        @FindBy(id = "Password")
        WebElement passwordField;
        @FindBy(id = "ConfirmPassword")
        WebElement confirmPasswordField;
        @FindBy(id = "register-button")
        WebElement clickOnRegisterField;
        @FindBy(xpath = "//span[@id='FirstName-error']")
        WebElement firstNameRequireField;
        @FindBy(xpath = "//span[@id='LastName-error']")
        WebElement lastNameRequireField;
        @FindBy(xpath = "//span[@id='Email-error']")
        WebElement emailRequireField;
        @FindBy(xpath = "//span[@id='Password-error']")
        WebElement passwordErrorField;
        @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
        WebElement confirmPasswordErrorField;
        @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
        WebElement registrationCompletedField;
        @FindBy(xpath = "//a[contains(text(),'Continue')]")
        WebElement clickOnContinueField;


        public String registrationText() {
                Reporter.log("registrationText " + registrationTextField.toString());
                return getTextFromElement(registrationTextField);
        }

        public void gender() {
                Reporter.log("gender " + genderField.toString());
                clickOnElement(genderField);
        }

        public void enterFirstName(String firstName) {
                Reporter.log("enterFirstName " + firstNameField.toString());
                sendTextToElement(firstNameField, firstName);
        }

        public void enterLastName(String lastName) {
                Reporter.log("enterLastName " + lastNameField.toString());
                sendTextToElement(lastNameField, lastName);
        }

        public void selectDay(String day) {
                Reporter.log("selectDay " + dayField.toString());
                selectByVisibleTextFromDropDown(dayField, day);
        }

        public void selectMonth(String month) {
                Reporter.log("selectMonth " + monthField.toString());
                selectByVisibleTextFromDropDown(monthField, month);
        }

        public void selectYear(String year) {
                Reporter.log("selectYear " + yearField.toString());
                selectByVisibleTextFromDropDown(yearField, year);
        }

        public void enterEmail(String email) {
                Reporter.log("enterEmail " + emailField.toString());
                sendTextToElement(emailField, email);
        }

        public void enterPassword(String password) {
                Reporter.log("enterPassword " + passwordField.toString());
                sendTextToElement(passwordField, password);
        }

        public void enterConfirmPassword(String confirmPassword) {
                Reporter.log("enterConfirmPassword " + confirmPasswordField.toString());
                sendTextToElement(confirmPasswordField, confirmPassword);
        }

        public void clickOnRegistration() {
                Reporter.log("clickOnRegistration " + clickOnRegisterField.toString());
                clickOnElement(clickOnRegisterField);
        }

        public String registrationCompliton() {
                Reporter.log("registrationCompliton " + registrationCompletedField.toString());
                return getTextFromElement(registrationCompletedField);
        }

        public void clickOnContinue() {
                Reporter.log("clickOnContinue " + clickOnContinueField.toString());
                clickOnElement(clickOnContinueField);
        }

        public String firstNameRequireText() {
                Reporter.log("firstNameRequireText " + firstNameRequireField.toString());
                return getTextFromElement(firstNameRequireField);
        }
        public String lastNameRequireText(){
                Reporter.log("lastNameRequireText " + lastNameRequireField.toString());
                return getTextFromElement(lastNameRequireField);
        }
        public String emailRequireText(){
                Reporter.log("emailRequireText " + emailRequireField.toString());
                return getTextFromElement(emailRequireField);
        }
        public String passwordRequireText(){
                Reporter.log("passwordRequireText " + passwordErrorField.toString());
                return getTextFromElement(passwordErrorField);
        }
        public String confirmPasswordRequireText(){
                Reporter.log("confirmPasswordRequireText " + confirmPasswordErrorField.toString());
                return getTextFromElement(confirmPasswordErrorField);
        }



}
