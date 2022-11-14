package com.cydeo.tests.userStories;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserStory2 {
    public static void login(String user) {
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys(user);
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
    }

    public static void managerModules() {

        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        List<String> modulesDisplayed = new ArrayList<>();
        BrowserUtils.sleep(3);

        for (WebElement each : modules) {
            modulesDisplayed.add(each.getText());

        }
        List<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));

        Assert.assertEquals(expectedModules, modulesDisplayed, "User does not have access to the expected modules");

    }

    public static void driversModules()  {


        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> modulesDisplayed = new ArrayList<>();
        BrowserUtils.sleep(2);
        for (WebElement each : modules) {
            modulesDisplayed.add(each.getText());

        }

        List<String> expectedModules = new ArrayList<>(Arrays.asList("Fleet", "Customers", "Activities", "System"));
        Assert.assertEquals(expectedModules, modulesDisplayed, "User does not have access to the expected modules");
    }

    @Test(priority = 1)
    public void storeManager1()  {
        login("storemanager59");
        BrowserUtils.sleep(2);
        managerModules();
        Driver.closeDriver();
    }

    @Test(priority = 2)
    public void storeManager2() {
        login("storemanager62");
        BrowserUtils.sleep(2);
        managerModules();
        Driver.closeDriver();
    }

    @Test(priority = 3)
    public void salesManager1() {
        login("salesmanager109");
        BrowserUtils.sleep(2);
        managerModules();
        Driver.closeDriver();
    }

    @Test(priority = 4)
    public void salesManager2() {
        login("salesmanager112");
        BrowserUtils.sleep(2);
        managerModules();
        Driver.closeDriver();
    }

    @Test(priority = 5)
    public void driver1() {
        login("user12");
        BrowserUtils.sleep(2);
        driversModules();
        Driver.closeDriver();
    }

    @Test(priority = 6)
    public void driver2(){
        login("user18");
        driversModules();
        Driver.closeDriver();
    }

}
