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

public class T5_DropdownAndVerifying {


    WebDriver driver;


    @BeforeMethod
    public void setUpBrowser(){
        //Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void DropDown(){

    //Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        // locate the year dropdown
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"year\"]"));

        //select year by visible text
        Select year = new Select(dropdown);
        year.selectByVisibleText("1923");

        // verifying the selected year
        String expectedYear = "1923";
        String actualYear = year.getFirstSelectedOption().getText();
        Assert.assertEquals(actualYear, expectedYear);


        // locate the months dropdown
        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"month\"]"));

        //select month by value
        Select month = new Select(dropdown2);
        month.selectByValue("11");

        //verifying the selected month
        String expectedMonth = "December";
        String actualMonth = month.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth, expectedMonth);

        //locate the day dropdown
        WebElement dropdown3 = driver.findElement(By.xpath("//*[@id=\"day\"]"));

        //select the day by index number
        Select day = new Select(dropdown3);
        day.selectByIndex(0);

        // verifying the selected day
        String expectedDay = "1";
        String actualDay = day.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay,expectedDay);

    }

    @AfterMethod
        public void tearDown(){
            driver.quit();
        }
}
