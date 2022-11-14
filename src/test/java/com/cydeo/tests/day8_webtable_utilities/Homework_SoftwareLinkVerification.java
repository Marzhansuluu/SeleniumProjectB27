package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.SmartBearUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Homework_SoftwareLinkVerification extends TestBase {
//    TC #1: Smartbear software link verification
//1. Open browser
//2. Go to website:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3. Enter username: “Tester”
//4. Enter password: “test”
//5. Click to Login button
//6. Print out count of all the links on landing page
//7. Print out each link text on this page
//
//Mini-Task: CREATE A CLASS à SmartBearUtils
//• Create a method called loginToSmartBear
//• This method simply logs in to SmartBear when you call it.
//• Accepts WebDriver type as parameter


    @Test
    public void test1() {
        SmartBearUtil.loginToSmarter(driver);
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
