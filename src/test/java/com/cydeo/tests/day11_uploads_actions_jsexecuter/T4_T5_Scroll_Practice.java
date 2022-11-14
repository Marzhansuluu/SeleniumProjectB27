package com.cydeo.tests.day11_uploads_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_Scroll_Practice {
    @Test
    public void scroll_test(){
        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(1);
        actions.moveToElement(cydeoLink).perform();


//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript()

        //4- Scroll using Actions class “moveTo(element)” method
    }
}
