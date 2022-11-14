package com.cydeo.tests.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class locatorPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }

    @Test
    public void test1(){
        driver.get("https://app.vytrack.com/user/login");

        //enter username provided: "abcd"
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");

        // enter password provided:"abcd"
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");

        //click the login button
        WebElement clickBtn= driver.findElement(By.id("_submit"));
        clickBtn.click();

        //verify the message "Invalid username or password
        WebElement alert = driver.findElement(By.className("alert"));


        // verify URL contains "vytrack"
    }



}
