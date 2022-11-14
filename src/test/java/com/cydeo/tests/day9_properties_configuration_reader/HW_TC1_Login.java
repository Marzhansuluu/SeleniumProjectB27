package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_TC1_Login extends TestBase {
    @Test
    public void crm_login_test() {
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get(ConfigurationReader.getProperty("env"));

        //3. Enter valid username // hr2@cydeo.com
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys(ConfigurationReader.getProperty("username"));
        //username.sendKeys("hr2@cydeo.com");

        //4. Enter valid password // UserUser
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        //5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

        //6. Verify title is as expected:
        //Expected: Portal
        //BrowserUtil.verifyTitle(driver, "Portal");

        String expectedTitle = "Portal";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        // hard assert will stop completely once it is failed
        //soft assert will execute the rest of the code also even it is failed.



    }
}
