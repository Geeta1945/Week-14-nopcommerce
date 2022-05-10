package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    public DesktopsPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsTextField;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement buildYourOwnComputerField;

    public void clickOnBuildYourOwnComputer(){
        Reporter.log("clickOnBuildYourOwnComputer " + buildYourOwnComputerField.toString());
        clickOnElement(buildYourOwnComputerField);

    }
    public String desktopText(){
        Reporter.log("desktopText " + desktopsTextField.toString());
        return getTextFromElement(desktopsTextField);
    }
}
