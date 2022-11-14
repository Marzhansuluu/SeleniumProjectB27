package com.cydeo.tests.day1_selenium_intro.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //navigate to a practice page that open new tab
        // this practice url open and wait 3 seconds and open new tab.
        driver.get("https://practice.cydeo.com/open_new_tab");


        //waiting for 5 seconds
        Thread.sleep(5000);


        // closing the current tab
        //driver.close();

        // closing all browsers. The windows opened by driver
        driver.quit();


    }
}
