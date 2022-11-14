package com.cydeo.tests.day4_Xpath_findElements_checkbox.HOMEWORK;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_Xpath_Locator {
    public static void main(String[] args) {
        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        WebElement clickedButtonText = driver.findElement(By.id("result"));
        String expectedText = "Clicked on button one!";
        String actualText = clickedButtonText.getText();

        if(actualText.equals(expectedText)){
            System.out.println("Click on button text passed");
        }else{
            System.out.println("Click on button text failed");
        }

        driver.quit();
    }
}
