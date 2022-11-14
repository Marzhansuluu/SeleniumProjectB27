package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {
    public static void main(String[] args) {

        //TC #1:  Cydeo Title Verification
       // 1. Open Chrome browser

        //1. set up web driver manager
         WebDriverManager.chromedriver().setup();

         //2. opening an empty broswer with creating instance driver
        WebDriver driver = new ChromeDriver();
        //Session id = 72ABYHUKH86

        //3. making window full screen
        driver.manage().window().maximize();


        //2. Go to https://www.cydeo.com/
        driver.get("https://www.cydeo.com");


       // 3. Verify title: Expected: Cydeo
        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED");
            driver.quit();
        }else{
            System.out.println("Title verification is FAILED");
        }

        driver.quit();


    }
}
