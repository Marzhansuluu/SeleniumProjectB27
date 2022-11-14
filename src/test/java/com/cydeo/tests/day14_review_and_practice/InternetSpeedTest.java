package com.cydeo.tests.day14_review_and_practice;

import com.cydeo.pages.InternetSpeedPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InternetSpeedTest {
    InternetSpeedPage speedTestDynamicContolPage;


    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://www.speedtest.net/");
        speedTestDynamicContolPage=new InternetSpeedPage();




    }
    @Test
    public void check_speed_test(){


        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),60);

        wait.until(ExpectedConditions.visibilityOf(speedTestDynamicContolPage.resultLink));
        Assert.assertTrue(speedTestDynamicContolPage.resultLink.isDisplayed());
        System.out.println("speedTestDynamicContolPage.Resultlink.isDisplayed() = " + speedTestDynamicContolPage.resultLink.isDisplayed());

        wait.until(ExpectedConditions.invisibilityOf(speedTestDynamicContolPage.gaugeDisplayed));

        speedTestDynamicContolPage.goButton.click();

        wait.until(ExpectedConditions.visibilityOf(speedTestDynamicContolPage.closePopup));
        speedTestDynamicContolPage.closePopup.click();

        wait.until(ExpectedConditions.visibilityOf(speedTestDynamicContolPage.gaugeDisappear));

        System.out.println("Download Speed " + speedTestDynamicContolPage.downloadSpeed.getText()+" mbps");
        System.out.println("Upload Speed " + speedTestDynamicContolPage.uploadSpeed.getText()+ " mbps");

            Driver.closeDriver();

    }






}
