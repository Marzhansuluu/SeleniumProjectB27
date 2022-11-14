package com.cydeo.tests.day5_testNG_dropdown.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_DropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
//      1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
        @Test
                public void DropDown() {
            //2. Go to http://practice.cybertekschool.com/dropdown
            driver.get("http://practice.cybertekschool.com/dropdown");

            //3. Select Illinois state
            WebElement findDropDown = driver.findElement(By.id("state"));
            Select state = new Select(findDropDown);
            state.selectByVisibleText("Illinois");

            //4. Select Virginia
            state.selectByVisibleText("Virginia");

            //5. Select California
            state.selectByValue("VA");

            //Use all Select options. (visible text, value, index)
            state.selectByValue("CA");
            state.selectByIndex(5);
            state.selectByVisibleText("California");


            //6. Verify final selected option is California.
            String expectedSelectedState = "California";
            String actualSelectedState = state.getFirstSelectedOption().getText();

            Assert.assertEquals(expectedSelectedState, actualSelectedState);

        }
            @AfterMethod
                    public void tearDown(){
                driver.quit();
            }




}
