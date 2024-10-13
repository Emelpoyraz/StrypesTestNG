package com.strypes.pages;

import com.strypes.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='elementor-widget-container']/a)[1]")
    public WebElement IctStrypesLogo;

    @FindBy(linkText = "About")
    public WebElement AboutButton;

    @FindBy(linkText = "Services")
    public WebElement ServicesButton;

    @FindBy(linkText = "Customers")
    public WebElement CustomersButton;

    @FindBy(linkText = "Nearsurance")
    public WebElement NearsuranceButton;

    @FindBy(linkText = "Resources")
    public WebElement ResourcesButton;

    @FindBy(linkText = "Careers")
    public WebElement CareersButton;

    @FindBy(linkText = "About ICT Group")
    public WebElement AboutIctGroup;

    @FindBy(linkText = "Contact")
    public WebElement ContactButton;

    @FindBy(id = "hubspot-conversations-iframe")
    public WebElement iframe;
}
