package com.strypes.tests;

import com.strypes.base.TestBase;
import com.strypes.pages.ContactPage;
import com.strypes.pages.HomePage;
import com.strypes.utilities.ConfigurationReader;
import com.strypes.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Contact_Tests extends TestBase {

    HomePage homePage = new HomePage();
    ContactPage contactPage = new ContactPage();

    @BeforeMethod
    public void contactPageSetUp() {
        homePage.ContactButton.click();
    }

    @Test
    public void TitleVerificationTest(){

        Assert.assertEquals(Driver.getDriver().getTitle(),"Contact - ICT Strypes");

    }


    @Test
    public void ContactFormPositiveTest(){

        contactPage.firstNameInputBox.sendKeys("Test");
        contactPage.lastNameInputBox.sendKeys("User");
        contactPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
        contactPage.companyNameInputBox.sendKeys("ICT Strypes");
        contactPage.messageInputBox.sendKeys("test purpose");
        contactPage.privacyPolicyCheckBox.click();
        contactPage.subscriptionCheckBox.click();
        contactPage.sendButton.click();

        Assert.assertEquals(contactPage.approvalMessage.getText(),"Thank you for submitting the form.");

    }

    @Test
    public void ContactFormInvalidEmailTest(){

        contactPage.emailInputBox.sendKeys("test@test.com");
        Assert.assertEquals(
                contactPage.emailErrorMessage.getText(),
                "Please enter a valid email address."
        );

    }

    @Test
    public void ContactFormInvalidEmailFormatTest(){

        contactPage.emailInputBox.sendKeys("test@test");
        Assert.assertEquals(
                contactPage.emailErrorMessage.getText(),
                "Email must be formatted correctly."
        );

    }

    @Test
    public void ContactFormNullEmailTest(){

        contactPage.emailInputBox.sendKeys("");
        contactPage.sendButton.click();
        Assert.assertEquals(
                contactPage.emailErrorMessage.getText(),
                "Please complete this required field."
        );

    }
}
