package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRM_Login_Scenario extends TestBase {

        //1. Create new test and make set ups

    @Test
    public void crm_login_test() {
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username // hr2@cydeo.com
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("hr2@cydeo.com");

        //4. Enter valid password // UserUser
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtil.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_2(){
        
    }



}
