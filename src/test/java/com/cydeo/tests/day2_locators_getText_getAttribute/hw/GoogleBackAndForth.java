package com.cydeo.tests.day2_locators_getText_getAttribute.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBackAndForth {
    public static void main(String[] args) {
            //TC #3: Back and forth navigation
            //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

            //2- Go to: https://google.com
        driver.get("https://google.com");


            //3- Click to Gmail from top right.
        WebElement gmailLogo = driver.findElement(By.linkText("Gmail"));
        gmailLogo.click();


            //4- Verify title contains: Expected: Gmail
            String expectedTitle = "Gmail";
            String currentTitle = driver.getTitle();

            if(currentTitle.contains(expectedTitle)){
                System.out.println("Gmail title verification passed");
            }else{
                System.out.println("Gmail title verification failed");
            }


            //5- Go back to Google by using the .back();
            driver.navigate().back();


            //6- Verify title equals:Expected: Google
            String expectedTitle2 = "Google";
            String actualTitle = driver.getTitle();

            if(actualTitle.equals(expectedTitle2)){
                System.out.println("Gmail title is equal to expected");
            }else{
                System.out.println("Gmail title is not equal to expected");
            }
        driver.quit();
    }
}
