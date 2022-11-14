package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1. setup web driver manager
        WebDriverManager.chromedriver().setup();

        //2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();


        // making window full screen/ maximizing
        driver.manage().window().maximize();


        //3. go to https://www.tesla.com
       // driver.get("https://www.tesla.com");


        // 4. navigate().to().method is loading to url in browser
        driver.navigate().to("https://www.tesla.com");


        //5. make it pause for 10 seconds
        Thread.sleep(5000);

        //6. navigate().back() method will take previous page
        driver.navigate().back();

        //7. make it pause for 10 seconds
        Thread.sleep(5000);

        //8. navigate().forward() method will take
        driver.navigate().forward();

        //9. make it pause for 10 seconds
        Thread.sleep(5000);

        //10. navigate().refresh() method will refresh the page
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        String currentTitle = driver.getTitle(); //System.out.println("Driver.getTitle() = " + driver.getTitle());
        System.out.println("currentTitle = " + currentTitle);


        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);//System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        // close() method will close current opened page
        driver.close();

        // quit() will close al opened page
        driver.quit();

    }
}
