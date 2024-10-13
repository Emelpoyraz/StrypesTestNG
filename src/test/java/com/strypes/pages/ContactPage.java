package com.strypes.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{

    @FindBy(id = "firstname-9246f6ce-b893-4249-8362-96d17c0861f5")
    public WebElement firstNameInputBox;

    @FindBy(id = "lastname-9246f6ce-b893-4249-8362-96d17c0861f5")
    public WebElement lastNameInputBox;

    @FindBy(id="email-9246f6ce-b893-4249-8362-96d17c0861f5")
    public WebElement emailInputBox;

    @FindBy(id = "company-9246f6ce-b893-4249-8362-96d17c0861f5")
    public WebElement companyNameInputBox;

    @FindBy(id = "message-9246f6ce-b893-4249-8362-96d17c0861f5")
    public WebElement messageInputBox;

    @FindBy(id = "LEGAL_CONSENT.subscription_type_4681882-9246f6ce-b893-4249-8362-96d17c0861f5")
    public WebElement privacyPolicyCheckBox;

    @FindBy(id = "LEGAL_CONSENT.subscription_type_4673944-9246f6ce-b893-4249-8362-96d17c0861f5")
    public WebElement subscriptionCheckBox;

    @FindBy(xpath = "(//input[@value='SEND'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//div[contains(@id, 'hbspt-form')]/div")
    public WebElement approvalMessage;

    @FindBy(xpath = "//label[@class='hs-error-msg hs-main-font-element']")
    public WebElement emailErrorMessage;

}
