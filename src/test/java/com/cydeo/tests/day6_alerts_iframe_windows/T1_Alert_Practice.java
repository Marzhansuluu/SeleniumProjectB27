package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //   1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }

    @Test
            public void alertTast() {

        //3. Click to “Click for JS Alert” button
        WebElement infoAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        infoAlertBtn.click();

        //4. Click to OK button from the alert
        // To handle JS alerts we have use  Alert interface
        Alert alert = driver.switchTo().alert();
        // accept() method will click OK button
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedTextMessage = "You successfully clicked an alert";
        String actualTextMessage = textMessage.getText();// textMessage located the text part, getText will get the text

        Assert.assertEquals(actualTextMessage, expectedTextMessage, "Your expected text message is failed");


    }
}
