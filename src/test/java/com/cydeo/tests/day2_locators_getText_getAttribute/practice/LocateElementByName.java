package com.cydeo.tests.day2_selenium_elements.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByName {
    public static void main(String[] args) {

        //setup chrome and create web driver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google.com
        driver.navigate().to("https://www.google.com");

        //identify and save the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        
    }

}
