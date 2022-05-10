package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility { @FindBy(tagName = "h1")
WebElement computerTextField;
    public String computerText() {
        Reporter.log("computerText " + computerTextField.toString());
        return getTextFromElement(computerTextField);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement desktopField;
    public void clickOnDesktop() {
        Reporter.log("clickOnDesktop " + desktopField.toString());
        clickOnElement(desktopField);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement notebookField;

    public void clickOnNotebook() {
        Reporter.log("clickOnNotebook " + notebookField.toString());
        clickOnElement(notebookField);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")
    WebElement softwareField;

    public void clickOnSoftware() {
        Reporter.log("clickOnSoftware " + softwareField.toString());
        clickOnElement(softwareField);

    }


}
