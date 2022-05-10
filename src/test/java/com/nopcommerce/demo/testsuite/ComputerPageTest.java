package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.DataSet;

public class ComputerPageTest extends Utility {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputer();
        String actualText = computerPage.computerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        String actualText=desktopsPage.desktopText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(groups = {"smoke","sanity","regression"},dataProvider = "BuildComputer",dataProviderClass = DataSet.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopsPage.clickOnBuildYourOwnComputer();
        Thread.sleep(2000);
        buildYourOwnComputerPage.clickOnProcessor(processor);
        Thread.sleep(2000);
        buildYourOwnComputerPage.selecRamFromFromDropdown(ram);
        Thread.sleep(2000);
        buildYourOwnComputerPage.clickOnHddRadio(hdd);
        Thread.sleep(2000);
        buildYourOwnComputerPage.osRadio(os);
        Thread.sleep(2000);
        buildYourOwnComputerPage.clickOnSoftware();
        buildYourOwnComputerPage.clickSoftware(software);
        Thread.sleep(2000);
        buildYourOwnComputerPage.addtocart();

        String expectedText = "The product has been added to your shopping cart";
        String actualText = buildYourOwnComputerPage.addToCartVerification();
        Assert.assertEquals(actualText,expectedText);






    }

}
