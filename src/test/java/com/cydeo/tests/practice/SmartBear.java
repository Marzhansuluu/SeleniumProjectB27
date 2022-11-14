package com.cydeo.tests.practice;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SmartBear extends TestBase {


    @Test
    public void test1() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();

        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        List<String> linksText = new ArrayList<>();

        int count = 0;

        for(WebElement eachLink : allLinks){
            count++;
            linksText.add(eachLink.getText());
        }
        System.out.println("count = " + count);
        System.out.println("linksText = " + linksText);


    }

}
