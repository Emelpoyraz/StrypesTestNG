package com.strypes.tests;

import com.strypes.utilities.ConfigurationReader;
import com.strypes.utilities.Driver;
import com.strypes.base.TestBase;
import com.strypes.pages.HomePage;
import com.strypes.utilities.Utils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ChatBot_Tests extends TestBase {

    HomePage homePage = new HomePage();

    @BeforeMethod
    public void iframeSwitchSetup(){
        Driver.getDriver().switchTo().frame(homePage.iframe);
    }

    @Test
    public void chatBotEnd2EndTest(){

        Assert.assertTrue(homePage.chatBot.isDisplayed());

        homePage.chatBot.click();
        Assert.assertEquals(
                homePage.defaultGreetMessage1.getText(),
                "Hi there! I am Robby, the ICT Strypes chatbot. What can I help you with?"
        );

        Assert.assertTrue(
                homePage.defaultGreetMessage2
                        .getAttribute("aria-label")
                        .contains("What topic are you interested in?")
        );

        homePage.softwareSolutions.click();

        Utils.waitForClickability(homePage.messageBox);

        homePage.messageBox.sendKeys("Alex");
        homePage.messageBoxSendButton.click();

        Utils.waitForVisibility(homePage.businessEmailQuestion);

        homePage.messageBox.sendKeys(ConfigurationReader.getProperty("email"));
        homePage.messageBoxSendButton.click();

        Utils.waitForClickability(homePage.chatBotContactOption);
        homePage.chatBotContactOption.click();

        Utils.waitForVisibility(homePage.chatBotContactFormLink);
        homePage.chatBotContactFormLink.click();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Contact - ICT Strypes");

    }


}
