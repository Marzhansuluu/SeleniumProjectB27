package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetSpeedPage {

    public InternetSpeedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//div[@class='result-area result-area-nav result-area-nav-center']/ul/li/a[@href='/results']")
    public WebElement resultLink;

    @FindBy(xpath = "//span[.='Go']")
    public WebElement goButton;

    @FindBy(xpath = "//canvas[@class='gauge-speed-text']")
    public WebElement gaugeDisplayed;

    @FindBy(xpath = "//div[@class='result-container-speed result-container-speed-active']")
    public WebElement gaugeDisappear;

    @FindBy(xpath = "(//div[@class='result-data u-align-left'])[1]")
    public WebElement downloadSpeed;

    @FindBy(xpath = "(//div[@class='result-data u-align-left'])[2]")
    public WebElement uploadSpeed;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/div/div[2]/div[3]/div[3]/div/div[8]/div/a")
    public WebElement closePopup;

}
