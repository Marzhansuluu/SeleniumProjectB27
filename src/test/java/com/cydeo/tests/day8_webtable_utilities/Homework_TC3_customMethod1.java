package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework_TC3_customMethod1 extends TestBase {
//TC #3: Create a custom method
//1- Open a chrome browser


//    @Test
//    public void
//2- Go to: https://practice.cydeo.com/tables
//3- Write custom method:
//
//• Method name: getTableGetEmail()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String tableNum
//• Arg3: String firstName

    public static void getTableGetEmail(WebDriver driver,String tableNum, String firstName){
        WebElement email = driver.findElement(By.xpath(""));
    }
}
