package com.cydeo.tests.day2_locators_getText_getAttribute.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) {
        //TC #1: Etsy Title Verification

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();// webdriver-parent class, reference;  chrome driver child class, obj
        driver.manage().window().maximize();


        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com ");


        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title: Expected: “Wooden spoon | Etsy”
        String expectedInTitle = "Wooden spoon | Etsy"; //local arguments
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification Failed");
        }

        driver.quit();
    }
}
