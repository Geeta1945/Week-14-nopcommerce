package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @FindBy(linkText = "Log out")
    WebElement logOutLink;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronicsField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparelField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitalDownloadField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement booksField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement jewelryField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftCardsField;
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopcommerceLogoField;
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountField;


    public void clickOnLoginLink() {
        Reporter.log("clickOnLoginLink " + loginLink.toString());

        clickOnElement(loginLink);
    }
    public String loginButtonText(){
        Reporter.log("loginButtonText " + loginLink.toString());
        return getTextFromElement(loginLink);
    }

    public String logOutTextLink() {
        Reporter.log("logOutTextLink " + logOutLink.toString());
        return getTextFromElement(logOutLink);
    }
    public void clickOnLogoutButton(){
        Reporter.log("clickOnLogoutButton " + logOutLink.toString());
        clickOnElement(logOutLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("clickOnRegisterLink " + registerLink.toString());

        clickOnElement(registerLink);
    }

    public void clickOnComputer() {
        Reporter.log("clickOnComputer " + computerField.toString());

        clickOnElement(computerField);
    }

    public void clickOnelectronics() {
        Reporter.log("clickOnelectronics " + electronicsField.toString());

        clickOnElement(electronicsField);
    }

    public void clickOnApparel() {
        Reporter.log("clickOnApparel " + apparelField.toString());

        clickOnElement(apparelField);
    }

    public void clickOnDigitalDownload() {
        Reporter.log("clickOnDigitalDownload " + digitalDownloadField.toString());

        clickOnElement(digitalDownloadField);
    }

    public void clickOnBook() {
        Reporter.log("clickOnBook " + booksField.toString());

        clickOnElement(booksField);
    }

    public void clickOnJewelry() {
        Reporter.log("clickOnJewelry " + jewelryField.toString());

        clickOnElement(jewelryField);
    }

    public void clickOnGiftCards() {
        Reporter.log("clickOnGiftCards " + giftCardsField.toString());

        clickOnElement(giftCardsField);
    }

    public String nopcommerceLogoText() {
        Reporter.log("nopcommerceLogoText " + nopcommerceLogoField.toString());
        return getTextFromElement(nopcommerceLogoField);
    }

    public void clickOnMyAccount() {
        Reporter.log("clickOnMyAccount " + myAccountField.toString());
        clickOnElement(myAccountField);
    }




}
