package com.cydeo.tests.userStories;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CalendarEvent extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("user12");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");

        WebElement clickBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        clickBtn.click();

        WebElement activitiesBtn = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span"));
        activitiesBtn.click();

        WebElement calendarEventsBtn = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span"));
        calendarEventsBtn.click();

        WebElement createCalendarBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/div/a"));
        createCalendarBtn.click();

        WebElement repeatCheckBox = driver.findElement(By.xpath("//input[@id='recurrence-repeat-view361']"));
        repeatCheckBox.click();

    }

}
