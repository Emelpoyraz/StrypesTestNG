package com.strypes.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@aria-label='Open live chat' and @aria-haspopup='dialog']")
    public WebElement chatBot;

    @FindBy(xpath = "(//div[@dir='auto'])[1]")
    public WebElement defaultGreetMessage1;

    @FindBy(xpath = "(//div[@dir='auto'])[2]")
    public WebElement defaultGreetMessage2;

    @FindBy(xpath = "//button[contains(@class, 'VizExButton')][1]")
    public WebElement softwareSolutions;

    @FindBy(xpath = "//button[contains(@class, 'VizExButton')][2]")
    public WebElement careers;

    @FindBy(xpath = "//div[@aria-label='Write a message']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@aria-label='send message']")
    public WebElement messageBoxSendButton;

    @FindBy(xpath = "//div[contains(@aria-label, 'business email')]")
    public WebElement businessEmailQuestion;


    @FindBy(xpath = "(//button[contains(@class, 'VizExButton__AbstractVizExButton')])[2]")
    public WebElement chatBotContactOption;

    @FindBy(xpath = "//div[contains(@aria-label, 'Please navigate')]//em//a")
    public WebElement chatBotContactFormLink;

    @FindBy(linkText = "Contact page")
    public WebElement ContactButton;


}
