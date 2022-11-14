package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
        WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // set up browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
            public void googleTitle(){

        // navigate to the google page
        driver.get("https://www.google.com");

        //Verify if title is "Google"
        String actualTitle = driver.getTitle();
        String expected = "Google";

        Assert.assertEquals(actualTitle, expected, "Title is not matching");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


}
